package adobe;

public class SumOfPowerOfNaturalNumbers {

    static int power(int num, int n)
    {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return power(num, n / 2) * power(num, n / 2);
        else
            return num * power(num, n / 2)
                * power(num, n / 2);
    }
    
    

    static int countWays(int n, int x, int curr_num, int curr_sum){
      
        
        int results = 0;

        // Calling power of 'i' raised to 'n'
        int p = power(curr_num, n);
        while (p + curr_sum < x) {
            // Recursively check all greater values of i
            results += countWays(x, n, curr_num + 1,
                                      p + curr_sum);
            curr_num++;
            p = power(curr_num, n);
        }

        // If sum of powers is equal to x
        // then increase the value of result.
        if (p + curr_sum == x)
            results++;

        // Return the final result
        return results;
        
    }
    static int numOfWays(int n, int x)
    {
        // code here
        return countWays(n, x, 1 , 0);
        
       
    
    }
	
}

package adobe;

public class NextHigherPalindromicNumberUsingSameDigits {
    
	public void swap(char x, char y){
        char temp=x;
        x=y;
        y=temp;
    }
    
    public void reverse(char[] num, int i, int j){
        while (i < j) {
            char temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
    }
    
    public String nextPalin(String s) 
    { 
        //complete the function here
        char[] num=s.toCharArray();
        int n=s.length();
        
        if (n <= 3) {
            // System.out.println("Not Possible");
            return "-1";
        }
        char temp;
         int mid = n / 2 - 1;
        int i, j;
    
        for (i = mid - 1; i >= 0; i--)
            if (num[i] < num[i + 1])
                break;
    
       
        if (i < 0) {
            // System.out.println("Not Possible");
            return "-1";
        }
    
        // Find the smallest digit on right
        // side of ith digit which is greater 
        // than num[i] up to index 'mid'
        int smallest = i + 1;
        for (j = i + 2; j <= mid; j++)
            if (num[j] > num[i] && 
                num[j] <= num[smallest])
                smallest = j;
    
        // swap num[i] with num[smallest]
        temp = num[i];
        num[i] = num[smallest];
        num[smallest] = temp;
        
        
        temp = num[n - i - 1];
        num[n - i - 1] = num[n - smallest - 1];
        num[n - smallest - 1] = temp;
        
        
        reverse(num, i + 1, mid);
    
        
        if (n % 2 == 0)
            reverse(num, mid + 1, n - i - 2);
    
        // else if n is odd, then reverse 
        // digits in the range mid+2 to n-i-2
        else
            reverse(num, mid + 2, n - i - 2);
    
        
        String result=String.valueOf(num);
        
        return result;
    
}
}

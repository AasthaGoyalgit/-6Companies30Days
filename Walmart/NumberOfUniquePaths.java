package Walmart;

public class NumberOfUniquePaths {
	public static int NumberOfPath(int a, int b) 
    {
        if(a==1 || b==1) return 1;
        
        return NumberOfPath(a-1, b) + NumberOfPath(a, b-1);
    }
}

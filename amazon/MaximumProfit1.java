/* Que: In the stock market, a person buys a stock and sells it on some future date.
 *  Given the stock prices of N days in an array A[ ] and a positive integer K,
 *  find out the maximum profit a person can make in at-most K transactions. 
 *  A transaction is equivalent to (buying + selling) of a stock and new transaction 
 *  can start only when the previous transaction has been completed.


		Example 1:
		
		Input: K = 2, N = 6
		A = {10, 22, 5, 75, 65, 80}
		Output: 87
		Explaination: 
		1st transaction: buy at 10 and sell at 22. 
		2nd transaction : buy at 5 and sell at 80.*/


package amazon;
import java.util.*;
public class MaximumProfit1 {

	
	public static int maxProfit(int[] a, int k) {
		int n=a.length;
		int[][] dp=new int[k+1][n];
		
		for(int t=1;t<=k;t++) {
			for(int d=1;d<n;d++) {
				int max=dp[t][d-1];
				
				for(int pp=0;pp<d;pp++) {
					if((dp[t-1][pp] + a[d]-a[pp])>max) {
						max = dp[t-1][pp] + a[d]-a[pp];
					}
				}
				
				dp[t][d]=max;
			}
		}
		return dp[k][n-1];
		
	}
	
	public static int maxProfitOptimized(int[] a, int k) {
		int n=a.length;
		int[][] dp=new int[k+1][n];
		
		for(int t=1;t<=k;t++) {
			int max=Integer.MIN_VALUE;
			for(int d=1;d<n;d++) {
				
				if(dp[t-1][d-1] - a[d-1] >max) max=dp[t-1][d-1] - a[d-1];
				
				if(max + a[d] > dp[t][d-1]) dp[t][d]=max + a[d];
				else dp[t][d]=dp[t][d-1];
			}
		}
		return dp[k][n-1];
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        int maxProfit=maxProfit(a,k);
        int maxProfitOptmized=maxProfitOptimized(a,k);
        System.out.println(maxProfit);
        System.out.println(maxProfitOptmized);
	}

}

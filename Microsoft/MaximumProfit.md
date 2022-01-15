#  Maximum Profit

[![Problem Link](../assets/gfg.svg)](https://practice.geeksforgeeks.org/problems/maximum-profit4657/1)
[![Problem Link](../assets/lc.svg)](...problem...)

In the stock market, a person buys a stock and sells it on some future date. Given the stock prices of N days in an array A[ ] and a positive integer K, find out the maximum profit a person can make in at-most K transactions. A transaction is equivalent to (buying + selling) of a stock and new transaction can start only when the previous transaction has been completed.
### Sample Input
```
2
6
10 22 5 75 65 80
```
### Sample Output
```
87
```

### Solution
```
class Solution {
    static int maxProfit(int K, int N, int a[]) {
        // code here
        // int n=a.length;
		int[][] dp=new int[K+1][N];
		
		for(int t=1;t<=K;t++) {
			int max=Integer.MIN_VALUE;
			for(int d=1;d<N;d++) {
				
				if(dp[t-1][d-1] - a[d-1] >max) max=dp[t-1][d-1] - a[d-1];
				
				if(max + a[d] > dp[t][d-1]) dp[t][d]=max + a[d];
				else dp[t][d]=dp[t][d-1];
			}
		}
		return dp[K][N-1];
    }
}

```

### Accepted
[![image](https://user-images.githubusercontent.com/66162540/149616064-56b832e3-151d-44d0-99f0-6c305366e398.png)](https://practice.geeksforgeeks.org/problems/maximum-profit4657/1)
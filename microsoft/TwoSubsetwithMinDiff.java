/*
 * Given an integer array arr of size N, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum and find the minimum difference


Example 1:

Input: N = 4, arr[] = {1, 6, 11, 5} 
Output: 1
Explanation: 
Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11
 */


package microsoft;

import java.util.Scanner;
import java.util.*;

public class TwoSubsetwithMinDiff {

	
	public static boolean TargetSumSubset(int[] arr, int target) {
		int n=arr.length;
		int sum=target;
		boolean[][] dp=new boolean[n+1][sum+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				
				if(i==0&& j==0) dp[i][j]=true;
				else if(i==0) dp[i][j]=false;
				else if(j==0) dp[i][j]=true;
				else {
					if(dp[i-1][j]==true) dp[i][j]=true;
					else {
						if(arr[i-1]<=j) {
							if(dp[i-1][j-arr[i-1]]==true) dp[i][j]=true;
							else dp[i][j]=false;
						}
						
					}
					
				}
			}
		}
		
		return dp[n][sum];
	}
	
	
	
	public static int MinDiff(int[] arr) {
		int diff=0, n=arr.length, sum=0,min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<n;i++) sum+=arr[i];
		
		for(int i=0;i<=sum/2;i++) 
			if(TargetSumSubset(arr,i)==true) {
				al.add(i);
				max=Math.max(max,i);
			}
		

		diff=sum-(2*max);
		
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
//        int target=sc.nextInt();
        int exist=MinDiff(arr);
        System.out.println(exist);

	}

}

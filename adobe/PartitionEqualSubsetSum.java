package adobe;

import java.util.*;
import java.util.Scanner;

public class PartitionEqualSubsetSum {

	public static boolean IsPossibleTargetSum(int[]arr, int n, int target)
    {
	       boolean[][] dp=new boolean[n+1][target+1];
	       
	       for(int i=0;i<dp.length;i++){
	           for(int j=0;j<dp[0].length;j++){
	               if(i==0 && j==0) dp[i][j]=true;
	               else if(i==0) dp[i][j]=false;
	               else if(j==0) dp[i][j]=true;
	               else{
	                   if(arr[i-1] > j) dp[i][j] = dp[i-1][j] ;
	                   else{
	                       dp[i][j] = (dp[i-1][j] || dp[i-1][j-arr[i-1]]);
	                   }
	               }
	           }
	       }
	       return dp[n][target];
	    }
	    
	
	public static int equalPartition(int n, int arr[])
    {
		int sum=0;
        for(int i=0;i<n;i++) sum+=arr[i];
        
        if(sum%2!=0) return 0;
        else return IsPossibleTargetSum(arr,n,sum/2)? 1:0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
//	         System.out.println("function call");
	        int al=equalPartition(n, arr);
	       System.out.println(al);
	}

}

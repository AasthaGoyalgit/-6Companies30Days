package Intuit;
import java.util.*;

public class PartitionSetIntoSubsetHavingMinimumDiff {

	public static boolean targetSum(int[] arr, int target) {
		int n=arr.length;
		
		boolean[][] dp = new boolean[n+1][target+1];
		
		for(int i=0;i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				if(i==0 && j==0) return true;
				else if(i==0) return false;
				else if(j==0) return true;
				else {
					if(dp[i-1][j] == true) dp[i][j]=true;
					else {
						if(arr[i-1] <= j) {
							if(dp [i-1] [j-arr[i-1]] ==true) dp[i][j]=true;
							else dp[i][j]=false;
						}
					}
				}
			}
		}
		return dp[n][target];
	}
	
	public static int MinDiff(int[] arr,int n) {
		int sum=0, max=Integer.MIN_VALUE;
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<n;i++) sum+=arr[i];
		
		for(int i=0; i<=sum/2;i++) {
			if(targetSum(arr, i) == true) {
				al.add(i);
				max=Math.max(max,i);
			}
		}
		
		int diff = sum - (2*max);
		
		return diff;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int diff = MinDiff(arr,n);
		System.out.println(diff);

	}

}

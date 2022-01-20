package adobe;
import java.util.*;
import java.util.Scanner;

public class SubarrayWithGivenSum {

	
	public static  ArrayList<Integer> Checksum(int[] arr, int n, int s){
		int i=1,j=0,sum=arr[0];
	    ArrayList<Integer> al=new ArrayList<>();
	    
	    while(i<n ) {
	    	
	    	if(sum==s) {
	    		al.add(j);
	    		al.add(i);
	    	}
	    	if(sum>s && j<i) {
	    		sum-=arr[j];
	    		j++;
	    	}
	    	else if(sum<s && i<n) {
	    		sum+=arr[i];
	    		i++;
	    	}
	    }
	    return al;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int s=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	       ArrayList<Integer> al=new ArrayList<>();
	       al=Checksum(arr,n,s);
	       System.out.println(al);
	}

}

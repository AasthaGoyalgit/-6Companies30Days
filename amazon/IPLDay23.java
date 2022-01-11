package amazon;

import java.util.Scanner;
import java.util.*;
public class IPLDay23 {
	
	public static ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k) {
		ArrayList<Integer> al=new ArrayList<>();
        int sum=0,i=0, max=arr[0];
		for( i=0;i<=n-k;i++) {
			int j=i;
			while(j<i+k) {
				max=Math.max(max,arr[j]);
				j++;
			}
			if(i<=n-k) al.add(max);
		}
      return al;
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<>();
        al=max_of_subarrays(a,n,k);
        System.out.println(al);
	}

}

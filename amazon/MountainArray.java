package amazon;

import java.util.Scanner;
/*
 
 7
2 1 4 7 3 2 5

 */
public class MountainArray {
	
	public static int longestMountain(int[] arr) {
		int length=0, i=1, n=arr.length;
		if(n<2) return 0;
		while(i<=n-2) {
				if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
					int j=i;
					int count=1;
					while(j>0 && arr[j]>arr[j-1]) {
						j--;
						count++;
					}
					
					while(i<n-1 && arr[i]>arr[i+1]) {
						i++;
						count++;
						
					}
					length=Math.max(length, count);
				}
				else 
					i++;
		}
		return length;
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
        int length=longestMountain(a);
        System.out.println(length);
	}

}

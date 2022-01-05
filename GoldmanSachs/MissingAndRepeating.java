package GoldmanSachs;
import java.util.*;
public class MissingAndRepeating {

	
	public static int[] MissingAndRepeatingele(int[] arr, int n) {
		 int[] res=new int[2];
			Arrays.sort(arr);
			if(arr[0]!=1) res[1]=1;
			if(arr[arr.length-1]!=n) res[1]=n;
			for(int i=1;i<arr.length;i++) {
				if(arr[i]==arr[i-1]) res[0]=arr[i];
				else if((arr[i]-arr[i-1])!=1) res[1]=arr[i]-1;
			}
			return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       int[] res=new int[2];
       res=MissingAndRepeatingele(arr,n);
       for(int i=0;i<2;i++) {
    	   System.out.print(res[i]+" ");
       }
	}

}

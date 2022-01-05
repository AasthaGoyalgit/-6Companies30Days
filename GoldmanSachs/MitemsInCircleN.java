package GoldmanSachs;
import java.util.*;
public class MitemsInCircleN {

	
	public static int solve(int n, int m, int k) {
		/*int[] a=new int[m];
		for(int i=0;i<m;i++) {
			a[i]=k;
			if(k<n) k++;
			else k=1;
		}
		return k-1;*/
		
		if((n-k+1) >=m) return m-k+1;
		m=m-(n-k+1);
		 return (m%n == 0)? n:(m%n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int k=sc.nextInt();
        int res= solve(n,m,k);
        System.out.println(res);
	}

}

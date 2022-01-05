package GoldmanSachs;
import java.util.*;
public class UglyNo {
	
	// int isUgly(int i){
    
    //   i=maxPowerDivisible(i ,2); 
    //   i=maxPowerDivisible(i ,2); 
    //   i=maxPowerDivisible(i ,2); 
       
    //   if(i==0) return 1;
    //   else return 0;
    // }
    
    // int maxPowerDivisible(int x, int y){
        
    //     while(x%y==0) x=x/y;
    //     return x;
    // }
	public static long getNthUglyNo(int n) {
        
	    //   int i=1;
	    //   long count=1;
	        
	    //     while(n>count){
	    //         i++;
	    //         if(isUgly(i)==1){
	    //             count++;
	    //         }
	    //     }
	    //     return count;
	    
	     long dp[]=new long[n+1];
	    dp[1]=1;
	    
	    int p2=1;
	    int p3=1;
	    int p5=1;
	    
	    for(int i=2;i<=n;i++){
	        long f1=2*dp[p2];
	        long f2=3*dp[p3];
	        long f3=5*dp[p5];
	        
	        long min=Math.min(f1,Math.min(f2,f3));
	        dp[i]=min;
	        
	        if(f1==min) p2++;
	        if(f2==min) p3++;
	        if(f3==min) p5++;
	      }
	      return dp[n];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long res=getNthUglyNo(n);
        System.out.println(res);
	}

}

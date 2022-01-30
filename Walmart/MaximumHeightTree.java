package Walmart;

public class MaximumHeightTree {
	 static int height(int N){
	        // code here
	        // boolean flag = false;
	        if(N==0) return 0;
	        
	        int k=1, ans=0;
	        while( (k*(k+1)/2) <= N){
	           ans=k;
	           k++;
	        }
	        return ans;
	        
	    }
}

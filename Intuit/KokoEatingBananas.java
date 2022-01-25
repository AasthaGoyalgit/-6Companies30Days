package Intuit;
import java.util.*;
public class KokoEatingBananas {
	 public boolean isPossible(int mid, int h, int[] piles){
	       
	        
	        int totalhrs=0;
	        
	        for(int i=0;i<piles.length;i++){
	           totalhrs += (int)Math.ceil( piles[i]*1.0 /mid);
	        }
	        
	        
	        return totalhrs<= h;
	    }
	    
	    public int minEatingSpeed(int[] piles, int h) {
	        
	        int max=Integer.MIN_VALUE;
	        
	        for(int i=0;i<piles.length;i++) max=Math.max(piles[i], max); 
	        
	        int low=0, high=max,speed=Integer.MAX_VALUE;
	        
	        while(low<=high){
	            int mid = low + (high-low)/2;
	            
	            if(isPossible(mid, h, piles) == true){
	                speed=mid;
	                high=mid-1;
	            }
	            else {
	                low=mid+1;
	            }
	            
	            
	        }
	        return speed;
	    }
	
}

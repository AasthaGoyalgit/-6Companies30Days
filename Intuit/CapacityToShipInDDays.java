package Intuit;

public class CapacityToShipInDDays {
	 public boolean isPossible(int[] weights, int mid, int days ){
	        int day_count = 1;
	        int tot_day=0;
	        
	        for(int i=0;i<weights.length;i++){
	            tot_day+=weights[i];
	            
	            if(tot_day > mid){
	                day_count++;
	                tot_day=weights[i];
	            }
	        }
	        return (day_count <= days);
	    }
	    
	    
	    public int shipWithinDays(int[] weights, int days) {
	        
	        int n=weights.length, max=Integer.MIN_VALUE, sum=0;
	        
	        for(int i=0; i<n; ++i){
	           max=Math.max(max, weights[i]);
	           sum+=weights[i];
	        }
	        
	        if(days==n) return max;
	        
	        int low=max, high=sum;
	        int capacity=0;
	        
	        while(low <= high){
	            int mid = low + (high-low)/2;
	            
	            if(isPossible(weights, mid, days) == true){
	                capacity=mid;
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        return capacity;
	    }
}

package Intuit;

public class SplitArrayLargestSum {
	  public boolean isPossible(int[] arr, int mid, int m){
	        int subarray=1;
	        int sum=0;
	        
	        for(int i=0;i<arr.length;i++){
	            sum+=arr[i];
	            
	            if(sum>mid){
	                subarray++;
	                sum=arr[i];
	            }
	        }
	        return (subarray <= m);
	    }
	    
	    
	    
	    public int splitArray(int[] nums, int m) {
	        int max=0, sum=0;
	        
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            max=Math.max(nums[i], max);
	        }
	        
	        if(m==nums.length) return max;
	        
	        int low=max;
	        int high=sum;
	        int ans=0;
	        
	        while(low <= high){
	            int mid= low+ (high-low)/2;
	            
	            if(isPossible(nums,mid,m)==true){
	               ans=mid;
	               high=mid-1;
	                
	            }
	            else{
	               low=mid+1; 
	            }
	        }
	        return ans;
	    }
}

package GoldmanSachs;

public class MinSizeSubArrSum {

	
	 public static int minSubArrayLen(int target, int[] nums) {
	        int res=Integer.MAX_VALUE;
	        int left=0;
	        int sum=0;
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            while(sum>=target){
	                sum-=nums[left];
	                res=Math.min(res, i-left+1);
	                left++;
	                
	            }
	        }
	        return (res==Integer.MAX_VALUE)?0:res;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {13, 11, 9, 3, 7 ,1};
	    int target=4;
	    int res=minSubArrayLen(target,nums);
	     System.out.println(res);
		
	}

}

package Walmart;
import java.util.*;
public class KthLargestIntegerInArray {
	public String kthLargestNumber(String[] nums, int k) {
	      if(k>nums.length) return "-1";
	        
	     //min heap
	      PriorityQueue<String> pq=new PriorityQueue<>(new StringCompare());
	    
	      for(int i=0;i<nums.length; i++){
	           pq.add(nums[i]);
	         
	      }
	      int i=1;
	      while(i<= nums.length-k){
	            pq.remove();
	            i++;
	        }
	        return pq.peek();
	 
	     }
	    
	      class StringCompare implements Comparator<String> {
	        @Override
	        public int compare(String a, String b) {
	            if(a.length() > b.length()) return 1;// If the length of string a is more, then it will have bigger value. So, return 1 
	            else if(a.length() < b.length()) return -1;
	            return a.compareTo(b);     // If the strings have same length, then compare i.e, ( a - b > 0 ?)
	        }
	    }
}

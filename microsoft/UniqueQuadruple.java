/*
 * Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.

	Example 1:
	
	Input:
	N = 5, K = 3
	A[] = {0,0,2,1,1}
	Output: 0 0 1 2 $
	Explanation: Sum of 0, 0, 1, 2 is equal
	to K.
 */


package microsoft;
import java.util.*;
public class UniqueQuadruple {

	public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        
        if(arr==null || arr.length==0) return al;
       
        int i=0, j=0,n=arr.length;
        
        Arrays.sort(arr);
        
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    
                    int left=j+1, right=n-1;
                    
                    int target2 = k-(arr[i]+arr[j]);
                        
                    while(left<right){
                       
                       int two_sum=arr[left]+arr[right]; 
                        
                       if( two_sum < target2){
                           left++;
                       }
                       else if(two_sum > target2){
                           right--;
                       }
                       else{
                           ArrayList<Integer> sublist=new ArrayList<>();
                           
                           sublist.add(arr[i]);
                           sublist.add(arr[j]);
                           sublist.add(arr[left]);
                           sublist.add(arr[right]);
                           al.add(sublist);
                           
                            while(left<right && arr[left]==sublist.get(2)) left++;
                
                            while(left<right && arr[right]==sublist.get(3)) right--;
                       }
                  
                    }
                
                while(j+1<n && arr[j+1]==arr[j]) j++;
                
            }
        while(i+1<n && arr[i+1]==arr[i]) i++;
        } 
        return al;
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

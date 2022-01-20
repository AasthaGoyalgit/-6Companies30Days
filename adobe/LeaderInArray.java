package adobe;
import java.util.*;
public class LeaderInArray {

	  static ArrayList<Integer> leaders(int arr[], int n){
	        // Stack<Integer> st=new Stack<>();
	        
	        
	       ArrayList<Integer> al = new ArrayList<Integer>();
	       int leader = arr[arr.length - 1];
	       
	       for(int i = arr.length-1 ; i >= 0 ; i--)
	       {
	           if(arr[i] >= leader)
	           {
	               leader = arr[i];
	               al.add(leader);
	           }
	       }
	       Collections.reverse(al);
	       return al;
	       
	       
	       
//	         HashSet<Integer> st=new HashSet<>();
//	 		ArrayList<Integer> al=new ArrayList<>();
			
	// // 		int max=arr[n-1];
	// // 		st.push(max);
			
	// // 		int i=n-2;
			
	// // 		while(i>0) {
	// // 			if(arr[i] > arr[i-1] && arr[i]>max) {
	// // 				 max=arr[i];
	// // 				 st.push(arr[i]);
	// // 			}
	// // 			i--;  
	// // 		}
//	 		 int max_from_right =  arr[n-1];
	  
//	         /* Rightmost element is always leader */
//	       	st.put(max_from_right);
	      
//	         for (int i = n-2; i >= 0; i--)
//	         {
//	             if (max_from_right < arr[i])
//	             {          
//	             max_from_right = arr[i];
//	             st.put(max_from_right);
//	             }
//	         }  
	// //		while(st.size()>0) {
	// //			System.out.println(st.peek());
	// //			st.pop();
	// //		}
			
	// // 		while(st.size()>0) {
	// // 			int k=st.pop();
	// // 			al.add(k);
				
	// // 		}

//	       for(int key: st.keySet()){
//	           al.add(key);
//	       }
//	 		return al;
	    }
}

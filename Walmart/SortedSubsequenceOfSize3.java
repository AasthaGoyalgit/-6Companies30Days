package Walmart;
import java.util.*;
public class SortedSubsequenceOfSize3 {
	 ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
	        ArrayList<Integer> res= new ArrayList<>();
	        Stack<Integer> s=new Stack<>();
	        
	        for(int i=n-1; i>=0; i--){
	            while(!s.isEmpty() && s.peek() <= arr.get(i)) s.pop();
	            
	            s.push(arr.get(i));
	            if(s.size() == 3) break;        
	        }
	        
	        if(s.size() >= 3){
	            for(int i=0; i<=2; i++){
	                res.add(s.pop());
	            }
	        }
	        
	        return res;
	    }
}

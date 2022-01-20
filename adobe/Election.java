package adobe;
import java.util.*;
public class Election {

	
	 public static String[] winner(String arr[], int n)
	    {
	        // add your code
	        HashMap<String, Integer> hm=new HashMap<>();
	        ArrayList<String> al=new ArrayList<>();
	        
	        for(int i=0;i<n;i++){
	            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1 );
	        }
	        
	        
	        int max=0;
	        for(String key:hm.keySet()){
	            if(hm.get(key) > max)
	                max=hm.get(key);
	        }
	        for(String key:hm.keySet()){
	            if(hm.get(key)==max) al.add(key);
	        }
	        
	         Collections.sort( al );
	         
	         String[] res=new String[2];
	         res[0]=al.get(0);
	         res[1]=Integer.toString(max);
	       return res;  
	    }
	

}

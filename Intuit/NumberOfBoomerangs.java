package Intuit;
import java.util.*;
public class NumberOfBoomerangs {
	  public int numberOfBoomerangs(int[][] points) {
	       HashMap<Integer, Integer> hm=new HashMap<>(); 
	        
	        int  boomerangs=0;
	        
	        for(int i=0; i<points.length; i++){
	            for(int j=0; j<points.length; ++j){
	                if(i==j) continue;
	                
	               int distance= ((points[i][0] - points[j][0])*(points[i][0] - points[j][0])) +
	                          ((points[i][1] - points[j][1])*(points[i][1] - points[j][1]));
	                
	                hm.put(distance, hm.getOrDefault(distance, 0)+1);
	                
	            }
	            for(Integer distance : hm.values())
	            boomerangs +=  distance*( distance-1);
	            
	        hm.clear();
	        }
	        
	        
	        return boomerangs;
	    }
}

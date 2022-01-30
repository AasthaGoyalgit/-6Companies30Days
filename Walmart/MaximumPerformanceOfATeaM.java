package Walmart;
import java.util.*;
public class MaximumPerformanceOfATeaM {
	  class Engineer{

		    int speed;
		    int efficieny;

		    Engineer(int speed, int efficieny){
		        this.speed = speed;
		        this.efficieny = efficieny;
		    }

		}

		public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
		    
		    ArrayList<Engineer> list = new ArrayList<>();
		    for(int i=0 ; i < speed.length; i++)
		        list.add(new Engineer(speed[i], efficiency[i]));
		    

		    list.sort((a,b) -> (b.efficieny - a.efficieny));
		    PriorityQueue<Integer> minheap = new PriorityQueue();

		    long sum = 0, sp =0;
		    long mod=1000000007;
		        
		    for(Engineer engineer: list){
		        minheap.add(engineer.speed);
		        sp += engineer.speed;
		        if(minheap.size()>k)
		            sp -= minheap.poll();
		       
		        sum = Math.max(sum,sp * engineer.efficieny);
		    }
		   
		    return (int ) (sum % mod);
//		     public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
		        
		    }
}

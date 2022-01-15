/*
 * Given an infinite number line. You start at 0 and can go either to the left or to the right. The condition is that in the ith move, youmust take i steps. Given a destination D , find the minimum number of steps required to reach that destination.

	Example 1:
	
	Input: D = 2
	Output: 3
	Explaination: The steps takn are +1, -2 and +3.
 */


package microsoft;

public class MinStepsToDestination {

	
	 static int minSteps(int D){
	        
	        
	        int target = Math.abs(D), sum = 0, step = 0;
	       
	       while(sum < target || (sum-target)%2 != 0)
	       {
	           step++;
	           sum += step;
	       }
	       return step;
	    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

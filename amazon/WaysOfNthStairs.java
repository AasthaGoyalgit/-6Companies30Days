package amazon;
import java.util.*;
public class WaysOfNthStairs {

	
	 //when order does not matter.
	public static Long countWays(int m)
    {
        // your code here
        if(m==1) return (long)1;
        if(m%2==0) return countWays(m-1)+1;
        else return countWays(m-1);
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        long countways=countWays(m);
        System.out.println(countways);
	}

}

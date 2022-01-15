/*
 * Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i]amount of money present in it.

	Example 1:
	
	Input:
	n = 6
	a[] = {5,5,10,100,10,5}
	Output: 110
	Explanation: 5+100+5=110
 */

package microsoft;

public class SticklerThief {

	
	public int FindMaxSum(int arr[], int n)
    {
    //   int [] include=new int[n];
    //   int[] exclude=new int[n];
       
       int include=arr[0];
       int exclude=0;
       
       for(int i=1;i<n;i++){
           
           //current will include only if previous id exclude
         int new_include=exclude+arr[i]; 
          
          //current can be exclude by including and excluding prev but we take max of them
          int new_exclude=Math.max(include,exclude);
          
          include= new_include;
          exclude= new_exclude;
          
       }
      return Math.max(include,exclude);
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

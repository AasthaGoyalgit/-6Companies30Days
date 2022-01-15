/*
 * 
 * Given a binary tree and an integer X. Your task is to complete the function countSubtreesWithSumX() that returns the count of the number of subtress having total node’s data sum equal to the value X.
	Example: For the tree given below:            
	
	              5
	            /    \
	        -10     3
	        /    \    /  \
	      9     8  -4 7
	
	Subtree with sum 7:
	             -10
	            /      \
	          9        8
	
	and one node 7.
	
	Example 1:
	
	Input:
	       5
	    /    \
	  -10     3
	 /   \   /  \
	 9   8 -4    7
	X = 7
	Output: 2
	Explanation: Subtrees with sum 7 are
	[9, 8, -10] and [7] (refer the example
	in the problem description).
 */

package microsoft;
import java.util.*;
public class CountNumberSubTreesHavingGivenSum {
	class Node
	{
	    int data;
	    Node left,right;
	    Node(int d)
	    {
	        data=d;
	        left=right=null;
	    }
	 int count;
	    private int subTreeSum(Node root, int X){
	        if(root==null) return 0;
	        int sum = root.data + subTreeSum(root.left, X) + subTreeSum(root.right, X);
	        if(sum==X) count++;
	        return sum;
	    }
	    
	   
	    //Function to count number of subtrees having sum equal to given sum.
	    int countSubtreesWithSumX(Node root, int X)
	    {
		//Add your code here.
	      count = 0;
		    subTreeSum(root, X);
		    return count;
	    }
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

package Walmart;

public class TransformToSumTree {
	
	class Node{
	    int data;
	    Node left,right;
	    Node(int d){
	    	data=d;
	    	left=null;
	    	right=null;
	    }
	}
	 public int sumTree(Node root){
	        
	        if(root == null) return 0;
	         
	        int leftSum = sumTree(root.left);
	        
	        int rightSum = sumTree(root.right);
	        int temp = root.data;
	        root.data = leftSum + rightSum ;
	        return leftSum + rightSum + temp;
	    //   return root.data; 
	    }
	    public void toSumTree(Node root){
	         //add code here.
	        sumTree(root);
	    //   root.data=temp;
	        
	    }
}

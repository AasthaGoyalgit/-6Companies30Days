/*
 * Given a binary tree, connect the nodes that are at same level. You'll be given an addition nextRight pointer for the same.

	Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node.
	       10                       10 ------> NULL
	      / \                       /      \
	     3   5       =>     3 ------> 5 --------> NULL
	    / \     \               /  \           \
	   4   1   2          4 --> 1 -----> 2 -------> NULL
	
	 
	
	Example 1:
	
	Input:
	     3
	   /  \
	  1    2
	Output:
	3 1 2
	1 3 2
 */

package microsoft;
import java.util.*;
public class ConnectNodesAtSameLevel {

//	 Node class is Defined as follows:
		    class Node{
		        int data;
		        Node left;
		        Node right;
		        Node nextRight;
		        Node(int data){
		            this.data = data;
		            left=null;
		            right=null;
		            nextRight = null;
		        }
		    }
	
	public void connect(Node root)
    {
       //previous node present the same level
       Node previousNode;
       Node temp=null;
       Queue<Node> q=new LinkedList<>();
       q.offer(root);
       
       //starts new level
       while(!q.isEmpty()){
           int size=q.size();
           
           previousNode = null;
           
           while(size > 0){
              temp =q.remove();
              
              if(previousNode !=null) previousNode.nextRight = temp;
              
              previousNode=temp;
              
              if(temp.left != null) q.add(temp.left);
              if(temp.right != null) q.add(temp.right);
              
              size--;
           }
           
       }
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

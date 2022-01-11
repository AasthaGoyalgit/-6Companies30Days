package amazon;
import java.util.*;


public class BurningTree {
	
	static class Node{
		int key;
		Node left,right;
		
		Node(int item){
			key=item;
			left=right=null;
		}
	}
	
	static Node root;
	Node temp=root;
	
	
	 public static int TimeToTraverse( HashMap<Node, Node> pmp, Node targetNode){
	        Queue<Node> q=new LinkedList<>();
	        q.add(targetNode);
	        
	        HashMap<Node , Integer> vis=new HashMap<>();
	        vis.put(targetNode,1);
	        int minTime=0;
	        
	        while(!q.isEmpty()){
	            int sz=q.size();
	            int flag=0;
	            
	            for(int i=0;i<sz;i++){
	                Node node=q.poll();
	                
	                if(node.left!=null && vis.getOrDefault(node.left,0)==0){
	                    vis.put(node.left,1);
	                    q.offer(node.left);
	                    flag=1;
	                }
	                
	                if(node.right!=null && vis.get(node.right)==null){
	                    vis.put(node.right,1);
	                    q.offer(node.right);
	                    flag=1; 
	                }
	                
	                if(pmp.get(node)!=null && vis.get(pmp.get(node))==null){
	                    vis.put(pmp.get(node),1);
	                    q.offer(pmp.get(node));
	                    flag=1;
	                }
	            }
	            
	            if(flag==1) minTime++;
	        }
	        
	        return minTime;
	    }
	    
	    
	    public static Node bfsToMapParent(Node root,  HashMap<Node, Node> pmp, int target){
	        
	        Queue<Node> q=new LinkedList<>();
	        q.add(root);
	        Node res=null;
	        
	        //poll==pop offer==push
	        while(!q.isEmpty()){
	            Node node=q.poll();
	            if(node.key==target) res=node;
	            if(node.left!=null){
	               pmp.put(node.left, node);
	               q.offer(node.left);
	            }
	            if(node.right!=null){
	               pmp.put(node.right, node);
	               q.offer(node.right); 
	            }
	        }
	        
	        return res;
	    }
	    
	    
	    public static int minTime(Node root, int target) 
	    {
	        // Your code goes here
	        HashMap<Node, Node> pmp=new HashMap<>();
	        Node targetNode = bfsToMapParent(root, pmp, target);
	        int minTime=TimeToTraverse(pmp, targetNode);
	        return minTime;
	    }
	    
	    
	    
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(20);
		root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
		int target=2;
		minTime(root,target);

	}

}

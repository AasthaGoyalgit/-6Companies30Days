/*
 * Given a Graph of V vertices and E edges and another edge(c - d), the task is to find if the given edge is a Bridge. i.e., removing the edge disconnects the graph.

 

	Example 1:
	
	Input:
	
	c = 1, d = 2
	Output:
	1
	Explanation:
	From the graph, we can clearly see that
	blocking the edge 1-2 will result in 
	disconnection of the graph. So, it is 
	a Bridge and thus the Output 1.
 */

package microsoft;
import java.util.*;
public class BridgeEdgeInGraph {

	
	 static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
	    {
	       
	       //remove edge btw c to d and d to c
	       
	       adj.get(c).remove(new Integer(d));
	       adj.get(d).remove(new Integer(c));
	       
	       Queue<Integer> q=new LinkedList<>();
	       boolean[] visited=new boolean[V];
	       
	       q.offer(c);
	       visited[c]=true;
	       
	       
	       while(!q.isEmpty()){
	           int temp=q.poll();
	           for(Integer v:adj.get(temp)){
	               if(!visited[v]){
	                   q.offer(v);
	                   visited[v]=true;
	               }
	           }
	       }
	       if(visited[d]) return 0;
	       return 1;
	    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

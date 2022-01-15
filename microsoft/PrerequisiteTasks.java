/*
 * There are a total of N tasks, labeled from 0 to N-1. Some tasks may have prerequisites, for example to do task 0 you have to first complete task 1, which is expressed as a pair: [0, 1]
	Given the total number of tasks N and a list of prerequisite pairs P, find if it is possible to finish all tasks.
	
	
	Example 1:
	
	Input: 
	N = 4, P = 3
	prerequisites = {{1,0},{2,1},{3,2}}
	Output:
	Yes
 */

package microsoft;
import java.util.*;
public class PrerequisiteTasks {
	
	
	public boolean isPossible(int n, int[][] prerequisites)
    {
        // Your Code goes here
        if(n==1) return true;
        
        //graph
        List<List<Integer>> graph=buildGraph(n, prerequisites);
        
        //we need to check whether cycle exist or not
        //if cycle exist return false
        // else return true;
        
        return !isCycle(graph,n);
        
    }
    
    public boolean isCycle(List<List<Integer>> graph, int n){
        boolean[] visited = new boolean[n];
        boolean[] recursionStack = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(isCycleDetected(graph,i,visited,recursionStack))
             return true;
        }
        return false;
    }
    
    public boolean isCycleDetected(List<List<Integer>> graph, int node, boolean[] visited,
    boolean[] recursionStack){
        if(recursionStack[node]) return true; //Rstack=true => cycle
        if(visited[node]) return false; //Rstack=false and vis=true => no cycle  
        
        visited[node]=true;
        recursionStack[node]=true;
        
        List<Integer> children = graph.get(node);
        for(Integer child:children){
          if( isCycleDetected(graph,child,visited,recursionStack) ) 
           return true;
          
        }
        recursionStack[node]=false;
    return false;
    }
    
    public List<List<Integer>>buildGraph(int n, int[][] prerequisites){
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] pre: prerequisites){
            graph.get(pre[0]).add(pre[1]);
        }
        
        return graph;
    }

	

}

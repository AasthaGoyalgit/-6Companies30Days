package Intuit;
import java.util.*;
public class CourseSchedule2 {
	 private boolean isCyclic(int u,List<Integer>[] adj, List<Integer> s, int[] visited){
	       visited[u]=1;
	       
	       
	       for(int v:adj[u]){
	           if(visited[v] == 1) return true;
	           if(visited[v] == 0 && isCyclic(v,adj,s ,visited) ) return true;
	       }
	       
	       visited[u]=2;
	       s.add(u);
	       return false;
	       
	   }
	     public int[] findOrder(int numCourses, int[][] prerequisites)      
	     {
	         
	        //adjacency array of list to store incident vertices
	        List<Integer>[] adj = new LinkedList[numCourses];
	        
	        //initialise array with linkedlists
	        for(int i=0; i <numCourses; ++i) adj[i]=new LinkedList<Integer>();
	         
	         //initialise value to adjaceny value
	         for(int[] courses : prerequisites) adj[courses[1]].add(courses[0]);
	         
	         
	         //taken a linkedlist which act as a stack
	         List<Integer> s = new LinkedList<>();
	         
	         int[] visited = new int[numCourses];
	         
	         for(int i=0; i<numCourses; ++i)
	             if(visited[i] == 0 && isCyclic(i,adj,s ,visited) ) return new int[0];
	         
	         Collections.reverse(s);
	         
	         int[] result = s.stream().mapToInt(Integer::intValue).toArray();
	         
	         return result;
	         
	         
	    }
}

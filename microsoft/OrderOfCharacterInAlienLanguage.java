/*
 * Given a sorted dictionary of an alien language having N words and k starting alphabets of standard dictionary. Find the order of characters in the alien language.
	Note: Many orders may be possible for a particular test case, thus you may return any valid order and output will be 1 if the order of string returned by the function is correct else 0 denoting incorrect string returned.
	 
	
	Example 1:
	
	Input: 
	N = 5, K = 4
	dict = {"baa","abcd","abca","cab","cad"}
	Output:
	1
 */

package microsoft;
import java.util.*;
public class OrderOfCharacterInAlienLanguage {

	
	private void dfsCheck(ArrayList<ArrayList<Integer>> adj, int i, Stack<Integer> st, boolean[] vis) {
		vis[i]=true;
		
		for(int it:adj.get(i)) {
			if(vis[it]==false) {
				dfsCheck(adj,it,st,vis);
			}
		}
		
		st.push(i);
	}
	
	
	private String topologicalSort(ArrayList<ArrayList<Integer>> adj,int n) {
		Stack<Integer> st=new Stack<>();
		boolean vis[]=new boolean [n];
		
				
		for(int i=0;i<n;i++) {
			if(vis[i]==false) {
				dfsCheck(adj,i,st,vis);
			}
		}
		
		String str="";
		while(!st.isEmpty()) {
		   char c=(char)(st.pop()+'a');
		   str+=Character.toString(c);
		}
		
		return str;
		
	}
    
    
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
          ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		  for(int i=0;i<K;i++) {
			  adj.add(i,new ArrayList<>());
		  }
		  
		  	for(int i=0;i<dict.length-1;i++) {
		  		for(int j=0;j<Math.min(dict[i].length(),dict[i+1].length());j++) {
		  			if(dict[i].charAt(j)!=dict[i+1].charAt(j)) {
		  				adj.get(dict[i].charAt(j)-'a').add(dict[i+1].charAt(j)-'a');
		  				break;
		  			}
		  		
		  		} 
		  	}
	
		  	OrderOfCharacterInAlienLanguage obj=new OrderOfCharacterInAlienLanguage();
		  	String str=obj.topologicalSort(adj, K);
		  	
		  
	         return str;
        
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

package Intuit;

public class NumberOfProvinces {
	 private void dfs(int[][] isConnected, int i){
	        //mark visited
	        isConnected[i][i] = 0;
	        
	        //check its row if anyone is connected and not visited
	        for(int j=0;j<isConnected.length; j++){
	            if(isConnected[i][j] == 1){
	                isConnected[i][j] = 0;
	                if(isConnected[j][j] == 1){
	                    dfs(isConnected, j);
	                }
	            }
	        }
	    }
	    
	    public int findCircleNum(int[][] isConnected) {
	       int No_Prov=0;
	       int n=isConnected.length;
	        
	        for(int i=0;i<n;i++){
	            
	            //visited
	            if(isConnected[i][i] == 0) continue;
	            
	            //not visited, increment no of provinces, and call dfs i.e check its neighbour
	            No_Prov++;
	            dfs(isConnected, i);
	            
	        }
	        
	        return No_Prov;
	    }
}

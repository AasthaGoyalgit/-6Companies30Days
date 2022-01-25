package Intuit;
import java.util.*;
public class PacificAtlanticWaterFlow {
	 
    public  void dfs(int[][] heights, int row, int col, int prev, int[][] ocean){
        int m=heights.length, n=heights[0].length;
        
        if(row<0 || col<0 || row>=m || col>=n) return;
        
        if(heights[row][col]<prev) return;
        
        if(ocean[row][col]==-1) return;
        
        ocean[row][col]=-1;
        
         dfs(heights, row+1, col, heights[row][col], ocean);
        dfs(heights, row-1, col, heights[row][col], ocean);
        dfs(heights, row, col+1, heights[row][col], ocean);
        dfs(heights, row, col-1, heights[row][col], ocean);
        
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int m=heights.length, n=heights[0].length;
        
        if(m==0 || n==0) return result;
        
        int[][] pacific=new int[m][n];
        int[][] atlantic=new int[m][n];
        
        for(int col=0; col<n; col++){
            dfs(heights, 0, col, Integer.MIN_VALUE, pacific);
            dfs(heights, m-1, col, Integer.MIN_VALUE, atlantic);
        }
        
        for(int row=0; row<m; row++){
            dfs(heights, row, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, row, n-1, Integer.MIN_VALUE, atlantic);
        }
        
        ArrayList<Integer> al;
        
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
                if(pacific[i][j] == -1 && pacific[i][j] == atlantic[i][j]){
                    al=new ArrayList<>();
                    al.add(i);
                    al.add(j);
                    result.add(al);
                    
                }
            }
        }
        
        return result;
    }
}

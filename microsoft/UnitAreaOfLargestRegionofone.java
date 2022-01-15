/*
 * Given a grid of dimension nxm containing 0s and 1s. Find the unit area of the largest region of 1s.
	Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).
	 
	
	Example 1:
	
	Input: grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}}
	Output: 5
	Explanation: The grid is-
	1 1 1 0
	0 0 1 0
	0 0 0 1
	The largest region of 1's is colored
	in orange.
 */


package microsoft;
import java.util.*;
public class UnitAreaOfLargestRegionofone {

	
	static int ROW, COL, count;
    
    boolean isSafe(int[][] M, int row, int col,
                        boolean[][] visited)
  {
      // row number is in range, column number is in
      // range and value is 1 and not yet visited
      return (
          (row >= 0) && (row < ROW) && (col >= 0)
          && (col < COL)
          && (M[row][col] == 1 && !visited[row][col]));
  }

  // A utility function to do DFS for a 2D boolean
  // matrix. It only considers the 8 neighbours as
  // adjacent vertices
  void DFS(int[][] M, int row, int col,
                  boolean[][] visited)
  {
      // These arrays are used to get row and column
      // numbers of 8 neighbours of a given cell
      int[] rowNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
      int[] colNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };

      // Mark this cell as visited
      visited[row][col] = true;

      // Recur for all connected neighbours
      for (int k = 0; k < 8; k++) 
      {
          if (isSafe(M, row + rowNbr[k], col + colNbr[k],
                     visited)) 
          {
              // increment region length by one
              count++;
              DFS(M, row + rowNbr[k], col + colNbr[k],
                  visited);
          }
      }
  }
  
  
  //Function to find unit area of the largest region of 1s.
  public int findMaxArea(int[][] grid)
  {
      // int max_count=0;
      // int count_for_curr=0;
      // int count=0;
      // // Code here
      // for(int i=0;i<grid.length;i++){
      //     for(int j=0;j<grid[0].length;j++){
              
      //         if(grid[i][j]==1){
      //             count_for_curr=count_one(grid,i,j,count);
      //             max_count=Math.max(max_count, count_for_curr);
      //         }
      //     }
      // }
      // return max_count;
      
        int result=0;
     for(int i=0;i<grid.length;i++) {
         for(int j=0;j<grid[0].length;j++) {
             if(grid[i][j] == 1) {
                 int num = search(i,j,grid);
                 result = result > num ? result : num;
             }
         }
     }
     return result;
  }
  
   public int search(int i,int j, int[][]grid) {
     
     if(i < 0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 ) 
         return 0;
     
     grid[i][j] = 0;
     int sum = 0;
     sum += search(i+1,j,grid);
     sum += search(i,j+1,grid);
     sum += search(i,j-1,grid);
     sum += search(i-1,j,grid);
     
     sum += search(i+1,j+1,grid);
     sum += search(i-1,j-1,grid);
     sum += search(i+1,j-1,grid);
     sum += search(i-1,j+1,grid);
     return sum + 1;
 }
  
  public int count_one(int[][] grid, int row,int col,int count){
     if(row<0 || col<0 || col>grid[0].length || row>grid.length) return 0;
      
     if(grid[row][col]==0) return 0;
      
      count=1;
      grid[row][col]=0;
     
      
      for(int r=row-1; r<=row+1;r++){
          for(int c=col-1; c<=col+1;c++){
              if(r!=row && c!=col){
                 count+=count_one(grid,r,c,count);
              }
          }
      }
      return count;
  }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

package Intuit;
import java.util.*;
public class AsFarLandAsPossible {
	 class Pair{
	        int row;
	        int col;
	        
	        Pair(int row, int col){
	            this.row=row;
	            this.col=col;
	        }
	    }
	    
	    public int maxDistance(int[][] grid) {
	        Queue<Pair> queue=new LinkedList<>();
	        int r =grid.length, c=grid[0].length;
	        
	        
	        for(int i=0; i<r;i++){
	            for(int j=0;j<c;j++){
	                if(grid[i][j] == 1)
	                    queue.add(new Pair(i,j));
	            }
	        }
	        
	        
	        if(queue.size()==0 || queue.size()== r*c) return -1;
	        
	        int[][] dirs={{0,1}, {1,0}, {0,-1}, {-1,0}};
	        
	        int level=-1;
	        
	        while(queue.size()>0){
	            level++;
	            int size=queue.size();
	            
	            while(size-- >0){
	                Pair rem= queue.remove();
	                
	                for(int i=0;i<4; i++){
	                    int rowdash=rem.row + dirs[i][0];
	                    int coldash= rem.col + dirs[i][1];
	                    
	                    if(rowdash<0 || coldash<0 || rowdash>=r || coldash>=c || grid[rowdash][coldash]==-1 || grid[rowdash][coldash]==1) continue;
	                    
	                    queue.add(new Pair(rowdash, coldash));
	                    
	                    grid[rowdash][coldash]=-1;
	                }
	            }
	        }
	        return level;
	    }
}

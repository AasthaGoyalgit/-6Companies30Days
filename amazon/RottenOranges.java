package amazon;
import java.util.*;
public class RottenOranges {
	
	public static int rotten(int [][]grid) {
		int minTime=0, oranges=0, cnt=0;
		
		if(grid== null || grid.length==0) return 0;
		
		
		Queue<int[]> q=new LinkedList<>();
		
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]!=0) oranges++;
				if(grid[i][j]==2) q.offer(new int[] {i,j});
			}
		}
		
		if(oranges==0) return 0;
		
		/*1 0,  0 1, -1 0, 0 -1*/
		
		int[] dx= {1,0,-1,0};
		int[] dy= {0,1,0,-1};
		
		
		while(q.size()>0) {
			int k=q.size();
			cnt+=k;
			
			for(int i=0;i<k;i++) {
				int[] point=q.poll();
				
				for(int j=0;j<4;j++) {
					int x=point[0]+dx[j];
					int y=point[1]+dy[j];
					
					if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==0 || grid[x][y]==2) continue;
					
					grid[x][y]=2;
					q.offer(new int[] {x,y});
				}
				
				
			}
			if(q.size()>0) minTime++;
			
		}
		if(cnt==oranges) return minTime;
		return -1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] grid={{2,1,1},{1,1,0},{0,1,1}};
        int min=rotten(grid);
        System.out.println(min);
	}

}

package Intuit;
import java.util.*;
public class ConstructQuadTree {
	
	
	class Node {
	    public boolean val;
	    public boolean isLeaf;
	    public Node topLeft;
	    public Node topRight;
	    public Node bottomLeft;
	    public Node bottomRight;

	    
	    public Node() {
	        this.val = false;
	        this.isLeaf = false;
	        this.topLeft = null;
	        this.topRight = null;
	        this.bottomLeft = null;
	        this.bottomRight = null;
	    }
	    
	    
private Node constructRec(int[][] grid, int left, int right, int top, int bottom){
    int val = grid[top][left];
    boolean breakFurther = false;
    
    for(int i=top; i<bottom && !breakFurther; i++)
        for(int j=left;j<right;j++)
            if(grid[i][j]!=val){
                breakFurther = true;
                break;
            }
    if(!breakFurther)
        return new Node(val == 1 ? true : false, true);
    
    Node parent = new Node(false, false);

    int halfHeight = (top + bottom)/2;
    int halfWidth = (left + right)/2;

    parent.topLeft = constructRec(grid, left, halfWidth, top, halfHeight);
    parent.topRight = constructRec(grid, halfWidth, right, top, halfHeight);
    parent.bottomLeft = constructRec(grid, left, halfWidth, halfHeight, bottom);
    parent.bottomRight = constructRec(grid, halfWidth, right, halfHeight, bottom);
    return parent;
}
}

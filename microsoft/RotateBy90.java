/*
 * Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

	Example 1:
	
	Input:
	N = 3
	matrix[][] = [[1 2 3],
	              [4 5 6],
	              [7 8 9]]
	Output:
	3 6 9 
	2 5 8 
	1 4 7
 */

package microsoft;
import java.util.*;
public class RotateBy90 {

	static void rotate(int mat[][]) 
    {
        // Code Here
        Stack<Integer> st=new Stack<>();
        for(int j=0;j<mat[0].length;j++){
            for(int i=mat.length-1;i>=0;i--){
                st.push(mat[i][j]);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=st.pop();
            }
        }
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

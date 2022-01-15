/*
 * Given a matrix of size r*c. Traverse the matrix in spiral form.

	Example 1:
	
	Input:
	r = 4, c = 4
	matrix[][] = {{1, 2, 3, 4},
	           {5, 6, 7, 8},
	           {9, 10, 11, 12},
	           {13, 14, 15,16}}
	Output: 
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

package microsoft;
import java.util.*;
public class TraverseInSpiralManner {

	
	static ArrayList<Integer> spirallyTraverse(int mat[][], int r, int c)
    {
        ArrayList<Integer> al=new ArrayList<>();
        // code here 
        
        // dir=0 ->
        //   dir=1 |
        //   dir=2 <-
        //   dir=3 |
        int top=0,down=r-1,left=0,right=c-1,dir=0;
         
        while(top<=down && left<=right){
           if(dir==0){
               for(int j=left;i<=right;i++) al.add(mat[top][j]);
               top++;
           }
           else if(dir==1){
               for(int i=top;i<=down;i++) al.add(mat[i][right]);
               right--;
           }
           else if(dir==2){
               for(int j=right;j>=left;j--) al.add(mat[down][j]);
               down--;
           }
           else if(dir==3){
               for(int i=down;i>=top;i--) al.add(mat[i][left]);
               l
           }
           
           dir=(dir+1)%4;
           
        }
        return al; 
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

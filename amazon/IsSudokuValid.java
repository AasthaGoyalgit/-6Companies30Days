package amazon;
import java.util.*;
public class IsSudokuValid {

	
	public static int isValid(int mat[][]){
        // code here
        
        HashSet<String> seen =new HashSet<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                if(!seen.add("row"+i+mat[i][j])) return 0;
                if(!seen.add("col"+j+mat[i][j])) return 0;
                if(!seen.add("box"+ ((i/3)*3+(j/3)) + mat[i][j])) return 0;  
                }
              
            }
        }
        return 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int[][] mat=new int[9][9];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++) {
            	mat[i][j]=sc.nextInt();
            }
        }
        int res=isValid(mat);
        System.out.println(res);
	}

}

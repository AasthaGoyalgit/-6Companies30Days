package GoldmanSachs;

public class Chessboard {

	
	public static int countSquares(int n)
    {
        // A better way to write n*(n+1)*(2n+1)/6
        return (n * (n + 1) / 2) * (2 * n + 1) / 3;
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
         int res=countSquares(n);
         System.out.println(res);
	}

}

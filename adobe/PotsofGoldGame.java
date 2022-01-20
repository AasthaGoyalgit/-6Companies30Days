package adobe;

public class PotsofGoldGame {
	public static int maxCoins(int a[],int n)
	{
          //add code here.
          int[][] dp=new int[n][n];
          
          for(int g=0; g<dp.length; g++){
              for(int i=0,j=g; j<dp.length; i++,j++){
                  if(g==0){
                    dp[i][j]=a[i];  
                  }
                  else if(g==1){
                     dp[i][j]=Math.max(a[i],a[j]); 
                  }
                  else{
                     int val1 = a[i] + Math.min(dp[i+2][j] , dp[i+1][j-1]);
                     int val2 = a[j] + Math.min(dp[i+1][j-1] , dp[i][j-2]);
                     int val=Math.max(val1, val2);
                     
                     dp[i][j]=val;
                  }
              }
          }
        return dp[0][a.length-1]; 
    }
}

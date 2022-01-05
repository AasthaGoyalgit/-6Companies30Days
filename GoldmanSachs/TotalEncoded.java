package GoldmanSachs;
//47203142
import java.util.*;
public class TotalEncoded {

	public static int solve(String str) {

		 char[] digits=str.toCharArray();
         int n=digits.length;
         int[] count=new int[n+1];
         
         count[0]=1;
         count[1]=1;
         
         if(digits[0]=='0')
         return 0;
         
         for(int i=2;i<=n;i++)
         {
         count[i]=0;
         
         if(digits[i-1]>'0')
         count[i]=count[i-1];
         
         if(digits[i-2]=='1' || (digits[i-2]=='2' && digits[i-1]<'7'))
         count[i]=(count[i]%1000000007+count[i-2]%1000000007)%1000000007;
         }
          return count[n];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="47203142";
        int s=solve(str);
        System.out.println(s);
		
	}

}

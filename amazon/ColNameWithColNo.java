/*
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc.
 In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA” and so on.

Example 1:

Input:
N = 28
Output: AB
Explanation: 1 to 26 are A to Z.
Then, 27 is AA and 28 = AB.
 */



package amazon;
import java.util.*;
public class ColNameWithColNo {

	
	 public static String reverse(String str){
         String nstr="";
        for (int i=0; i<str.length(); i++)
      {
        char ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      return nstr;
    }
    public static String colName (long n)
    {
        // your code here
        String result="";
        while(n>0){
            long last= (n-1)%26 ;
            char ch=(char)last;
            long c= 'A'+ch ;
            result=result+(char)c;
            n=(n-1)/26;
        }
        return reverse(result);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      long n=sc.nextLong();
      String colname = colName(n);
      System.out.println(colname );
	}

}

/*
 * Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.

	Example 1:
	
	Input:
	N = 2
	Output: 
	1 10
	Explanation: 
	Binary numbers from
	1 to 2 are 1 and 10.
 */


package microsoft;
import java.util.*;
public class BinaryToDecimal {

	
	static String reverse(String str){
        String nstr="";
        char ch;
          for (int i=0; i<str.length(); i++)
              {
                ch= str.charAt(i); //extracts each character
                nstr= ch+nstr; //adds each character in front of the existing string
              }
        // System.out.println(nstr);
        return nstr;
        }
    static String DecimaltoBinary(int n){
        String res="";
        if(n==1) res+=Integer.toString(1);
        else {
        	 while(n>1){
                 int k=n%2;
                 String b=Integer.toString(k);
                 res+=b;
                 n/=2;
             }
             res+=n;
        }
       
        
        String ans=reverse(res);
        return ans;
    }
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=N;i++){
            String s=DecimaltoBinary(i);
            al.add(s);
        }
        return al;
    }
    
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

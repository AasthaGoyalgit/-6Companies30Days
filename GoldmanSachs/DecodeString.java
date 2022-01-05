package GoldmanSachs;
import java.util.*;
public class DecodeString {

	public static String reverse(String str) {
		 String nstr="";
	        char ch;
	      
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println(nstr);
	      return nstr;
	}
	
	
	public static String decodedstring(String str) {
		String res="",temp="";
		int count=0;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		String temp2="";
		while(st.size()>0) {
			
//			for(int i=0;i<st.size();i++) {
				if(st.peek()==']') {
					st.pop();
					count++;
				}
				else if(st.peek()=='[') {
					st.pop();
					if(res.length()==0) temp2=reverse(temp);
					else temp2=reverse(res);
					int k=Integer.parseInt(String.valueOf(st.pop()));
					System.out.println(k);
					for(int j=0;j<k;j++) {
						res+=temp2;
					}
					temp="";
					temp2="";count--;
				}
				else {
					char ch=st.pop();
					temp+=ch;
				}
				
		}
				
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="3[b2[ca]]";
       String res=decodedstring(s);
       System.out.println(res);
	}

}

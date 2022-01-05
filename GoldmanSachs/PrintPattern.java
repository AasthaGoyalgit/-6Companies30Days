package GoldmanSachs;

import java.util.Stack;

public class PrintPattern {

	
	 public static String printMinNumberForPattern(String S){
	       int j=1;
	        String str="";
	        Stack<Integer> st=new Stack<>();
	        for(int i=0; i<S.length(); i++){
	            st.push(j);
	            j++;
	            if(S.charAt(i)=='I'){
	            	for(int k=0;k<st.size();k++){
		                   int m=st.pop(); 
		                   str+=Integer.toString(m);
		                }
	            }
	        }
	            st.push(j++);
	        	for(int k=0;k<=st.size();k++){
	                   int m=st.pop(); 
	                   str+=Integer.toString(m);
	                }
	        
	        
	        return str;
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="D";
        String s=printMinNumberForPattern(str);
        System.out.println(s);
	}

}

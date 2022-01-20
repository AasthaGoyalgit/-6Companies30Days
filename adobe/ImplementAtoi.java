package adobe;

public class ImplementAtoi {
    
	 int atoi(String str) {
			// Your code here
			int neg=0,num=0;
			  for(int i=0;i<str.length();i++){
			      if(str.charAt(i)=='-'){
			          neg=1;
			      }
			      else if(str.charAt(i) > 47 && str.charAt(i) <59) {
			         int val= str.charAt(i)-'0';
			         num = num*10 + val;
			      }
			      else {
			         return -1;
			      }
			  }
		     return (neg==1)? (-num) : num;

		    }
}

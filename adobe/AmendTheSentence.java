package adobe;

public class AmendTheSentence {
	 public String amendSentence(String str){
	        //code here
	        String res="";
	        
	        str = str.substring(0).replaceAll("(?<!_)(?=[A-Z])", " ");
	        str = str.toLowerCase();
	        if(str.charAt(0)== 32) str = str.substring(1);
	        else  str = str.substring(0);
	        return str;
	    }
}

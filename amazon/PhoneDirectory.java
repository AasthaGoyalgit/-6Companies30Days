package amazon;
import java.util.*;
public class PhoneDirectory {
	
	public  static void sortLexicographically(String strArr[])
	    {
	        for (int i = 0; i < strArr.length; i++) {
	            for (int j = i + 1; j < strArr.length; j++) {
	                if (strArr[i].compareToIgnoreCase(strArr[j])
	                    > 0) {
	                    String temp = strArr[i];
	                    strArr[i] = strArr[j];
	                    strArr[j] = temp;
	                }
	            }
	        }
	    }
	    // text.startsWith("Hello");
	   public  static ArrayList<ArrayList<String>> displayContacts(int n, 
	                                        String contact[], String s)
	    {
	        // code here
	        ArrayList<ArrayList<String>> list=new ArrayList<>();
	        int found=0;
	        sortLexicographically(contact);
	        
	        for(int i=0;i<s.length()-1;i++){
	            ArrayList<String> sublist=new ArrayList<>();
	            String k=s.substring(0,i+1);
	            
	            for(int j=0;j<contact.length;j++){
	               if(contact[j].startsWith(k)){
	                   sublist.add(contact[j]);
	                   found=1;
	               }
	            }
	            if(found==0) {
	                int m=0;
	                String f=String.valueOf(m);
	                sublist.add(f);
	                list.add(sublist);
	            }
	            else list.add(sublist);
	            
	        }
	        
	        return list;
	        
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
	    String contact[] = {"geeikistest", "geeksforgeeks", 
				"geeksfortest"};
        String s = "geeips";
        ArrayList<ArrayList<String>> list=new ArrayList<>();
       list=displayContacts( n,contact, s);
       System.out.println(list);
	}

}

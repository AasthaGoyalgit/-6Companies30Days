package GoldmanSachs;
import java.util.*;
public class GreatestCommonDivisorOfString {

	public static void swap(String str1, String str2) {
		String temp=str1;
		str1=str2;
		str2=temp;
	}
     public static String gcdOfStrings(String str1, String str2) {
        if(str1.length()>str2.length()) swap(str1,str2);
        String s="";
        for(int k=str1.length(); k>=1; k--) {
        	if(str1.length()%k !=0) continue;
        	if(str2.length()%k !=0) continue;
        	s=str1.substring(0,k);
        	
        	int flag=1;
        	for(int i=0; i<str1.length(); i+=k) {
        		if(str1.substring(i,k)!=s) {
        			flag=0;
        			break;
        		}
        	}
        	
        	for(int i=0; i<str2.length(); i+=k) {
        		if(str2.substring(i,k)!=s) {
        			flag=0;
        			break;
        		}
        	}
        
        	if(flag==0)  continue;
        	
        }
        return s;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        
        String s=gcdOfStrings(str1,str2);
        System.out.println(s);
        
	}

}

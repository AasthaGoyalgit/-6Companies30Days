package GoldmanSachs;
import java.util.*;
public class RunLengthEncoding {

	
	public static String encode(String str)
	{
		String s="";
		s+=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}
			else {
				s+=count;
				s+=str.charAt(i);
				count=1;
			}
		}
		s+=count;
		return s;
		
//		String s="";
//        HashMap<Character,Integer> hm=new HashMap<>();
//        for(int i=0;i<str.length();i++) {
//        	char c=str.charAt(i);
//        	hm.put(c , hm.getOrDefault(c,0)+1);
//        }
//        for(Character val: hm.keySet()) {
//			s+=val;
//			s+=hm.get(val);
//		}
//		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="aaaabbbccc";
        String s=encode(str);
        System.out.println(s);
	}

}

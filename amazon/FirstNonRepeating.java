package amazon;
import java.util.*;
public class FirstNonRepeating {

	public static String PrintFirstNonRepeating(String s) {
		String ans="";
		int count[]=new int[26];
		Arrays.fill(count,0);
		String nrepeat="";
		
		for(int i=0;i<s.length();i++) {
			if(count[s.charAt(i)-'a']==0) nrepeat+=s.charAt(i);
			
			count[s.charAt(i)-'a']++;
			
			int flag=0;
			for(int j=0;j<nrepeat.length();j++) {
				if(count[nrepeat.charAt(j)-'a']==1) {
					ans+=nrepeat.charAt(j);
					flag=1;
					break;
				}
			}
			if(flag==0) ans+="#";
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String ans=PrintFirstNonRepeating(s);
       System.out.println(ans);
	}

}

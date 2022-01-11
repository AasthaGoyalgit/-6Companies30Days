/*Given a set of N nuts of different sizes and N bolts of different sizes. There is a one-one
 *  mapping between nuts and bolts. Match nuts and bolts efficiently.
 

Comparison of a nut to another nut or a bolt to another bolt is not allowed. 
It means nut can only be compared with bolt and bolt can only be compared with nut 
to see which one is bigger/smaller.
The elements should follow the following order ! # $ % & * @ ^ ~ .

* 5
nuts[] = @ % $ # ^
bolts[] = % @ # $ ^
*/
package amazon;
import java.util.*;

public class NutsAndBoltsProblem {

	public static void matchPairs(char nuts[], char bolts[], int n) {
        
		 HashMap<Character,Integer> nut=new HashMap<>();
			HashMap<Character,Integer> bolt=new HashMap<>();
		    char seq[]= { '!' ,'#', '$', '%', '&', '*', '@' ,'^', '~' };
		    String ans="";
			for(int i=0;i<n;i++) {
				char m=nuts[i];
				char b=bolts[i];
				if(nut.containsKey(m)) nut.put(m, nut.get(m)+1);
				else nut.put(m,1);
				
				if(bolt.containsKey(b)) bolt.put(b, bolt.get(b)+1);
				else bolt.put(b,1);
			}
			
			Arrays.fill(nuts,'0');
			Arrays.fill(bolts,'0');
			int k=0;
			for(int i=0;i<seq.length;i++) {
				if(nut.containsKey(seq[i]) && bolt.containsKey(seq[i]) && (nut.get(seq[i])==bolt.get(seq[i])) ) {
					// nut+=(seq[i]+" ");
					nuts[k]=seq[i];
					bolts[k]=seq[i];
					k++;
				}
			}
			
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] nuts=new char[n];
        char[] bolts=new char[n];
        
        matchPairs(nuts,bolts,n);
	}

}

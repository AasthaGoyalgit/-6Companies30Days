package GoldmanSachs;
import java.util.*;
public class anagrams {
	
	public static ArrayList<ArrayList<String>> printAnagrams(String[] strs) {
		HashMap< HashMap<Character,Integer> , ArrayList<String>> bmap=new HashMap<>();
//		key:value
		
		for(String str:strs) {
			HashMap<Character,Integer> fmap=new HashMap<>();
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
			    fmap.put(c, fmap.getOrDefault(c,0)+1);
			}
			
			if(bmap.containsKey(fmap)) {
				ArrayList<String> list=bmap.get(fmap);
				list.add(str);
			}
			else {
				ArrayList<String> list=new ArrayList<>();
				list.add(str);
				bmap.put(fmap,list);
			}
		}
		
		ArrayList<ArrayList<String>> res=new ArrayList<>();
		for(ArrayList<String> val: bmap.values()) {
			res.add(val);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       
		int n=sc.nextInt();
	    String[] words=new String[n];
	    for(int i=0;i<n;i++) {
	    	words[i]=sc.next();
	    }
	    printAnagrams(words);
	}

}

/*
 * Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ], the task is to list all words which are possible by pressing these numbers.


	Example 1:
	
	Input: N = 3, a[] = {2, 3, 4}
	Output:
	adg adh adi aeg aeh aei afg afh afi 
	bdg bdh bdi beg beh bei bfg bfh bfi 
	cdg cdh cdi ceg ceh cei cfg cfh cfi 
	Explanation: When we press 2,3,4 then 
	adg, adh, adi, ... cfi are the list of 
	possible words
 */


package microsoft;
import java.util.*;
public class PossibleWordsFromPhoneDigits {

	static ArrayList <String> possibleWords(int a[], int n)
    {
        // your code here
        ArrayList<String> ans = new ArrayList<>();
        if(n == 0)
            return ans;
        int index = 0;
        String output = "";
        String keypad[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(a,n,index,keypad,output,ans);
        return ans;
    }
    
    static void solve(int arr[],int n,int index,String keypad[],String output,ArrayList<String> ans){
    
        if(index >= n){
            ans.add(output);
            return ;
        }
        
        String temp = keypad[arr[index]];
        
        for(int i=0;i<temp.length();i++){
            char ch = temp.charAt(i);
            solve(arr,n,index+1,keypad,output+ch,ans);
        }
    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

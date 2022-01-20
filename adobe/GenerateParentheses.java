package adobe;
import java.util.*;
public class GenerateParentheses {

	public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> res = new ArrayList<>();
        Helper(n,n,"",res);
        return res;
    }
    
    static void Helper(int openB,int closedB, String s,List<String> res){
        if(openB == 0 && closedB == 0){
            res.add(s);
            return;
        }
        else if(openB < 0 || closedB < 0)
        return;
        
        Helper(openB - 1,closedB,s + "(",res);
        if(openB < closedB)
        Helper(openB ,closedB - 1,s + ")",res);
    }
}

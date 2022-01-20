package adobe;
import java.util.*;

public class LongestArithmeticProgression {
	int lengthOfLongestAP(int[] arr, int n) {
        // code here
        if(n==1 ) return 1;
        if(n==2) return 2;
        HashMap<Integer, Integer>[] dp=new HashMap[n];
        int max_length=1;
        
        for(int i=0;i<n;i++){
            int cur_element = arr[i];
            HashMap<Integer,Integer> cur_hm =  new HashMap<>();
            dp[i]=cur_hm;
            
            for(int j=0;j<i;j++){
              HashMap<Integer,Integer> prev_hm = dp[j];
              int cur_diff = arr[i]-arr[j];
              
              int new_val = prev_hm.getOrDefault(cur_diff , 0 )+1;
              
              cur_hm.put(cur_diff , new_val);
              
              dp[i] = cur_hm;
              
              max_length=Math.max(max_length , cur_hm.get(cur_diff));
              
             
            }
            
            
        }
       return (max_length+1); 
    }
}

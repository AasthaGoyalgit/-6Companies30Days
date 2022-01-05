package GoldmanSachs;
import java.util.*;
public class PairSumDivisibility {

	
	public static boolean PairSum(int[] arr, int k) {
		HashMap<Integer,Integer> rfmap=new HashMap<>();
       	for(int val:arr) {
       		int rem=val%k;
       		int of=rfmap.getOrDefault(rem,0);
       		rfmap.put(rem, of+1);
       	}
       	
       	for(int val:arr) {
       		int rem=val%k;
       		if(rem==0) {
       			int fq=rfmap.get(rem);
       			if(fq % 2 == 1) {
       				return false;
       			}
       		}
       		else if(2*rem ==k) {
       			int fq=rfmap.get(rem);
       			if(fq % 2 == 1) {
       				return false;
       			}
       		}
       		else {
       			int fq=rfmap.get(rem);
       			int ofq=rfmap.getOrDefault(k-rem,0);
       			if(fq!=ofq) return false;
       		}
       	}
       	return true;  
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {13, 11, 9, 3, 7 ,1};
       int k=4;
       boolean res=PairSum(arr,k);
      System.out.println(res); 
       
	}

}

package Intuit;

public class LargestNumberInKSwaps {
	public static String swap(String s, int i ,int j){
	       
	       char ith=s.charAt(i);
	       char jth=s.charAt(j);
	       
	       String left = s.substring(0,i);
	       String mid = s.substring(i+1, j);
	       String right = s.substring(j+1);
	       
	       return left+jth+mid+ith+right;
	       
	       
	    }
	    
	    static String ans="";
	    //Function to find the largest number after k swaps.
	    public static String findMaximumNum(String str, int k)
	        {
	            //code here.
	        //     if(Integer.parseInt(str) > Integer.parseInt(max)) max=str;
	            
	        //     if(k==0) return max;
	            
	        //     for(int i=0;i<str.length()-1;i++){
	        //         for(int j=i+1;j<str.length();j++){
	        //             if(str.charAt(j) > str.charAt(i)){
	        //                 str= swap(str,i,j);
	        //                 findMaximumNum(str , k-1);
	        //                 str= swap(str,i,j);
	        //             }
	        //         }
	        //     }
	            
	        // return max;
	        
	       ans=str;
	       maxima(str.toCharArray(),k,0);
	       return ans;
	    }
	        
	public static void maxima(char[] str,int k,int idx)
	   {
	       if(k==0||idx==str.length)
	       {
	           String sp=new String(str);
	           if(ans.compareTo(sp)<0)
	           {
	               ans=sp;
	           }
	           return;
	       }
	       char max=str[idx];
	       for(int i=idx+1;i< str.length;i++)
	       {
	           if(str[i]>max)
	           {
	               max=str[i];
	           }
	       }
	       if(max!=str[idx])
	       {
	           k--;
	       }

	       for(int i=idx;i<=str.length-1;i++)
	       {
	           if(str[i]==max)
	           {
	               swap(str,idx,i);
	               maxima(str,k,idx+1);
	               swap(str,i,idx);
	           }
	       }

	
	   }
	
	      public static void swap(char []s,int i,int j)
	   {
	       char temp=s[i];
	       s[i]=s[j];
	       s[j]=temp;
	       return;
	   }
}

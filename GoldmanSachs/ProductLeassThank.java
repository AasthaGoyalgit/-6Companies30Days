package GoldmanSachs;

public class ProductLeassThank {

	public static int countSubArrayProductLessThanK(long a[], long n, long k)
    {
//		 long count=0;
//	        for(int i=0;i<n;i++){
//	            long product=a[i];
//	            if(product<k) count++;
//	            for(int j=i+1;j<n;j++){
//	                product*=a[j];
//	                 if(product<k) count++;
//	            }
//	        }
//	        return count;
		
		// Sliding Window Technique
        int i=0,res=0;
        long p=1;
        
        for(int start =0, end=0; end<n;end++){
            p*=a[end];
            
            while(start<end && p>=k){
                p/=a[start];
                start++;
            }
            
            if(p<k){
               res+=(end-start+1); 
            }
        }
        return res;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long a[]= {1, 2, 3, 4};
        long n=4;
        long k=10;
        long res=countSubArrayProductLessThanK(a,n,k);
        System.out.println(res);
	}

}

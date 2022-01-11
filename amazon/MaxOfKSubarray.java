package amazon;
import java.util.*;
public class MaxOfKSubarray {

	public static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        int i=0;
        ArrayList<Integer> al=new ArrayList<>();
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        
        // int i=0;
        
        for(;i<k;i++){
            q.add(arr[i]);
        }
        
        al.add(q.peek());
        q.remove(arr[0]);
        
        
        for(;i<n;i++){
           
            q.add(arr[i]);
            
            al.add(q.peek());
            
            q.remove(arr[i-k+1]);
        }
        return al;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		al=max_of_subarrays(arr, n, k);
		System.out.print(al);
	}

}

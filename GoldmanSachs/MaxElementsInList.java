package GoldmanSachs;
import java.util.*;
public class MaxElementsInList {
//	7
//	4
//	1000 298 3579 100 200 -45 900
	public static void MaxKElementsInList(ArrayList<Integer> a, int n){
		ArrayList<Integer> res=new ArrayList<>();
		int max=a.get(0), maxi=0, i=0, count=0;
		while(count<n) {
			
		for(i=0;i<a.size();i++) {
			if(a.get(i)>max) {
				max=a.get(i);
				maxi=i;
			}
		}
		System.out.println(a.remove(new Integer(max)));
		
		System.out.println(max);
		res.add(max);
		count++;
	   }
		System.out.println(count);
		for(int j=0;j<n;j++) {
        	System.out.print(res.get(j)+" ");
        }
//		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int [] arr=new int[m];
		int n=sc.nextInt();
		
		for(int i=0;i<m;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=m-1;i>(m-n-1);i--) {
			System.out.print(arr[i]+" ");
		}
}

}

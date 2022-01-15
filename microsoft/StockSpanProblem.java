/*
 * The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stock’s price for all n days. 
	The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
	For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.
	
	Example 1:
	
	Input: 
	N = 7, price[] = [100 80 60 70 60 75 85]
	Output:
	1 1 1 2 1 4 6
 */

package microsoft;
import java.util.*;
public class StockSpanProblem {

	public static int[] calculateSpan(int price[], int n)
    {
       Stack<Integer> st = new Stack<>();
       st.push(0);
       int[] span=new int[n];
       span[0]=1;
       for(int i=0;i<price.length;i++){
             while(!st.isEmpty() && price[st.peek()]<=price[i]){
             st.pop();
       }
       
       if(st.isEmpty()) span[i]=i+1;
       else span[i]=i-st.peek();
       st.push(i);
       }
     return span;
    }
    
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

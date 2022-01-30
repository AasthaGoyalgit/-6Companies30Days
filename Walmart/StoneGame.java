package Walmart;

public class StoneGame {
	 public boolean stoneGame(int[] piles) {
	        // return true;
	       int countA=0, countB=0, beg=0, end=piles.length -1; 
	       while(end>=beg){
	           if(piles[beg] > piles[end]){
	               if(end==beg+1){
	                   countA+=Math.max(piles[beg] , piles[end]);
	                   break;
	               }
	               else if(piles[beg+1] < piles[end]){
	                   countA+=piles[beg];
	                   beg++;
	               }
	               else if(piles[beg+1] > piles[end] && piles[beg+1] > piles[beg]){
	                   countA+=piles[end];
	                   end--;
	               }
	               else{
	                   countA+=piles[beg];
	                   beg++;
	               }
	           }
	           
	           else{
	                if(end==beg+1){
	                   countA+=Math.max(piles[beg] , piles[end]);
	                   break;
	               }
	               else if(piles[end-1] < piles[beg]){
	                   countA+=piles[end];
	                   end--;
	               }
	               else if(piles[end-1] > piles[beg] && piles[end-1] > piles[end]){
	                   countA+=piles[beg];
	                   beg++;;
	               }
	               else{
	                   countA+=piles[end];
	                   end--;
	               }
	           }
	       }
	        return countA>countB;
	    }
}

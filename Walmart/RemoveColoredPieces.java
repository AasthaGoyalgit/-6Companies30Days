package Walmart;

public class RemoveColoredPieces {
	 public boolean winnerOfGame(String colors) {
	        
	        int contiguousA=0, contiguousB=0, movesA=0, movesB=0;
	        
	        for(int i=0;i<colors.length(); i++){
	            if(colors.charAt(i) == 'A') contiguousA++;
	            else{
	                if(contiguousA >= 3)
	                    movesA += contiguousA - 2;
	                contiguousA = 0;
	             }
	        }
	        
	        if(contiguousA >= 3)movesA += contiguousA - 2;
	        contiguousA = 0;
	        
	        
	        
	         for(int i=0;i<colors.length(); i++){
	            if(colors.charAt(i) == 'B') contiguousB++;
	            else{
	                if(contiguousB >= 3)movesB += contiguousB - 2;
	                contiguousB = 0;
	            }
	        }
	        
	        if(contiguousB >= 3)movesB += contiguousB - 2;
	        contiguousB = 0;
	         
	        
	        return movesA > movesB;
	        

	    }
	
}


public class lab09A1 {
	 public static void main(String[] args){ 
	  
	        int[][] arr = new int[4][5]; 
	        
	        for (int i = 0; i < 4; i++) { 
	            for (int j = 0; j < 5; j++) { 
	            	 arr[i][i]= (int)(11 * Math.random());
	 	            System.out.print(arr[i][i] + " ");
	 	           
	            } 
	  
	            	System.out.println(); 
	        }
	         
	 }
}

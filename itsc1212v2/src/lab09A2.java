import java.util.*;

public class lab09A2 {
	 public static void main(String[] args){ 
		 Scanner a = new Scanner(System.in);
		 
		 	System.out.println("Enter how many rows would you like: ");
			int rows = a.nextInt();
			System.out.println("Enter how many columns would you like: ");
			int columns = a.nextInt(); 
			
	        int[][] arr = new int[rows][columns]; 
	        
	        arr = timesTable(rows, columns);
	        
	        for (int row = 0; row < arr.length ; row++)
	        {
	            for (int column = 0; column < arr[row].length; column++)
	            {
	                System.out.printf("%2d ",arr[row][column]);
	            }
	            System.out.println();

	        }
	 }
	 public static int[][] timesTable(int r, int c)
	 {
	     int [][] yes = new int[r][c];
	     for (int row = 0; row < yes.length ; row++)
	     {
	         for (int column = 0; column < yes[row].length; column++)
	         {
	             yes[row][column] = (row+1)*(column+1);
	         }

	     }
	     return yes;
	 }
}
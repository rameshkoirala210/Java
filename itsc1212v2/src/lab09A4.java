import java.util.Scanner;

public class lab09A4 {
	 public static void main(String[] args){ 
		 Scanner a = new Scanner(System.in);
		 
		 int[][] arr = new int[3][4];
		 
		
		 System.out.println("Enter 1 student id: ");
		 arr[0][0] = a.nextInt();
		 System.out.println("Enter 2 student id: ");
		 arr[1][0] = a.nextInt();
		 System.out.println("Enter 3 student id: ");
		 arr[2][0] = a.nextInt();
		 
		 System.out.println("\n First Student");
		 System.out.println("Enter First test Score: ");
		 arr[0][1] = a.nextInt();
		 System.out.println("Enter second test Score: ");
		 arr[1][1] = a.nextInt();
		 System.out.println("Enter third test Score: ");
		 arr[2][1] = a.nextInt();
		 
		 System.out.println("\n Second Student");
		 System.out.println("Enter First test Score: ");
		 arr[0][2] = a.nextInt();
		 System.out.println("Enter second test Score: ");
		 arr[1][2] = a.nextInt();
		 System.out.println("Enter third test Score: ");
		 arr[2][2] = a.nextInt();
		 
		 System.out.println("\n Third Student");
		 System.out.println("Enter First test Score: ");
		 arr[0][3] = a.nextInt();
		 System.out.println("Enter second test Score: ");
		 arr[1][3] = a.nextInt();
		 System.out.println("Enter third test Score: ");
		 arr[2][3] = a.nextInt();
		 
		 System.out.println("ID    Test 1  Test 2 Test 3");
		 for (int row = 0; row < arr.length ; row++)
	        {
	            for (int column = 0; column < arr[row].length; column++)
	            {
	                System.out.printf("%5d ",arr[row][column]);
	            }
	            System.out.println();

	        }
	 }		 
}
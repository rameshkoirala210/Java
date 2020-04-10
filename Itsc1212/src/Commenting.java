
import java.util.Scanner;  //This line imports the Scanner class from library which
//allows you to use Scanner in this class

public class Commenting { //his method allows your program to run in the console. This method will perform the code as the line goes and as per the execution
	public static void main(String[] args)  {//This is the main method. You need this to run the program in the console.

		//Declare variables at the top  
		int radius;  //int only holds all the integer.  
		double area; //double can hold the decimal values.	
		final double PI = 3.14; //to write a constant value
		//the process  
		radius = 12; //you can initialize radius to something already  
		area = PI * radius * radius; //calculating the area  
		System.out.println("The area of a circle with radius " + radius + " is : " + area); //Printing this to the user 
	//Adding a scanner  
	Scanner scan = new Scanner(System.in); //A scanner that scans what the user inputs.
	System.out.println("Enter your choice for radius : ");  
	radius = scan.nextInt(); //Scans the next integer that the user will input and assign that value to radius
	
	System.out.println("The area of a circle with radius " + radius + " is : " + area+ " <--- Wrong because it is the area when radius is 12"); //Printing this to the user
	
	area = PI * radius * radius; //calculating the area with user input radius  
	System.out.println("The area of a circle with radius " + radius + " is : " + area+ " <-- The value updated according to new radius");
}
}

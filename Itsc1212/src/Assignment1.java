import java.util.Scanner;
/*Assignment 1 
 * 
 * This java program has five different option 
 * 1. Lab Test Average Calculator
 * 2. Dice Roll
 * 3. Cylinder Volume Calculator
 * 4. Compute Distance between two points designated by ( x 1 , y 1 ) and ( x 2 , y 2 )
 * 5. Quit
 * 
 * This program will display these menu and ask the user to pick one of the option 
 * In each choice there is different calculations
 * 
 * By: Ramesh Koirala
 * Date: 2/9/2020
 * Verson: 1?
 * 
 */

public class Assignment1 {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in); 
		
		//The choices the user gets
		System.out.println("1. Lab Test Average Calculator");
		System.out.println("2. Dice Roll");
		System.out.println("3. Cylinder Volume Calculator");
		System.out.println("4. Compute Distance between two points designated by (x1, y1) and (x2, y2)");
		System.out.println("5. Quit");
		
		System.out.println("Select Between 1-5: ");
		 double choice  = a.nextDouble();//Saves it as choice
		 
		 //Lab Test Average Calculator:
		 if(choice == 1) {//if it's choice 1 this is seen
			 System.out.println("Enter the grade for lab 1: ");
			 double lab1  = a.nextDouble();//Saves lab 1 grade
			 System.out.println("Enter the grade for lab 2: ");
			 double lab2  = a.nextDouble();//Saves lab 2 grade
			 System.out.println("Enter the grade for lab 3: ");
			 double lab3  = a.nextDouble();//Saves lab 3 grade
			 
			 double resultA = (lab1+lab2+lab3)/3;// Gets the Average of the 3 test
			 
			 System.out.println("Lab Test Average grade is " + resultA);
			 
			 //Dice
		 }else if(choice == 2) {//if it's choice 2 this is seen
			 int dice1 = (int) ( Math.random() * 6 + 1);//gives you random number 
			 int dice2 = (int) ( Math.random() * 6 + 1);
			
			 int total = dice1 + dice2;//adds the 2 random number
			 
			 System.out.print("Do you think the dice will roll even or odd: ");
			 String cDice  = a.next();//asks the user
			 
			 String evenOdd = (total % 2 == 0) ? "even" : "odd";//sees if the added number is even or odd
			 
			//String condition is tested here
			 if (cDice.equals("even")) {//if user chose even 
					if (evenOdd.equals("even")) {
						System.out.println("Good Job you were correct");
					}else {
						System.out.println("you were wrong, Its Odd");
					}
			}else if (cDice.equals("odd")) {//if user chose odd
					if (evenOdd.equals("even")) {
						System.out.println("Good Job you were correct");
					}else {
						System.out.println("you were wrong, Its Even");
					}
			}

			 
		//Cylinder Volume Calculator
		 }else if(choice == 3) {//if it's choice 3 this is seen
			 System.out.println("enter the radius ");//ask's user for radius
			 double radius  = a.nextDouble();
			 System.out.println("enter the height ");//ask's user for height
			 double height  = a.nextDouble();
			 
			 double volume = (3.14*(radius*radius)*height);//finds volume by using rhe user's height and radius
			 System.out.println("Volume is " + volume);//display's volume
			 
		//Compute Distance
		 }else if(choice == 4) {//if it's choice 4 this is seen
			 System.out.println("enter X1 ");
			 double x1  = a.nextDouble();
			 System.out.println("enter Y1 ");		// Ask user to put x1,x2,y1,y2
			 double y1  = a.nextDouble();			// and saves it
			 System.out.println("enter X2 ");
			 double x2  = a.nextDouble();
			 System.out.println("enter Y2 ");
			 double y2  = a.nextDouble();		 
			 double xNum1 = x1*x1;
			 double xNum2 = x2*x2;					//gets the square for all x and y
			 double yNum1 = y1*y1;
			 double yNum2 = y2*y2;
			double t4 = (xNum2 - xNum1)+(yNum2 - yNum1); //combines them all
			 System.out.println(Math.pow(t4,.5)); //finds the square root of it
			 
		// choice 5
		 }else if(choice == 5) {//if it's choice 5 this is seen
			 System.out.print("Goodbye!");
		 
		 }else {//If they pick something else this is printed out
			 System.out.print("Please select between 1-5"); 
		 	}
	}//ends Main
}//ends class

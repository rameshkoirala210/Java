import java.util.*;

public class CalculatorDemo{
	
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		//declaring variable
		int a, b, result, choice;

		//show the menu by writing menu item

		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");

		//Ask the user to input the choice
		System.out.print("What is your Choice? (Enter 1-5): " );
		choice = n.nextInt();
		System.out.print("Enter first value: " );
		a = n.nextInt();
		System.out.print("Enter Second value: " );
		b = n.nextInt();
		
		//process choice
		if (choice == 1 ) {
	        System.out.println("The answer is " + (a+b)); 
		} else if (choice == 2) {
	        System.out.println("The answer is " + (a-b));
		} else if (choice == 3) {
	        System.out.println("The answer is " + (a*b));
		} else if (choice == 4) {
	        System.out.println("The answer is " + (a/b) + " remainder  = " + (a%b));
		} else if (choice == 5) {
	        System.out.println("Bye");
		} else {
			System.out.println("Enter Number 1 to 5");
		}
	        
	}
}
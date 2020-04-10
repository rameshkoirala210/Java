import java.util.*;

public class Coin {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("Would you like to flip a coin? Enter 0 for no. ");
		 double choice  = a.nextDouble();
		 
		 if(choice == 0) {
			 System.out.print("Goodbye!");
		 }else {
			 //Random ran = new Random();
			 //int num  = random.nextInt(1, 2);
			 int num = (int) ( Math.random() * 2 + 1);
			 if(num == 1) {
				System.out.println("You got heads!");
				System.out.println("Goodbye!");
			 }else if (num == 2){
				System.out.println("You got tails!");
				System.out.println("Goodbye!");
			 }else{
				System.out.println("Goodbye!");
				}
		 }
	}
		 
}

/* 			Prompt the user to enter a point (x, y)
			System.out.print("Enter a point with two coordinates: ");
			double x = input.nextDouble();
			double y = input.nextDouble();

			// Check whether the point is within the rectangle
			// centered at (0, 0) with width 10 and height 5
			//boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

			// Display results
			//System.out.println("Point (" + x + ", " + y + ") is " + ((withinRectangle) ? "in " : "not in ") + "the rectangle");
*/
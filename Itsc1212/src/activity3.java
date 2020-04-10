import java.util.*;
/*Analysis:The user will have 4 inputs(saved as x, x1, y and y1). it will go into random
 * and the out put is printed out in the if method
 * Design: the major step is the math part because that was the hardest for me to figure out.
 * Testing:first I decided to get the user input because it was the easiest. then I got stuck 
 * on figuring out how to get random to function correctly after multiple attempts i figured it
 * out i think. then i did the if statement, first it didn't work then after a modification
 * it worked.
 */
public class activity3 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the range for x (enter two numbers): ");
			double x = input.nextDouble();
			double x1 = input.nextDouble();
			System.out.print("Enter the range for y (enter two numbers): ");
			double y = input.nextDouble();
			double y1 = input.nextDouble();
			
			double a = (int)(Math.random()*(x-x1+1))+x1;
			double b = (int)(Math.random()*(y-y1+1))+y1;
			
			if (a < 6 && b < 4 || a < -6 && b < -4) {
				System.out.print("Point (" + a + "," + b + ") is inside the rectangle");
			}else if (a >= 6 && b >= 4 || a > -6 && b > -4) {
				System.out.print("Point (" + a + "," + b + ") is not inside the rectangle");
			}
			
			
	}
}


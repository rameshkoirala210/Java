import java.util.Scanner;

/* Header: Proper and Improper Fraction
 * By:Ramesh Koirala 
 * Section:002
 * Description: In this program the user puts numerator and denominator and the program 
 * determines of it is proper or improper fraction
 * Analysis: The input is going to be numerator and denominator and the out put is going to 
 * be users numerator and denominator with program figuring out if it is proper or improper fraction
 * Design: the major step for solving this problem will be the if statement because if you 
 * get that wrong, basically everything will be massed up. If it is improper,then we 
 * have to reduce it to its lowest form so they know what it is we need another if statement 
 * for that.
 * Testing: to test the program first run the program if it asks the user for input of 
 * numerator and denominator then thats good, after that if the out put is proper fraction 
 * the program says  numerator / denominator is a proper fraction. if it is improper fraction 
 * we have to make another if statement to see if it can be reduce to whole number
 * or a mixed number
 */
public class fraction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Numerator : ");
		double num = input.nextDouble();
		System.out.print("Enter denominator : ");
		double den = input.nextDouble();
		
		if (num<den) {
			System.out.println(num + " / " + den + " is a proper fraction");
		}else if (num > den) {
				double reduce = num/den;
				int reduce1 = (int) (num /den) ;
				double mix = num % den;
			if((reduce%1)==0) { 
				System.out.println(num + " / " + den + " is a improper fraction and it can be reduced to " + reduce );
			}else {
				System.out.print(num + " / " + den + " is a improper fraction and its mixed fraction is  " + reduce1);
				System.out.print(" + " + mix + " / " + den);
			}
		}
	}
}

import java.util.Scanner;

public class Sleep {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
//		System.out.print("How much do you sheep? ");
//		 double hours  = a.nextDouble();
//		 
//		 if(hours > 8) {
//			 System.out.print("Good! You got enough sleep"); 
//		 }else if (hours > 5){
//			 System.out.print("That's okay, you should probably still sleep more though!");
//		 }else {
//			 System.out.print("You definitely need more sleep!!");
//		 }
		int a1 = 3, b = 4, c = -10;
		if(!(a1>b++)){
			System.out.println("Value of a is: " + a1);
	System.out.println("We are inside the if-statement!");
			System.out.println("Value of b is: " + b);
		}else if (c%2 != 0 & c < 0){
			c = c / 0;
		System.out.println("We are now in the else section and c is a negative odd number!" + c);
		}
		else{
			System.out.println("c is even?");
		}
		System.out.println("We are now back outside the if-statement!");

		 
	}
}
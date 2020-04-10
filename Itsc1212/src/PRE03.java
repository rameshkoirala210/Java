import java.util.Scanner;
//By Ramesh Koirala
//1/28/20 
//lottery randomization 
public class PRE03 {
	public static void main(String[] args) {
		
		// Generating a lottery number
		int lottery = (int)(Math.random() * 100);
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("ID001");
		
		System.out.print("Enter your lottery pick (two digits): ");
		int pick  = a.nextInt();
		
		// Get digits from lottery
		 int lotteryDigit1 = lottery / 10;
		 int lotteryDigit2 = lottery % 10;
		
		 // Get digits from guess
		 int pickDigit1 = pick / 10;
		 int pickDigit2 = pick % 10;
		 
		 System.out.println("The lottery number is " + lottery);
		 
		// Check the guess
		  if (pick == lottery) {
		  System.out.println("Exact match: you win $10,000");
		  }else if (pickDigit2 == lotteryDigit1 && pickDigit1 == lotteryDigit2) {
		  System.out.println("Match all digits: you win $3,000");
		  }else if (pickDigit1 == lotteryDigit1 || pickDigit1 == lotteryDigit2 || pickDigit2 == lotteryDigit1 || pickDigit2 == lotteryDigit2) {
		  System.out.println("Match one digit: you win $1,000");
		  }else {
			 System.out.println("Sorry, you lost");
		}
	}
}
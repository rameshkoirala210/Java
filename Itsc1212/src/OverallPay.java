import java.util.Scanner;

public class OverallPay {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		
		System.out.print("How many hours do you work: ");
		 int hours = a.nextInt();
		 System.out.print("How much do you get paid in an hour: ");
		 double payRate = a.nextDouble();
		 
		 double regularWage = hours*payRate;
		 
		 
		 //Overtime
		 System.out.print("How many Overtime hours do you work: ");
		 int overtimehours = a.nextInt();
		 System.out.print("How much do you get paid in an overtime hour: ");
		 double overtimepayRate = a.nextDouble();
		 
		 double overtimeWage = overtimehours*overtimepayRate;
		
		 double totalWage = regularWage*overtimeWage;//I think this is wrong
		 double totalWageRight = regularWage+overtimeWage;
		 
		 System.out.println("Regular Wage = " + regularWage);
		 System.out.println("Overtime Wage = " + overtimeWage);
		 System.out.println("Total Pay Wrong= " + totalWage);
		 System.out.println("Total Pay Right= " + totalWageRight);
	}
}
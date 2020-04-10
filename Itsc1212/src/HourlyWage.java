import java.util.Scanner;

public class HourlyWage {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		
		System.out.print("How many hours do you work ");
		 int hours = a.nextInt();
		System.out.print("How much do you get paid in an hour ");
		 double payRate = a.nextDouble();
		 
		 double grossPay = hours*payRate;
		 
		 System.out.print(grossPay);
		 
	}
	
}
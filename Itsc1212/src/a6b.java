import java.util.Scanner;//Scanner

public class a6b {//Activity 6b
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);//scanner in system.in
		
		int days, week, rem;//variables
		
		System.out.print("enter how many days’ of vacation she took.");
		 days = a.nextInt();//getting days
		 
		 if (days > 7) {
			week = days/7;
			rem = days%7;
			 System.out.print("This is " + week + " Week and " + rem + " days");		 
		 }else
			 System.out.print("you spent" + days + "days in your vacation ");
		 
	}
}
		 
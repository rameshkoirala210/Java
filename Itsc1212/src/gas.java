import java.util.Scanner;//Scanner

public class gas {//Activity 5
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);//scanner in system.in
		
		double miles, gallons, gasmileages;//variables
		
		System.out.print("enter the miles the car has run : ");
		 miles = a.nextDouble();//getting miles
		 
		 System.out.print("enter the gallons : ");
		 gallons = a.nextDouble();//getting gallons
		 
		 gasmileages = miles/gallons;//finding gas mileages
		 System.out.print("The gas milage is " + gasmileages + "mpg");
		
}
}
import java.util.Scanner;
//By Ramesh Koirala
// Post02 
// changing from pound to kg
public class Post02 {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("ID001");
		
		System.out.print("Enter a number in pounds: ");
		 double pounds = a.nextDouble();
		 
		 double kg = pounds * 0.454;
		 
		 System.out.print(pounds + " pounds is " + kg + " kilograms");
	}
}
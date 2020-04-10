import java.util.Scanner;
//By Ramesh Koirala
//Post02 
//car price with math involved
public class Post02C {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("ID003");
		
		System.out.print("Enter Car Model: ");
		String model  = a.nextLine();
		
		System.out.print("Enter Car Initial Cost: ");
		double icost  = a.nextDouble();
		
		double stax = icost *  .036;
		double dprice = (stax + icost)* .15;
		double fprice = icost + stax - dprice;
		
		System.out.println("The car model is a " + model);
		System.out.println("The initial cost is: " + icost);
		System.out.println("The sales tax is: " + stax);
		System.out.println("The discount is: " + dprice);
		System.out.println("The Final Price is: " + fprice);
		
		double smen  = fprice * .1;
		System.out.println("Salesman Commission is : " + smen);
	}
}
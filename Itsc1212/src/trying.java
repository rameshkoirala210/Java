import java.util.*;

public class trying {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		 
			System.out.print("Enter the price: ");
			double price = a.nextDouble();
			System.out.print("Enter the discount rate: "); 
			double discount = a.nextDouble(); 
			System.out.print("The new price is ");
			System.out.println(price * (discount / 100.0)); 
}
}

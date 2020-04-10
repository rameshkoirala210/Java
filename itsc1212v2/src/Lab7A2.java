import java.util.Scanner;

public class Lab7A2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
			
		System.out.println("Enter amount before discount");
		double price = a.nextDouble();
		
		int num = (int) ( Math.random() * 2 + 1);
		System.out.println(calculateDiscount(num));
		
		System.out.println("your price is now " + calculateFinalPrice(price,num));
	}
	public static String calculateDiscount(int num) {  
		String dis = "";
		if(num == 1) {
			dis = "You got 20% discount";
		}else if (num == 2){
			dis = "You got 25% discount";
	}
		return dis;
	}
	public static double calculateFinalPrice(double price, int num) {
		double fp = 0;
		if(num == 1) {
			fp = price-(price*.20);
		}else if (num == 2){
			fp = price-(price*.20);
	}
		return fp;
	}
}

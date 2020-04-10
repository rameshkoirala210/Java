import java.util.Scanner;

//By Ramesh Koirala
//Verson 1?
//Date: 3/27/2020
//Post07 
public class post7 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("ID001");
		
		System.out.print("Enter the number of sides: ");
		int number = a.nextInt();
		System.out.print("Enter the side: ");
		double side = a.nextDouble();
		
		
		System.out.printf("The area of the polygon is %.2f", (area(number, side)));
		
	}
	public static double area (int n, double side){
		double area = (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
		return area;
	}
}
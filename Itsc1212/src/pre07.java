import java.util.Scanner;

//By Ramesh Koirala
//Verson 1?
//Date: 3/22/2020
//pre07 
public class pre07 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("ID001");
		
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment(x);
		System.out.println("After the call, x is " + x);
		
		System.out.println("\n ID002");
		int num1 = 1;
		int num2 = 2;
		
		System.out.println("Before invoking the swap method, num1 is " +
		num1 + " and num2 is " + num2);
		
		// Invoke the swap method to attempt to swap two variables
		swap(num1, num2);
		System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);	
		
		System.out.println("\n ID003");
		
		System.out.print("Enter first integer: ");
		 int n1 = a.nextInt();
		System.out.print("Enter second integer: ");
		 int n2 = a.nextInt();
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));  
	}
		 
		public static void increment(int n) {
		n++;
		System.out.println("n inside the method is " + n);		
	}
		public static void swap(int n1, int n2) {
		 System.out.println("\tInside the swap method");
		 System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
			// Swap n1 with n2
		 int temp = n1;
		 n1 = n2; 
		 n2 = temp;
		 System.out.println("\t\tAfter swapping, n1 is " + n1 +  " and n2 is " + n2);
	}
		public static int gcd(int n1, int n2) {
		int gcd = 1; // Initial gcd is 1
		int k = 2; // Possible gcd
		
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
			gcd = k; // Update gcd
			k++;
		 }
		return gcd; // Return gcd
		}
}
		
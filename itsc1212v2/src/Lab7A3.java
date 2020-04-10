import java.util.Scanner;

public class Lab7A3 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		int A = a.nextInt();
		int B = a.nextInt();
		int C = a.nextInt();

		System.out.println("Largest Number is " + calculateLargest(A,B,C));
		System.out.println("Smallest Number is " + calculateSmallest(A,B,C));
		System.out.println("Average is " + calculateAverage(A,B,C));
	}
	public static String calculateLargest(int A,int B,int C) {  
		String larger = "";
		if(A > B) {
			if(A > C) {
			 larger = A + " is the largest number";
			}else {
			 larger = C + " is the largest number";
			}
		}else if(B > C) {
			 larger = B + " is the largest number";		
		}else {
		 larger = C + " is the largest number";
		}
		return larger;
	}
	public static String calculateSmallest(int A,int B,int C) {  
		String smallest = "";
		if(A < B) {
			if(A < C) {
			 smallest = A +" is the Smallest number";
			}else {
			 smallest = C + " is the Smallest number";
			}
		}else if(B < C) {
			 smallest = B + " is the Smallest number";		
		}else {
			 smallest = C + " is the Smallest number";
		}
		return smallest;
	}public static double calculateAverage(int A,int B,int C) {
		double mut = A + B + C;
		double Avg = mut/3;
		
		return Avg;  
		
	}
}
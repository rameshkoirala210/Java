import java.util.Scanner;

public class A64Q11 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int choice;
		do {
		System.out.println("\n1. Add odd numbers from a to b ");
		System.out.println("2. Add even numbers from a to b ");
		System.out.println("3. Show multiples of c from a to b ");
		System.out.println("4. Exit ");
		
		System.out.println("\nEnter Your Choice: ");
		choice = a.nextInt();
		int aa;
		int bb;
		
		if(choice == 1) {
			do {
			System.out.println("Enter odd A: ");
			 aa = a.nextInt();
			System.out.println("Enter odd B: ");
			 bb = a.nextInt();
			}while(aa % 2 == 0 || bb % 2 == 0);
			
			int c = aa + bb;
			System.out.println("Answer = " + c);
		}if(choice == 2) {
			do {
			System.out.println("Enter even A: ");
			 aa = a.nextInt();
			System.out.println("Enter even B: ");
			 bb = a.nextInt();
			}while(aa % 2 != 0 || bb % 2 != 0);
			int c = aa + bb;
			System.out.println("Answer = " + c);
		}if(choice == 3) {
			System.out.println("Enter A: ");
			 aa = a.nextInt();
			System.out.println("Enter B: ");
			 bb = a.nextInt();
			
			int c = aa * bb;
			System.out.println("Answer = " + c);
		}if(choice == 4) {
			System.out.println("BYE");
		}
		}while(choice != 4);
}
}
	
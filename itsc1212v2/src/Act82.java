import java.util.Scanner;
public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, find;
		boolean found = false;
		Scanner input = new Scanner(System.in);
		System.out.println("How big would you like the array");
		size = input.nextInt();
		int[ ]array = new int[size];
		for ( int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * size + 1);
			System.out.print(array[i] + " ");
		}
		System.out.print("\nPlease enter an integer to search for: ");
		find = input.nextInt();
		for(int i = 0; i < array.length; i++ ) {
			if ( find  == array[i]) {
				System.out.println("That number was found at " + i);
				found = true;
				break;
			}
		
		}
		if (found != true)
			System.out.println("No element found");


	}
}
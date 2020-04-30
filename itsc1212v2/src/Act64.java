import java.util.Scanner;
import java.lang.Integer;
public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int size = 0, numStr = 0;
		String num;
		System.out.println("How many strings are you entering");
		size = input.nextInt();
		
		String[] array = new String[(size)];
		System.out.println("Enter your " + size + " values");
		num = input.nextLine();
		 for ( int i = 0; i < size; i++ ) {
			 num = input.nextLine();
			 array[i] = num;
		 }
		 for ( int i = 0; i < size; i++ ) {

			 numStr+=Integer.parseInt(array[i], 10); 
			 
		 }
		 
		 System.out.println("Total: " + numStr);
	}

}

import java.util.Scanner;

public class e16 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		tuna16 tunaObject = new tuna16 ();
		
		System.out.println("Enter name here: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
				
	}
 
}

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str;
		int i = 0;
		System.out.println("Enter a string");
		str = input.nextLine();
		char[] array = new char[str.length()];
		for ( i = 0; i < str.length(); i ++ ) {
			array[i] = str.charAt(i);
		}
		for ( i = 0; i < str.length(); i ++ ) {
			System.out.println(array[i]);
		}
		
	}

}

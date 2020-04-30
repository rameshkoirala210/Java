import java.util.Scanner;
import java.util.Arrays;
public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str, str2;
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
		
		System.out.println("Enter another string");
		str2 = input.nextLine();
		char[] array2 = new char[str2.length()];
		for ( i = 0; i < str2.length(); i ++ ) {
			array2[i] = str2.charAt(i);
		}
		
		System.out.println(java.util.Arrays.equals(array, array2));
		
	}

}

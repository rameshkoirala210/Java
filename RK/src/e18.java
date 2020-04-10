import java.util.Scanner;

public class e18 {
	public static void main(String[] args) {
		int age = 60;
		
		if (age < 50) {
			System.out.println("young");
		}else {
			System.out.println("old");
			if (age > 75) {                   // nesting 
				System.out.println("really old");
			}else {
				System.out.println("not really that old");
			}
		}
		
	}
}
import java.util.Scanner;

public class lab505 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		String b ="";
		String c = "";
		
		String newS;
		do {
			System.out.print("Enter a string: " );
			 newS = a.next();
			 b += newS;
		}while(c.equals("") && !newS.equals("exit"));
		
		System.out.println(b);
	}
}

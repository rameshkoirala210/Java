import java.util.Scanner;
import java.lang.*;

public class act5 {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		
		String ab = "The trouble with programmers is that you can never tell what a programmer is doing until it’s too late.";
		int length = ab.length();
		System.out.println("Length is " + length); 
		
		System.out.println("enter your input");
		 String f1 = a.next();
		 if (f1.contains("\"")) {
			 System.out.println("Is a quote " + f1); 
		 }else {
			 System.out.println("Not a quote " + f1);  
		 }
		 
		 System.out.println("enter your character");
		 String f2 = a.next();
		 System.out.println(ab.indexOf(f2));
		 
		 System.out.println("enter Index position");
		 int f3 = a.nextInt();
		 System.out.println(ab.charAt(f3));
		 
		 String b12 = ab.substring(3 , 12).toUpperCase();
		 System.out.println(b12);
		 
		 System.out.println(ab + " - Seymour Cray");
		 
	}
}

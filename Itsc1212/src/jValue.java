import java.util.Scanner;

public class jValue {//Activity 4
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		 double q, c, per;
		 
		 System.out.print("how many question are in the test? ");
		 q = a.nextDouble();
		 
		 System.out.print("how many question did you get correct? ");
		 c = a.nextDouble();
		 
		 per = (c/q) *100;
		 System.out.print("You got " + per + " percentage on your test");
		 
		 
		 
	
}
}
import java.util.Scanner;
import java.lang.*;

public class act555444 {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
	 System.out.println("enter your first input");
	 String firstinput = a.next();
	 System.out.println("enter your second input");
	 String secondinput = a.next();

	 if(firstinput.compareTo(secondinput) == 0) {
		 System.out.println("Yes"); 
    }else{ 
        System.out.println("No");    
    } 
	 System.out.println("enter your first input");
	 String f1 = a.next();
	 System.out.println("enter your second input");
	 String s1 = a.next();
	 
	 boolean r = f1.equals(s1); 
	  
    System.out.println(f1 + " and " + s1 + " are equal is " + r); 
}
}

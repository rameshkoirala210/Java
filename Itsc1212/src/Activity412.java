import java.util.*;

public class Activity412 {

public static void main(String args[]) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("enter a word");
	String word =a.nextLine();

	char first = word.charAt(0); 
	char last = word.charAt(word.length() - 1); 
	
	System.out.println(first + " " + last);
}
}
import java.util.*;

public class Activity41 {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in); 

		System.out.println("enter your full name (first and then last name) ");
		 String first = a.next();
		 String last = a.next();
		 String firstlast = first + " " + last; 
		
		String b = first.substring(0 , 1).toUpperCase()+first.substring(1);
		String c = last.substring(0 , 1).toUpperCase()+last.substring(1);
		String bc = b + " " + c;
		
		System.out.println(b + " " + c);
		
		System.out.println("enter a single character");
		 String ch = a.next();
		System.out.println(firstlast.indexOf(ch));
		
		System.out.println("enter another String");
		 String aS = a.next();
		 if(firstlast.contains(aS) || bc.contains(aS)) {
			 System.out.println(bc + " has " + aS);
		 }else {
			 System.out.println("That phrase is not contained within the full name");
		 }
	}
}
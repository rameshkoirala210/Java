import java.util.*;

public class lab5a4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int rand;
		do {
		rand = (int)(Math.random() * 5 - 1) +1;
	
		System.out.print("Enter a string: " );
		 String pre = a.next();
		
		 switch (rand) { 
	        case 1: 
	            System.out.println( "no"); 
	            break; 
	        case 2: 
	        	System.out.println( "yes"); 
	            break; 
	        case 3: 
	        	System.out.println("glitch"); 
	            break; 
	        case 4: 
	        	System.out.println("haha"); 
	            break; 
	        case 5: 
	        	System.out.println("???????") ; 
	            break; 
		 }
		}while(rand < 10);
	}

}

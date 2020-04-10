import java.util.Scanner;

public class Lab3A3 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the year:");
		 int year  = a.nextInt();
		 boolean a1 = true;
		 
		 if(year % 4 == 0){  
			
			 if( year % 100 == 0){
	                if ( year % 400 == 0) {
	                    a1 = true;
	                } else {
	                    a1 = false;
	                } 
	               } 
			 else
	                a1 = true;
	        }
	        else
	            a1 = false;
	        
		 if(a1)
	            System.out.println(year + " is a leap year.");
	        else
	            System.out.println(year + " is not a leap year.");
	
	}
}
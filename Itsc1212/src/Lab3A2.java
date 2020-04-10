import java.util.*;

public class Lab3A2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Hi, Welcome membered customers, Please enter your membership status code");
		 int sCode  = a.nextInt();
			 
			 if(sCode == 2014) {
				System.out.println("You got 15% discount");
				
				 System.out.println("What is the bill amount");
				 double amount  = a.nextDouble();
				 
				 double price = amount + (amount*.046)-(amount*.15);
				 System.out.println("Your price is " + price);
			 }else if (sCode == 2015){
				System.out.println("You got 10% discount");
				
				 System.out.println("What is the bill amount");
				 double amount  = a.nextDouble();
				 
				 double price = amount + (amount*.046)-(amount*.1);
				 System.out.println("Your price is " + price);
			 }else if (sCode == 2016){
				System.out.println("You got 5% discount");
				
				 System.out.println("What is the bill amount");
				 double amount  = a.nextDouble();
				 
				 double price = amount + (amount*.046)-(amount*.05);	 
				 System.out.println("Your price is " + price);
			 }else {
					System.out.println("You got No discount");
					
					 System.out.println("What is the bill amount");
					 double amount  = a.nextDouble();
					 
					 double price = amount + (amount*.046);
					 System.out.println("Your price is " + price);
			 }
			 
			 
			 
	}
}

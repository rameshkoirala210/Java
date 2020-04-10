import java.util.*;

public class Lab7A1 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		  double first = a.nextDouble();
		System.out.println("Enter 2nd number : ");
		  double second = a.nextDouble();
		  
		  int choice = 0;
		  while(choice >= 0) {
		  System.out.println("What would you like to do with those numbers?\n Menu \n");
		  showMenu();
		  choice = a.nextInt();
		  
		  switch (choice){
		  case 1 : 
			 
			  System.out.println(add(first,second));
		   
		   break;
		  case 2:
			
			  System.out.println(subtract(first,second)); 
		   
		   break;
		  case 3:
			  
			  System.out.println(multiply(first,second));
		   
		   break;
		  case 4: 
			 
			  System.out.println(division(first,second));
		   
		   break;
		  case 5 :
			
			  System.out.println(square(first)); 
			  System.out.println(square(second)); 
		   
		   break;
		  case 6: 
			
			  System.out.println(remander(first,second)); 
		  
		   break;
		  case 7 : 

			  System.out.println(squareroot(first)); 
			  System.out.println(squareroot(second)); 
		   
		   break;
		  case -1 :
			  
			  System.out.println("bye");  
			   
		   break;
		  }
		 }
	}
	public static String showMenu() {
		return (" 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Square \n 6. Remander \n 7. Square Root \n -1. Exit");
	}public static double add(double a, double b) {
		return a+b;
	}public static double subtract(double a, double b){
		return a - b; 
	}public static double multiply(double a, double b){
		return a * b; 
	}public static double division(double a, double b){
		return (a / b); 
	}public static double square(double a){
		return Math.pow(a, 2);
	}public static double remander (double a, double b){
		return a%b;
	}public static double squareroot(double a){
		return Math.pow(a, .5);
	}
}	

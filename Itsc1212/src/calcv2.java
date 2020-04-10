import java.util.Scanner;

public class calcv2 {
	public static void main(String[] args){
	
	  
	System.out.println("Welcome to world of Math Functions!!!");
	  
	Scanner a = new Scanner(System.in);
	  
	
	System.out.println("Enter 1st number");
	  int first = a.nextInt();
	System.out.println("Enter 2nd number : ");
	  int second = a.nextInt();
	  int ch = 0 ;
	  while(ch >= 0){
	  System.out.println("What would you like to do with those numbers?\n Menu \n");
	  System.out.println(" 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Square \n 6. Remander \n 7. Square Root \n -1. Exit");
	    ch = a.nextInt();
	  
	  switch (ch){
	  case 1 : 
		 
		  System.out.println(add(first,second));
	   
	   break;
	  case 2:
		
		  System.out.println(subtract(first,second)); //add code to subtract
	   
	   break;
	  case 3:
		  
		  System.out.println(multiply(first,second)); //add code to multiply
	   
	   break;
	  case 4: 
		 
		  System.out.println(division(first,second)); // add code to divide. 
	   
	   break;
	  case 5 :
		
		  System.out.println(square(first)); //add code to show square of number
	   
	   break;
	  case 6: 
		
		  System.out.println(remander(first,second)); // add code to remander. 
	  
	   break;
	  case 7 : 

		  System.out.println(squareroot(first)); // add code to squareroot. 
	   
	   break;
	  case -1 :
		  
		  System.out.println("bye"); // add code to Exit. 
		   
		   break;
	  }
	  }
}
	private static int add(int a, int b) //This method will add integers a and b
	{
		return a+b; //Something wrong with this line
	}
	
	private static int subtract(int a, int b)
	{
		return a - b; //It returns the subtraction of a and b.
	}
	
	private static int multiply(int a, int b) //hmm.. i wonder what is the error here.
	{
		return a * b;
	}
	
	private static double division(int a, int b)
	{
		return (a / b);//I forgot what goes in here, so please help me. 
	}
	
	private static double square(int a)
	{
		return Math.pow(a, 2);
	}
	private static double remander (int a, int b)
	{
		return a%b;
	}
	private static double squareroot(int a)
	{
		return Math.pow(a, .5);
	}
}

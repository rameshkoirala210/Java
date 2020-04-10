import java.io.IOException;
import java.util.Scanner;

public class Temp1 {
	
	public static void main(String[] args) throws IOException{
		  char choice;
		  Scanner RK = new Scanner(System.in);
		 
		  double first,second,answer;
		  
		  System.out.println("Enter First Number " );
		  first = RK.nextDouble();
		  
		  System.out.println("Enter Second Number");
		  
		  second= RK.nextDouble();
		  
		  System.out.println("please enter what operation you'd like");
		  System.out.println("1. ADD ");
		  System.out.println("2. SUBTRACT");
		  choice = (char) System.in.read();
		  switch (choice){
		  
		  case '1':
		   answer = first+second;
		   System.out.println(answer);
		   break;
		  case'2':
		   answer = first-second;
		   System.out.println(answer);
		   break;
		  }
		  
	 }
	 
}

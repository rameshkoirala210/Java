import java.util.Scanner;
//By Ramesh Koirala
//Verson 1?
//Date: 3/18/2020
//Pre05  
public class preLab05{
  public static void main(String[] args){
	  Scanner a = new Scanner(System.in);
	  
	  System.out.println("ID001");
	// Generate a random number to be guessed
	  int number = (int)(Math.random() * 101); 
	  System.out.println(number);
	  System.out.println("Guess a magic number between 0 and 100");
	  int guess;
	// Prompt the user to guess the number
	  do{
	  System.out.print("\nEnter your guess: ");
	   guess = a.nextInt();
	   
	   if (guess == number) {
		   System.out.println("Yes, the number is " + number);
	   }else if (guess > number) {
		    System.out.println("Your guess is too high");
	   }else {
		    System.out.println("Your guess is too low");
	   }
	  }while(guess != number);
	  
  }
}
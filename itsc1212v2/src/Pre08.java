import java.util.*;

//By Ramesh Koirala
//Verson 1?
//Date: 4/5/2020
//Pre08 
public class Pre08 {
 public static void main(String[] args) {
 
	 first();
	 
	 second();
	 
 }
 public static void first() {
 System.out.println("ID001");
 java.util.Scanner input = new java.util.Scanner(System.in);
 
 	System.out.print("Enter the numbers of items: ");
 	int n = input.nextInt();
	 double[] numbers = new double[n];
	 double sum = 0;
 
	 System.out.print("Enter the numbers: ");
	 	for (int i = 0; i < n; i++) {
	 		numbers[i] = input.nextDouble();
	 		sum += numbers[i];
	 	}

	 	double average = sum / n;
 
	 	int count = 0; // The numbers of elements above average
	 		for (int i = 0; i < n; i++)
	 			if (numbers[i] > average)
	 				count++;
	 			System.out.println("Average is " + average);
	 			System.out.println("Number of elements above the average is "+ count);

 }  public static void second() {
	 System.out.println("ID002");
	 
	int[] deck = new int[52];
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	for (int i = 0; i < deck.length; i++)
		 deck[i] = i;
	
	for (int i = 0; i < deck.length; i++) {
		int index = (int)(Math.random() * deck.length);
		int temp = deck[i];
		deck[i] = deck[index];
		deck[index] = temp;
	}
	
	for (int i = 0; i < 4; i++) {
		String suit = suits[deck[i] / 13];
		String rank = ranks[deck[i] % 13];
		 System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
}
}

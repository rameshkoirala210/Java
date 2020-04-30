import java.util.Scanner;
public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		int[] deck = new int[52];
		String[] suits = {"Hearts", "Clubs", " Diamonds" , "Spades"};
		String[] ranks = {"Ace", "2", " 3" , "4" , " 5" , "6" , "7" , "8" , " 9" , "10" , "Jack" , "Queen" , "King"};

		for(int i = 0; i < deck.length; i ++) {
			deck[i] = i;
		}

		int x = 0, y = 0;
		System.out.println("Please enter two index positions");
		x  = input.nextInt();
		y  = input.nextInt();
		String suit = suits[deck[x] / 13];
		String rank = ranks[deck[x] % 13];
		System.out.println("Your first card is the " + rank + " of " + suit);
		suit = suits[deck[y] / 13];
		rank = ranks[deck[y] % 13];
		System.out.println("Your second card is the " + rank + " of " + suit);
		int greater = compareTo(x, y);
		suit = suits[deck[greater] / 13];
		rank = ranks[deck[greater] % 13];
		System.out.println("The greater of the two cards was the " + rank + " of " + suit + " at " + deck[greater]);
	}
	public static int compareTo(int x, int y) {
		int max = 0;
		if ( x > y ) {
			return x;
		}
		if ( y > x ) {
			return y;
		}
		return max;
			
	}

}

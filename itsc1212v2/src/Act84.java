
public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", " Diamonds" , "Clubs"};
		String[] ranks = {"Ace", "2", " 3" , "4" , " 5" , "6" , "7" , "8" , " 9" , "10" , "Jack" , "Queen" , "King"};

		for(int i = 0; i < deck.length; i ++) {
			deck[i] = i;
		}

		for(int i = 0; i < 52; i ++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}

}

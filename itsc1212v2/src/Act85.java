public class Act5 {

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
		System.out.println(" ");

		shuffle(deck);
		
		for(int i = 0; i < 52; i ++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
		
		
	}
	public static int[] shuffle(int[] deck) {
		for(int j = 0; j < 100; j ++ ) {
			
		
			for(int i = 0; i < deck.length; i ++) {
				int index  = (int)(Math.random()  * deck.length);
				int temp = deck[i];
				deck[i] = deck[index];
				deck[index] = temp;			
			}
		}
		
		return deck;
		
	}

}

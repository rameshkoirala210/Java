import java.util.*;

//By Ramesh Koirala
//Verson 1?
//Date: 4/12/2020
//Post08 

public class post08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ID001");
		String[] deck = makeDeck();
		String[] sDeck = shuffleDeck(deck);
		boolean loopContinue = true;
		
		while (loopContinue) {
			System.out.print("What part do you want to do?(-1 to exit): ");
			int menuChoice = (int)input.nextInt();
			
			
			if (menuChoice == 1) {
				
				sDeck = shuffleDeck(sDeck);
				System.out.print("Enter card location (0 to 51): ");
				int userNum = (int)input.nextInt();
				
				int randNum = getRandomCard();
				System.out.println("Computer chose: " + randNum);
				System.out.println("You have a " + sDeck[userNum]);
				System.out.println("Computer has a " + sDeck[randNum]);
				int winner = getHighest(sDeck[userNum], sDeck[randNum]);
				if (winner == 1)
					System.out.println("You have a higher card");
				else
					System.out.println("Computer has a higher card");
			}
			else if (menuChoice == 2) {
		
				int winner, comp1Wins = 0, comp2Wins = 0;
		
				sDeck = shuffleDeck(sDeck);
				int numGames = 0;
				
				while (numGames < 100) {
					
					int randNum1, randNum2;
					randNum1 = getRandomCard();
					randNum2 = getRandomCard();
					
					System.out.println("Computer 1 has " + sDeck[randNum1]);
					System.out.println("Computer 2 has " + sDeck[randNum2]);
					
					winner = getHighest(sDeck[randNum1], sDeck[randNum2]);
					if (winner == 1) {
						System.out.println("Computer 1 has a higher card");
						comp1Wins++;
					}else {
						System.out.println("Computer 2 has a higher card");
						comp2Wins++;
					}
					numGames++;
				}
				if (comp1Wins > comp2Wins) {
					System.out.println("Computer 1 had " + comp1Wins + " wins");
				}else {
					System.out.println("Computer 2 had " + comp2Wins + " wins");
				}
			}else if (menuChoice == -1) {
				loopContinue = false;
				String exitString = exit();
				System.out.println(exitString);
			}else
				System.out.println("Not a valid input");
		}

	}
public static String[] makeDeck() {
		String[] cardNames = new String[52];
		String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King"};

		int i = 0, j = 0, cardNum = 0;
		for (i = 0; i < suits.length; i++) {
			for (j = 0; j < ranks.length; j++) {
				cardNames[cardNum] = ranks[j] + " of " + suits[i];
				cardNum++;
			}
		}
		return cardNames;	
	}public static String[] shuffleDeck(String[] deck) {
		
		int i = 0, j = 0, cardNum;
		for (i = 0; i < 100; i++) {
			cardNum = 0;
			for (j = 0; j < deck.length; j++) {
				int randIndex = getRandomCard();
				String temp;
				temp = deck[cardNum];
				deck[cardNum] = deck[randIndex];
				deck[randIndex] = temp;
				cardNum++;
			}
			i++;
		}
		return deck;
	}public static int getRandomCard() {
		int randNum = (int)(Math.random() * 52);
		return randNum;
	}public static int getHighest(String card1, String card2) {
		int card1FirstSpace = card1.indexOf(" ");
		int card2FirstSpace = card2.indexOf(" ");
		
		String card1Rank = card1.substring(0, card1FirstSpace);
		String card1Suit = card1.substring((card1FirstSpace + 4));
		
		String card2Rank = card2.substring(0, card2FirstSpace);
		String card2Suit = card2.substring((card2FirstSpace + 4));
		
		int card1RankNumber = rankConverter(card1Rank);
		int card1SuitNumber = suitConverter(card1Suit);
		int card2RankNumber = rankConverter(card2Rank);
		int card2SuitNumber = suitConverter(card2Suit);

		if (card1SuitNumber == card2SuitNumber) {

			if (card1RankNumber > card2RankNumber) {
				return 1;
			}else {
				return 2;
			}
		}else if (card1SuitNumber > card2SuitNumber) {
			return 1;
		}else {
			return 2;
		}
	}public static int rankConverter(String rankWord) {
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King"};
		
		int i = 0, rankNum = 0;
		for (i = 0; i < ranks.length; i++) {
			if (ranks[i].equals(rankWord)) {
				rankNum = i + 1;
				break;
			}	
		}
		return rankNum;
	}public static int suitConverter(String suitWord) {
		String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
		
		int i = 0, suitNum = 0;
		for (i = 0; i < suits.length; i++) {
			if (suits[i].equals(suitWord)) {
				suitNum = 4 - i;
				break;
			}
		}
		return suitNum;
	}
	public static String exit() {
			return "Goodbye!";
	}

}

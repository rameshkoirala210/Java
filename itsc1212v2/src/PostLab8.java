/*
 * @author Christian Madajski
 * @date 04/11/2020
 * @version 1.0
 * 
 * Description:
 * Post Lab 8. Make a card game with two parts: part one allows a user to play against the
 * computer, part two puts two computer players against one another for 100 iterations.
 * 
 * Pseudocode:
 * generate a deck of cards
 * shuffle the deck of cards
 * ask user what part of the program they want to run
 * PART 1
 * shuffle the deck again
 * ask user for number between 0 and 51
 * generate a random number between 0 and 51
 * display the user card and computer card
 * determine which card is higher
 * display who has the highest card
 * PART 2
 * shuffle the deck again
 * generate two numbers between 0 and 51
 * display the cards for computer1 and computer2
 * determine which card is higher
 * display who has the highest card
 * run game 100 times
 * display which computer had the most wins over 100 iterations
 * if user enters -1, generate goodbye message
 * display goodbye message
 */

import java.util.*;
public class PostLab8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ID001");
		String[] deck = makeDeck();
		String[] sDeck = shuffleDeck(deck);
		boolean loopContinue = true;
		
		while (loopContinue) {
			System.out.print("What part do you want to do? ");
			int menuChoice = (int)input.nextInt();
			
			//PART 1
			if (menuChoice == 1) {
				//shuffle the deck
				sDeck = shuffleDeck(sDeck);
				//ask user for index number between 0 and 51
				System.out.print("Enter a card location from 0 to 51: ");
				int userNum = (int)input.nextInt();
				//generate a random number between 0 and 51, display for user
				int randNum = getRandomCard();
				System.out.println("Computer chose: " + randNum);
				//display card selections for user and computer
				System.out.println("You have a " + sDeck[userNum]);
				System.out.println("Computer has a " + sDeck[randNum]);
				//see which card is highest
				int winner = getHighest(sDeck[userNum], sDeck[randNum]);
				if (winner == 1)
					System.out.println("You have a higher card");
				else
					System.out.println("Computer has a higher card");
				System.out.println("-------------------------------");
			}
			
			//PART 2
			else if (menuChoice == 2) {
				//main variables
				int winner, comp1Wins = 0, comp2Wins = 0;
				//shuffle the deck
				sDeck = shuffleDeck(sDeck);
				int numGames = 0;
				//run the game 100 times
				while (numGames < 100) {
					//generate two random numbers between 0 and 51
					int randNum1, randNum2;
					randNum1 = getRandomCard();
					randNum2 = getRandomCard();
					//display card selections for the user
					System.out.println("Computer 1 has " + sDeck[randNum1]);
					System.out.println("Computer 2 has " + sDeck[randNum2]);
					//see which card is highest
					winner = getHighest(sDeck[randNum1], sDeck[randNum2]);
					if (winner == 1) {
						System.out.println("Computer 1 has a higher card");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						//comp1Wins tracks number of wins for computer 1
						comp1Wins++;
					}
					else {
						System.out.println("Computer 2 has a higher card");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						//comp2Wins tracks number of wins for computer 2
						comp2Wins++;
					}
					numGames++;
				}
				//display which computer had the highest score after 100 iterations
				if (comp1Wins > comp2Wins)
					System.out.println("Computer 1 had " + comp1Wins + " wins");
				else
					System.out.println("Computer 2 had " + comp2Wins + " wins");
				System.out.println("-----------------------------------");
			}
			
			//EXIT
			else if (menuChoice == -1) {
				//when loopContinue is false, main loop ends
				loopContinue = false;
				//we get a string from method exit()
				String exitString = exit();
				//display the exit string
				System.out.println(exitString);
			}
			else
				System.out.println("Not a valid input");
			
		}

	}

	public static String[] makeDeck() {
		//two arrays, one for suit values and the other for rank values
		String[] cardNames = new String[52];
		String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King"};
		
		//initialize the card values
		int i = 0, j = 0, cardNum = 0;
		//outer loop for suit values
		for (i = 0; i < suits.length; i++) {
			//inner loop for rank values
			for (j = 0; j < ranks.length; j++) {
				cardNames[cardNum] = ranks[j] + " of " + suits[i];
				cardNum++;
			}
		}
		//we return the 52 card array to initialize the deck array back in main()
		return cardNames;
		
		//this loop produces a deck that is grouped by suits highest to lowest,
		//sub-grouped by rank from lowest to highest
		
	}
	public static String[] shuffleDeck(String[] deck) {
		
		int i = 0, j = 0, cardNum;
		//outer loop repeats shuffling process 100 times
		for (i = 0; i < 100; i++) {
			cardNum = 0;
			//inner loop actually shuffles cards at each index of the deck array
			for (j = 0; j < deck.length; j++) {
				//generate random index number between 0 and 51
				int randIndex = getRandomCard();
				//create temp variable for swapping two values
				String temp;
				//swap two values in the array
				temp = deck[cardNum];
				deck[cardNum] = deck[randIndex];
				deck[randIndex] = temp;
				cardNum++;
			}
			i++;
		}
		//we return an array with all the same values as makeDeck(), but the positions are changed
		return deck;
	}
	//generates a random card in a 52 card deck
	public static int getRandomCard() {
		int randNum = (int)(Math.random() * 52);
		return randNum;
	}
	//determine the highest card of two cards
	public static int getHighest(String card1, String card2) {
		
		//find the index of the first space
		int card1FirstSpace = card1.indexOf(" ");
		int card2FirstSpace = card2.indexOf(" ");
		
		//break the first string into components
		//the rank is all the characters up to the first space
		String card1Rank = card1.substring(0, card1FirstSpace);
		//the suit is all the characters after the second space
		String card1Suit = card1.substring((card1FirstSpace + 4));
		
		//break the second string into components
		String card2Rank = card2.substring(0, card2FirstSpace);
		String card2Suit = card2.substring((card2FirstSpace + 4));
		
		//turn the string values into integer values using custom methods
		int card1RankNumber = rankConverter(card1Rank);
		int card1SuitNumber = suitConverter(card1Suit);
		int card2RankNumber = rankConverter(card2Rank);
		int card2SuitNumber = suitConverter(card2Suit);
		
		//compare integer values of suits and ranks
		//first check, suits: spades > diamonds > hearts > clubs
		//second check, ranks: ace < 2 < 3 < ... < jack < queen < king
		
		//if the suits are of equal value, check the ranks
		if (card1SuitNumber == card2SuitNumber) {
			//if card1 has higher rank, it wins
			if (card1RankNumber > card2RankNumber) {
				return 1;
			}
			//if card 2 has higher rank, it wins
			else {
				return 2;
			}
		}
		//if card1 has higher suit, it wins
		else if (card1SuitNumber > card2SuitNumber) {
			return 1;
		}
		//if card2 has higher suit, it wins
		else {
			return 2;
		}
	}
	//takes in a rank in word form, converts it into an integer for easy comparison
	public static int rankConverter(String rankWord) {
		//notice that the value of each element in the array is equal to the index of
		//that element + 1, which makes it easy to assign values
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
	}
	//takes in a suit in word form, converts it into an integer for easy comparison
	public static int suitConverter(String suitWord) {
		//notice that the value of each element in the array goes from highest value to
		//lowest value, meaning we have to value the suits in reverse order
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
	//generates an exit message
	public static String exit() {
		//generate a random number between 1 and 4
		int randNum = (int)((Math.random() * 4) + 1);
		//return one of the four exit messages
		if (randNum == 1)
			return "Program has ended.";
		else if (randNum == 2)
			return "Good riddance to you!";
		else if (randNum == 3)
			return "Hasta la vista, baby.";
		else if (randNum == 4)
			return "Goodbye :(";
		else
			return "NUMERICAL ERROR!";
	}

}

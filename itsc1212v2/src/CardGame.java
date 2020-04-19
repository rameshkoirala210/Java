import java.util.*;

//By Ramesh Koirala
//Verson 1?
//Date: 4/12/2020
//Post08 

public class CardGame {
    public static void main(String[] args) {
        System.out.println("ID001");
        String[] deck=makeDeck();
        String [] sDeck=shuffleDeck(deck);


        // loop {

            // Ask the user which part they want to do
            // if the user chooses part 1 {
                // get the user choice and the computer's choice
                // Make sure the choices are valid. The user should not
                // be able to enter card 150000.

                // Get the value of the card from each choice. Note
                // that the deck should be SHUFFLED. So if the human chooses card
                // card 34, and the computer chooses card 2, the computer
                // still might have a higher value card

                // Your goal is to have the value of the card the human chose
                // and have a value of the card the computer chose.
                // You should be able to pass in the deck array display
                // the card suits and ranks
                declareWinner(humanCardValue, computerCardValue, deck);
            // } else {
                // since the user chose part 2
                // loop a hundred times {
                    // get the winner for both computers for each round
                    // NOTE: HOW DOES THE PROGRAM KNOW WHO WON?
                    // do you need to change the declareWinner method?
                    // Will it need to return anything? And how?

                    // Collect the number of wins for each

                // }
                // Display the number of wins for each and who won.


            // }
        // }
    }

    public static String[] makeDeck(){
        String[] suits={"hearts","spades","clubs","diamonds"};
        String[]rank={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String sortedDeck = ranks[this.rank] + " of " + suits[this.suit];

        return sortedDeck;
    }

    public static String[] shuffleDeck(String [] deck){
        String[] shuffled=new String[52];
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        return shuffled;
    }
    // Some kind of declareWinner method {
        // Question you should ask:
        /*
        Does this need to return the results or can I just
        display the results in here?
        The values of the cards are strings. If the corresponding
        string in the sorted deck is lower, then the corresponding string
        from the computer's then who do you think has the higher value card?
         */
    //}
}

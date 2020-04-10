import java.util.*;
//By Ramesh Koirala
//Verson 1?
//Date: 2/18/2020
//
public class Post3 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("ID001");
		System.out.println("Would you like to pick a card? Y/N");//ask user quwstion
		 String card = a.next();//saving it as string
		 
		 if (card.equals("Y")) {//if user input is Y
			 int faceValue = (int) ( Math.random() * 13 + 1);//getting random number
			 int suit = (int) ( Math.random() * 3);//random suit
			 System.out.print("you got a ");
			 if(faceValue == 1) {//another if statement
				 System.out.print("Ace ");
				 if(suit == 0) {//if statement to get suit
					 System.out.print("of Hearts");
				 }else if(suit == 1) {
					 System.out.print("of Dimonds");
				 }else if(suit == 2) {
					 System.out.print("of Clubs");
				 }else if(suit == 3) {
					 System.out.print("of Spades");
				 }
			 }else if(faceValue > 1 || faceValue < 11) {//if face value is greater then 1 and less then 11
				 System.out.print(faceValue );
				 if(suit == 0) {//if statement to get suit
					 System.out.print(" of Hearts ");
				 }else if(suit == 1) {
					 System.out.print(" of Dimonds ");
				 }else if(suit == 2) {
					 System.out.print(" of Clubs ");
				 }else if(suit == 3) {
					 System.out.print(" of Spades ");
				 }
			 }if(faceValue == 11) {//if its 11
				 System.out.print("Jack ");
				 if(suit == 0) {//if statement to get suit
					 System.out.print("of Hearts");
				 }else if(suit == 1) {
					 System.out.print("of Dimonds");
				 }else if(suit == 2) {
					 System.out.print("of Clubs");
				 }else if(suit == 3) {
					 System.out.print("of Spades");
				 }
			 }if(faceValue == 12) {//if its 12
				 System.out.print("Queen ");
				 if(suit == 0) {//if statement to get suit
					 System.out.print("of Hearts");
				 }else if(suit == 1) {
					 System.out.print("of Dimonds");
				 }else if(suit == 2) {
					 System.out.print("of Clubs");
				 }else if(suit == 3) {
					 System.out.print("of Spades");
				 }
			 }if(faceValue == 13) {//if its 13
				 System.out.print("King ");
				 if(suit == 0) {//if statement to get suit
					 System.out.print("of Hearts");
				 }else if(suit == 1) {
					 System.out.print("of Dimonds");
				 }else if(suit == 2) {
					 System.out.print("of Clubs");
				 }else if(suit == 3) {
					 System.out.print("of Spades");
				 }
			 }
		 }else{
			 System.out.print("Bye");
		 }
			 
		
	}
}
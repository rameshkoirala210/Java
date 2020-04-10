/*
 *Program Name: Fortune Teller 
 * 
 * Name: Ramesh Koirala
 * Verson/Date: 2/18/20
 * Lab Selection: ITSC1212-002
 * 
 * Purpose: Purpose is to give user 3 options to tell that users fortune the choice are between 
 * 1: Lucky Number
 * 2: Magic Number
 * 3: Horoscope
 * After that we just find their lucky or not 
 * their magic number or what their zodiac sign is
 */


import java.util.*;

	public class FortuneTeller{
		public static void main(String[] args) {
		  Scanner a = new Scanner(System.in);
		  		//getting Information from user
		    System.out.println("Enter First and Last Name: ");//first and last name
			String first  = a.next();
			String last  = a.next();
			
			System.out.println("What year were you born(enter 4 digits for the year) ");//birth year
			int year  = a.nextInt();
			System.out.println("What month were you born(enter 1-12) ");//month they were born
			int month  = a.nextInt();
			double m1 = month;
			System.out.println("What day of the month were you born(enter 1-31) ");//day they were born
			int day  = a.nextInt();
			//options for user
			System.out.println("Options For The User");
			System.out.println("1: Lucky Number");
			System.out.println("2: Magic Number");
			System.out.println("3: Horoscope");
			//choosing one option
			System.out.println("Choose One of this Choices(put 1 for option 1, 2 for option 2, 3 for option 3) ");
			int chosen  = a.nextInt();
			//first choice
			if (chosen == 1) {//if statement for choice
				int random = (int) (Math.random() * 8 + 1);//gives you random number 
				if(random > 3 && random < 8) {//another if statement 
					System.out.println(first + last + ", You are a vary lucky Person");
				}else if(random == 8 || random == 2) {
					System.out.println(first + last + ", You are Extremely unlucky");
				}else if (random < 3 && random > 1){
					System.out.println(first + last + ", You are just barely lucky");
				}
		
			}else if (chosen == 2) {//second choice
				final int magic_Range = 110; //final makes it so it's constant
				double magicNumber = (year*month) % magic_Range;//finding magic Nuber
				System.out.println("Your Magical Number is " + magicNumber);
			
			}else if (chosen == 3) {//third choice
				if(month == 1) {//another if statement for choice 3
					if (day <= 19) {
						System.out.println("Capricorn, Bye!");
					}else {																					//ps: there is probably a better way but personally 
						System.out.println("Aquarius, Bye!");												// this was easier for me.
					}
				}else if(month == 2){	//if you picked month	2											
					if (day <= 18) {
						System.out.println("Aquarius, Bye!");
					}else {
						System.out.println("Pisces, Bye!");
					}
				}else if(month == 3){	//if you picked month	3	
					if (day <= 20) {
						System.out.println("Pisces, Bye!");
					}else {
						System.out.println("Aries, Bye!");
					}
				}else if(month == 4){	//if you picked month	4
					if (day <= 19) {
						System.out.println("Aries, Bye!");
					}else {
						System.out.println("Taurus, Bye!");
					}
				}else if(month == 5){	//if you picked month	5
					if (day <= 21) {
						System.out.println("Taurus, Bye!");
					}else {
						System.out.println("Gemini, Bye!");
					}
				}else if(month == 6){	//if you picked month	6
					if (day <= 21) {
						System.out.println("Gemini, Bye!");
					}else {
						System.out.println("Cancer, Bye!");
					}
				}else if(month == 7){	//if you picked month	7
					if (day <= 23) {
						System.out.println("Cancer, Bye!");
					}else {
						System.out.println("Leo, Bye!");
					}
				}else if(month == 8){	//if you picked month	8
					if (day <= 23) {
						System.out.println("Leo, Bye!");
					}else {
						System.out.println("Vergo, Bye!");
					}
				}else if(month == 9){	//if you picked month	9
					if (day <= 23) {
						System.out.println("Leo, Bye!");
					}else {
						System.out.println("Libra, Bye!");
					}
				}else if(month == 10){	//if you picked month	10
					if (day <= 23) {
						System.out.println("Libra, Bye!");
					}else {
						System.out.println("Scorpio, Bye!");
					}
				}else if(month == 11){ //if you picked month	11
					if (day <= 23) {
						System.out.println("Scorpio, Bye!");
					}else {
						System.out.println("Sagittarius, Bye!");
					}
				}else if(month == 12){ //if you picked month 12
					if (day <= 23) {
						System.out.println("Sagittarius, Bye!");
					}else {
						System.out.println("Capricorn, Bye!");
					}
				}
			}else {//if user put something else
				System.out.println("Booooo you a loser, get out");
			}			 	
	}
}

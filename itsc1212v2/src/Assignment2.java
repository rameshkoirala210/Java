import java.util.*;

/*By Ramesh Koirala
 *Verson 1?
 *Date: 3/29/2020
 *Assignment 2
 * psudocode--(not really that good at psudocode)
 * Start= ask a user for a main sentence     (read line 21 for more)
 * make string variables
 * next = do while loop until exit option and if statement 
 * 1st statement= ask's user for a new main sentence which is in method, saved as mainsentence
 * 2nd statement = ask's user for word which goes to method, method returns index of the word and if statement runs and prints out options
 * 3rd statement =asks for a letter and goes to method using do while method it finds where that letter is and prints it in main method
 * ps. found it wired why we couldnt just sent an int to the top.
 * 4th statement =ask for a word and in the method change the first letter to upper case and replace it in main sentence and print it in choice 4
 * 5th statement =asks for word in main sentence and word to replace with and replaces it in main sentence and prints it out
 * 6th statement =goes to method and counts how many words there are and not spaces and prints how many letter there is
 * 7th statement =asks user to input a word and goes to method, using index and while method determine how many there are in main sentence and print it out in main
 * 8th statement = in method turn main sentence to array list then use for statement for a loop  to check how many letters there are
 * 9th statement =ask user for a word and in method use replace all to replace the word with blank then print it in main.
 * 10th statement = return by in method and print it in main
 * 
 */

public class Assignment2 {
	public static void main(String[] args) {//main method
		Scanner a = new Scanner(System.in);
		
		
		String  mainSentence = newMainSentence();//first asking for the main sentence and again in choice 1 if they want to change it ps.i was confused if you wanted me to leave it blank or not
		String word = "", choice;
		
		do {//do while loop so it can loop again. 
		menu();//with all options
		System.out.println("\nEnter Your Choice: ");
		choice = a.next();
		
		if(choice.equals("A") ||choice.equals("a")) {//choice a 
			//newMainSentence();
			
			mainSentence = newMainSentence();
		
		}else if(choice.equals("B") ||choice.equals("b")) {//choice b
			System.out.println("Enter the search string: ");
			word = a.next();
			if(searchStringIndex(mainSentence,word) == - 1) {
		         System.out.println(word + "not found");
		      } else {
		         System.out.println(word + " found at " + searchStringIndex(mainSentence,word));
		      }
		}else if(choice.equals("C") ||choice.equals("c")) {//choice c ps.was the hardest thing to do in this assignment
			
			System.out.println("Enter the letter you want to find all incidents for: ");
			word = a.next();
			
			System.out.println(searchAllString(mainSentence,word));
			
		}else if(choice.equals("D") ||choice.equals("d")) {//choice d
			System.out.println("Enter the search string: ");
			word = a.next();
			System.out.println("Do you want to capitalize the string (y or n): ");
			String aword = a.next();
			if (aword.equals("n") ||aword.equals("N")) {
				System.out.println(mainSentence);
			}else if(aword.equals("y") ||aword.equals("y")) {
				System.out.println(capitalizeString(mainSentence, word));
			}
			
		}else if(choice.equals("E") ||choice.equals("e")) {//choice e
			System.out.println("Enter the search string: ");
			String searchWord = a.next();
			System.out.println("Enter the replacing string: ");
			String replaceWord = a.next();
			System.out.println(replaceString(mainSentence, searchWord, replaceWord));
		
		}else if(choice.equals("F") ||choice.equals("f")) {//choice f
			System.out.println(mainSentence);
			System.out.println("Number of words: " + countWords(mainSentence));
		
		}else if(choice.equals("G") ||choice.equals("g")) {//choice g
			System.out.println("Enter a letter to count the number of occurrences: ");
			word = a.next();
			
			System.out.println("The number of letters are " +countOccurrencesLetter(mainSentence, word));
		
		}else if(choice.equals("H") ||choice.equals("h")) {//choice h
			System.out.println(mainSentence);
			System.out.println("The number of letters are: " + countLetters(mainSentence));
		
		}else if(choice.equals("I") ||choice.equals("i")) {//choice i
			System.out.println("Enter a word to delete: ");
			word = a.next();
			
			System.out.println("The new Main Sentence is: " + deleteWord(mainSentence, word));
		
		}else if(choice.equals("J") ||choice.equals("j")) {//choice j
			System.out.println(exit());
		}
	}while(!choice.equals("j")|| !choice.equals("J"));//if they put j it ends after it runs j
	}
	public static void menu() {//menu options
		System.out.println("Choices: ");
		System.out.println("A. Enter a new Main Sentence: ");
		System.out.println("B. Search for a String");
		System.out.println("C. Search for all incidents of a stringD.");
		System.out.println("D. Search for and capitalize a String if necessary");
		System.out.println("E. Replace all incidents of a string to another one");
		System.out.println("F. Count the number of words");
		System.out.println("G. Count the number of occurrences of a letter");
		System.out.println("H. Count the total number of letters");
		System.out.println("I. Delete all occurrences of a word");
		System.out.println("J. Exit");
	} public static String newMainSentence(){//changing main sentence method a
		Scanner a = new Scanner(System.in);
		System.out.println("Input a new Main Sentence: ");
		String mainSentence = a.nextLine();
			
		System.out.println("The new Main Sentence is: " + mainSentence);
		return mainSentence;
	
	}
	
	public static int searchStringIndex(String mainSentence, String word){//method b 
		int index = mainSentence.indexOf(word);
		return index;
	
	}
	
	public static String searchAllString(String mainSentence, String word){//method c vary hard- took longer then all other option combined 

		int l = -1;
		String ab = "";
		do {
         l += 1;
			l = mainSentence.indexOf(word, l);
			if (l != -1) {
				System.out.println("found at: "+ l);
			}
		}while(l != -1);
		
		return ab;
	}
	
	public static String capitalizeString(String mainSentence, String word){////method d
			String w1 = word;
			 String a = word.substring(0, 1).toUpperCase() + word.substring(1);
			 String output = mainSentence.replaceAll(w1,a);
			 return output;
	
	}public static String replaceString(String mainSentence, String searchWord, String replaceWord){//method e
		String replaceString = mainSentence.replace(searchWord,replaceWord);
		return replaceString;
	
	}public static int countWords(String mainSentence){//method f
		int count = 0;
        if (!(" ".equals(mainSentence.substring(0, 1))) || !(" ".equals(mainSentence.substring(mainSentence.length() - 1)))){
            for (int i = 0; i < mainSentence.length(); i++){
                if (mainSentence.charAt(i) == ' '){
                    count++;
                }
            }
            count = count + 1; 
        }
        return count;
		
	}public static int countOccurrencesLetter(String mainSentence, String word){//method g
		int counter = 0;
		
		int index = mainSentence.indexOf(word);
		while(index >= 0) {
		    index = mainSentence.indexOf(word, index+1);
		    counter++;
		}
		return counter;
		
	}public static int countLetters(String mainSentence){//method h
		char[] ch = mainSentence.toCharArray();
		int letter = 0;
		
		for(int i = 0; i < mainSentence.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
		}
		return letter;
   
	}public static String deleteWord(String mainSentence, String word){//method i
		String a = mainSentence.replaceAll(word, "");
		return a;
	
	}public static String exit(){//method j
		return ("Bye");
	}
}

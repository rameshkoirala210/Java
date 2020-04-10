import java.util.*;

//By Ramesh Koirala
//Verson 1?
//Date: 4/5/2020
//Pre08 

public class Pre08part3 {
 
	public static void main(String args[]) {
 
		// Declare and create an array
		char[] chars = createArray();
 
		System.out.println("The lowercase letters are:");
 		displayArray(chars);
 
 		int[] counts = countLetters(chars);
 		
 		System.out.println();
 		System.out.println("The occurrences of each letter are:");
 		displayCounts(counts);
	}
 /** Create an array of characters */
 public static char[] createArray() {
 
 char[] chars = new char[100];
 
 for (int i = 0; i < chars.length; i++)
 chars[i] = RandomCharacter.getRandomLowerCaseLetter();
 
 return chars;
 }
 /** Display the array of characters */

 public static void displayArray(char[] chars) {
 
	 
	 for (int i = 0; i < chars.length; i++) {
		 if ((i + 1) % 20 == 0)
			 System.out.println(chars[i] + " ");
		 else
			 System.out.print(chars[i] + " ");
	 }
 }

 public static int[] countLetters(char[] chars) {

 	int[] counts = new int[26];
 
 		for (int i = 0; i < chars.length; i++)
 			counts[chars[i] - 'a']++;
 		return counts;
 	}

 public static void displayCounts(int[] counts) {
	 
	 for (int i = 0; i < counts.length; i++) {
		 if ((i + 1) % 10 == 0)
			 System.out.println(counts[i] + " " + (char)(i + 'a'));
		 else
			 System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
	 }
 }
}
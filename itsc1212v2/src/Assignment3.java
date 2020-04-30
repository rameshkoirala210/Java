import java.util.*;
/*By Ramesh Koirala
 *Verson 1?
 *Date: 4/21/2020
 *Assignment 3
 *Description: In this assignment we are using Arrays and making an option of 1-5 to see if the user want to linear search, binary search, bubble sort,
 *selection sort their arrays.
 *Psudocode-
 *get arrays from instruction
 *Ask user which they want to do and save it as choice, make if statement
 *in every choice take nanosecond at the start and and end and subtract them to show how long it took for that choice
 *Choice 1-print display method, ask for movie id, run and save the linearsearch method to result and make if statement so if result = -1 it's wrong and 
 *if it's right ask how many copies they want so you can multiply movie price * copies to get the total
 *Choice 2-print display method, ask for movie id, run and save the bianarysearch method to result and make if statement so if result = -1 it's wrong and 
 *if it's right ask how many copies they want so you can multiply movie price * copies to get the total
 *Choice 3-make a array, make a random generator to sort number into the array, print the random numbers as unsorted array, use bubblesort method to get the sorted array 
 *Choice 4-make a array, make a random generator to sort number into the array, print the random numbers as unsorted array, use Selectionsort method to get the sorted array 
 *In Method-----------------------------------------------------------------------------------------------------------------------------------------
 *display- format system.out to 26 because of Pirates of the Caribbean use for loop to align each of the id, price and movie
 *linear search- use nested loop with for and if and id there is that key return it or return -1
 *bianary search- use while loop and in while loop, use if statements to check if it is middle, of greater or less and if it's none return -1
 *bubble sort-use nested loop with for loop, for loop and if statement to sort the array inside if statement
 *selection sort- use nested loop of for and for loop with if statement to short from minimum to maximum
 */


public class Assignment3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int choice;
		do {//do while loop so it can be loop until the choice is 5
		
		//Arrays
		String[] movieTitle = {"Gone with the Wind", "Star Wars", "The Truman Show", "The Martian", "Blade Runner 2049", "Dunkirk", "Upstream Color", "La La Land", "The King’s Speech", "Pirates of the Caribbean"};
		int[] movieID = {110100, 121101, 133310, 145601, 156711, 164210, 169901, 175501, 180000, 199900};
		double[] moviePrice = {3.32, 43.25, 54.00, 67.32, 105.00, 113.22, 20.00, 42.25, 32.11, 123.75};
		int[] quantityAvailable = {11, 12, 13, 12, 14, 12, 19, 15, 18, 19};
		
		//User Choice
		System.out.println("1. Linear Search\r\n" + "2. Binary Search\r\n" + "3. Bubble Sort\r\n" + "4. Selection Sort\r\n" + "5. Quit");
		System.out.println("Enter number between 1-5");
		choice = a.nextInt();
		
		//if statements
		 if(choice == 1) {  
			 double aa = System.nanoTime();//takes the current nanosecond 
			
			 display(movieTitle, movieID, moviePrice);//method that aligns every thing in order
			 System.out.println("Please enter the movie ID you wish to purchase from the list above: ");
			 int key = a.nextInt();
			 int result = linearSearch(movieID, key);//saves the method answer as result
			if(result == -1) { //if method sends -1
		        System.out.print("No ID Found"); 
			}else {
				System.out.println("How many copies you wish to purchase: ");//copies they want to bye
				int purchase = a.nextInt();
				
				System.out.println("Movie ID: " + key);
		        System.out.println("Movie Title: " + movieTitle[result]); 
		        System.out.println("Number of movies bought: "+ purchase);
		        System.out.println("Total Cost: $"+(moviePrice[result] * purchase));
		        
		        double bb = System.nanoTime();//takes the current nanosecond 
		        double cc = bb-aa;//gets how long it took to finish choice 1
		        System.out.println("Execution of this function took: "+ cc + " nanoseconds. \n");
		        
			}
			
		 }else if(choice == 2){
			 double aa = System.nanoTime();//takes the current nanosecond
			 
			 display(movieTitle, movieID, moviePrice);//method that aligns every thing in order
			 System.out.println("Please enter the movie ID you wish to purchase from the list above: ");
			 int key = a.nextInt();
			 int result = binarySearch(movieID, key);//saves the method answer as result
			
			if(result == -1) {  //if method sends -1
		        System.out.print("No ID Found"); 
			}else {
				System.out.println("How many copies you wish to purchase: ");//copies they want to bye
				int purchase = a.nextInt();
				
				System.out.println("Movie ID: " + key);
		        System.out.println("Movie Title: " + movieTitle[result]); 
		        System.out.println("Number of movies bought: "+ purchase);
		        System.out.println("Total Cost: $"+(moviePrice[result] * purchase));
			}
			
			double bb = System.nanoTime();//takes the current nanosecond
	        double cc = bb-aa;//gets how long it took to finish choice 2
	        System.out.println("Execution of this function took: "+ cc + " nanoseconds. \n");
			 
		 }else if(choice == 3){
			 double aa = System.nanoTime();//takes the current nanosecond
			 
			int[] unsortedArray = new int[10];
			//Generates 10 Random Numbers in the range 1-500
			for(int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = (int)(Math.random()*500 + 1);
		}
			System.out.println("The Unsorted Array is: " + Arrays.toString(unsortedArray));//Finding out unsorted array
			System.out.println("The Sorted Array is: "+ Arrays.toString(bubbleSort(unsortedArray)));//using bubble method to sort out the array
			
			

			double bb = System.nanoTime();//takes the current nanosecond
	        double cc = bb-aa;//gets how long it took to finish choice 3
	        System.out.println("Execution of this function took: "+ cc + " nanoseconds. \n");
			 
			
		 }else if(choice == 4){
			 double aa = System.nanoTime();//takes the current nanosecond
			 
			int[] unsortedArray = new int[10];
			//Generates 10 Random Numbers in the range 1-500
			for(int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = (int)(Math.random()*500 + 1);
			}
			System.out.println("The Unsorted Array is: " + Arrays.toString(unsortedArray));//Finding out unsorted array
			System.out.println("The Sorted Array is: "+ Arrays.toString(selectionSort(unsortedArray)));//using selection method to sort out the array
			
			double bb = System.nanoTime();//takes the current nanosecond
	        double cc = bb-aa;//gets how long it took to finish choice 4
	        System.out.println("Execution of this function took: "+ cc + " nanoseconds. \n");
		 }else if(choice == 5){  
			 
		 }
		 
	}while(choice != 5);
	}
	public static void display(String[] movieTitle, int[] movieID, double[] moviePrice) {
		System.out.printf("%-26s %26s %26s %n", "Movie Title", "Movie ID", "Movie Price");//formatted to 26 because Pirates of the Caribbean has 24 words 
	    System.out.println("");
	    for (int i = 0; i < movieTitle.length; i++) {
	        System.out.printf("%-25s %25s %25s %n", movieTitle[i], movieID[i], moviePrice[i]);//formatted to 25 because Pirates of the Caribbean has 24 words 
	    }
	    
	}public static int linearSearch(int[] movieID, int key) {//linear search-- use for and if method to get see if key is there
		int ar = movieID.length; 
	    for(int i = 0; i < ar; i++){ 
	        if(movieID[i] == key) 
	            return i; 
	    } 
	    	return -1; 
		
	}public static int binarySearch(int[] movieID, int key) {//bianary search- use while loop, use if statements inside to check if it is middle,left half or righr half
		int a = 0; 
		int ar = movieID.length - 1; 
        while (a <= ar) { 
            int m = a + (ar - a) / 2; 
            
            if (movieID[m] == key) // Check if x is present at mid 
                return m; 
            if (movieID[m] < key)// If x greater, ignore left half  
                a = m + 1; 
            else// If x is smaller, ignore right half 
                ar = m - 1; 
        } 
        return -1; 
		
	}public static int[] bubbleSort(int[] unsortedArray){//bubble sort-for loop, for loop and if statement to sort the array
		int unsort = unsortedArray.length;
	    for (int i = 0; i < unsort-1; i++) 
	        for (int j = 0; j < unsort-i-1; j++) 
	            if (unsortedArray[j] > unsortedArray[j+1]) 
	            {
	                int temp = unsortedArray[j]; 
	                unsortedArray[j] = unsortedArray[j+1]; 
	                unsortedArray[j+1] = temp; 
	            } 
	    return unsortedArray;		
	}public static int[] selectionSort(int[] unsortedArray){//selection sort- use nested loop of for and for loop with if statement to sort the array 
		int unsort = unsortedArray.length; 
		for (int i = 0; i < unsort-1; i++) { 
			int minimum = i; 
            for (int j = i+1; j < unsort; j++) 
                if (unsortedArray[j] < unsortedArray[minimum]) 
                    minimum = j; 
            int temp = unsortedArray[minimum]; 
            unsortedArray[minimum] = unsortedArray[i]; 
            unsortedArray[i] = temp; 
        }
		return unsortedArray;
	}
}

import java.util.Scanner;
public class Act3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[][] = new int[5][6];
		for(int i = 0; i < array.length; i++) {
			System.out.println("");
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 1000 + 1);
				System.out.print(array[i][j] + " ");
			}
		}
		getHighest(array);
		getLowest(array);
		getAverage(array);
		System.out.println("Enter a value");
	    int num = input.nextInt();
		getAbove(array, num);
	}
	public static int getHighest(int[][] array){
	    int highest = 0;
	    for(int i = 0; i < array.length; i++){
	    	for(int j = 0; j < array[i].length; j++) {
	    		if(highest < array[i][j])
	    			highest = array[i][j];
	      }
	    }
	    System.out.println("\nThe highest is " + highest);
	    return highest;
	  }
	  public static int getLowest(int[][] array){
	    int lowest = 1000;
	    for(int i = 0; i < array.length; i++){
	    	for(int j = 0; j < array[i].length; j++) {
	    		if(lowest > array[i][j])
	    			lowest = array[i][j];
	      }
	    }
	    System.out.println("The lowest is " + lowest);
	    return lowest;
	  }
	  public static int getAverage(int[][] array){
	    int mean = 0;
	    for(int i = 0; i < array.length; i++){
	    	for(int j = 0; j < array[i].length; j++) {
	    		mean += array[i][j];
	      }
	    }
	    mean = mean/30;
	    System.out.println("The average is " + mean);
	    return mean;
	  }
	  public static int getAbove(int[][] array, int num){
		    int above = 0;
		    for(int i = 0; i < array.length; i++){
		    	for(int j = 0; j < array[i].length; j++) {
		    		if(array[i][j] > num) above++;
		      }
		    }
		    System.out.println("The number of elements above " + num + " is " + above);
		    return num;
		  }
}

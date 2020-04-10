import java.util.*;

public class aaaaaa {
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		String sentence;

		

		do {

			System.out.print("Enter a string, type exit to stop: ");

			sentence = a.nextLine(); 

			char arr[];

			arr = sentence.toCharArray();

			System.out.println("Characters of the array are: ");

	    for (int i = 0; i < arr.length; i++) {

	      System.out.println(arr[i] + " ");

	    }

	    System.out.println(Arrays.toString(arr));

		}while(!sentence.equalsIgnoreCase("exit"));

		System.out.println("Bye!");
	}
}
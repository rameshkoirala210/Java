import java.util.Scanner;
public class Act1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[][] = new int[4][5];
		for(int i = 0; i < array.length; i++) {
			System.out.println("");
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 10 + 1);
				System.out.print(array[i][j] + " ");
			}
		}
		
	}

}

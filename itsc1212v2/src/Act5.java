import java.lang.reflect.Array;
import java.util.Scanner;
public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][][] matrix = new int[10][10][3];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				for(int k = 0; k < matrix[i][j].length; k++) {
					matrix[i][j][k] = (int)(Math.random() * 256);
				}
				
			}
		}
		for(int i = 0; i < matrix.length; i ++) {
			if(i % 2 == 0) {		
				for(int j = 0; j < matrix[i].length; j++) {
					for(int k = 0; k < matrix[i][j].length; k++) {
						matrix[i][j][k] = 255;
					}
				}
			}
		}
		System.out.println("Enter a value for zoom");
		int zoom = input.nextInt();
		ImageBuilder imageBuilder = new ImageBuilder(matrix, zoom);
		imageBuilder.show();

	}

}

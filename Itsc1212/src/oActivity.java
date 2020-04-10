import java.util.Scanner;
import java.util.Arrays;

public class oActivity{
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     String names;
     
     System.out.print("Enter a value for how many names you will like to enter? ");
     int value = scan.nextInt();
     
     String num[] = new String[(value)];
     
     System.out.println("Enter array elements:"); 
     names = scan.nextLine();
     for (int i = 0; i < value; i++) {
         names = scan.nextLine();
    	 num[i] = names;
     }
     Arrays.sort(num);
     System.out.println(Arrays.toString(num));
    
    
     
  }
}
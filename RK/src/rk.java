import java.util.Scanner;
import java.io.*;

public class rk {
public static void main(String[] args) throws IOException{

	File file = new File("line2.txt");
   Scanner inputFile = new Scanner(file);
      
	 while(inputFile.hasNext()){
            System.out.println(inputFile.legnth());
   }
}
}

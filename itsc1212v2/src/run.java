import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class run {
    public static void main(String[] args) throws IOException {
        
        File file = new File("accounts.txt");
        Scanner fileInput = new Scanner(file); 
       

        while(fileInput.hasNext()){
           
            String ab = fileInput.next();  
            System.out.println(ab);
        }

        
        fileInput.close();
    }
}
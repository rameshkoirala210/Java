import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class writer {
  public static void main(String[] args) throws IOException {
	  Scanner a = new Scanner(System.in);
	  File file = new File("accounts.txt");
	  PrintWriter fo = new PrintWriter(file);
	  
	  boolean done = false;
     
	  while(!done) {
          System.out.println("Enter a username(no to exit)");
          String name = a.next();
          
          System.out.println("Enter a password(-1 to exit)");
          int pass = a.nextInt();
          
          if(!(name.equalsIgnoreCase("no")) || pass != -1) {
          fo.print("UserName: " + name);
          fo.println("\n Password: " + pass);
          }else if(name.equalsIgnoreCase("no") || pass == -1) {
              done = true;
          }
         
		  
	  }
	 
		  
	  fo.close();	
  }
}
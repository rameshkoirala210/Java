import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class lb {
public static void main(String[] args){
      
	File file = new File("line2.txt");
	try {
	if(!file.exists()){
			file.createNewFile();
	}
	PrintWriter pw = new PrintWriter(file);
	pw.println("Line 1");
	pw.println("Line 2");
	pw.println("Line 3");
	pw.println("Line 4");
	pw.println("Line 5");
	pw.println("Line 6");
	pw.println("Line 7");
	pw.close();
	System.out.println("done");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
}
}
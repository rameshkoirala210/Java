import java.util.Scanner;
//By Ramesh Koirala
//Verson 1?
//Date: 3/18/2020
//Post04  
public class postLab4{
  public static void main(String[] args){
     //Distance
	  Scanner a = new Scanner(System.in);
     System.out.println("ID001");
   
     	System.out.println("enter x1 point");
     	  double x1 = a.nextDouble();
	    System.out.println("enter y1 point");
	      double y1 = a.nextDouble();
	    System.out.println("enter x2 point");
	      double x2 = a.nextDouble();
	    System.out.println("enter y2 point");
	      double y2 = a.nextDouble();
	  	  
	    double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is "+dis);
 
 	 	
 	//program 2-Strings Analysis
 	 	System.out.println("ID002");
 	 
 	 
 	 System.out.println("enter String length");
 	 	String length = a.next();
	 System.out.println("enter a letter");
     	String c = a.next(); 
	 System.out.println("Enter a slot number");
	   	int what = a.nextInt();
 	 	
	 int lengthA = length.length();
     System.out.println("The String length is: " + lengthA);
     
     System.out.println("Index of character: " + length.indexOf(c));
     
     System.out.println("The the letter at slot " + what + " is " + length.charAt(what));
	}
 
}

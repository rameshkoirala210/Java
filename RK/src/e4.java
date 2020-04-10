public class e4 {
	public static void main(String args[]) {
		System.out.println("Hello fvns");
	}
	
}
import java.util.Scanner; 
import java.io.*;

public class Lab3 {
	public static void main(String[] args)  throws IOException{
		Scanner input = new Scanner(System.in);
		String name;
		int age = 0;
		int first= 0;
		int second = 0;
		int third = 0;
      
      name = getName();
      age = getage();
      first = getfirst();
      second = getsecond();
      third = getthird();
      
		
		// System.out.println("What is the bowler's Name: " );
// 		name = input.nextString();
// 		System.out.println("What is the bowler's Age: " );
// 		age = input.nextint();
// 		System.out.println("What is the bowler's First score: " );
// 		first = input.nextint();
// 		System.out.println("What is the bowler's First score: " );
// 		second = input.nextint();
// 		System.out.println("What is the bowler's First score: " );
// 		third = input.nextint();
		
	}
   public static String getName(){
		System.out.println("What is the bowler's Name: " );
		String name = input.nextLine();	
      return name;
   }
   public static int getage(){
		System.out.println("What is the bowler's Age: " );
		int age = input.nextLine();
      return age;
	}
  public static int getfirst(){
		System.out.println("What is the bowler's First score: " );
		int first = input.nextLine();
      return first;
	}
   public static int getsecond(){
		System.out.println("What is the bowler's First score: " );
		int second = input.nextLine();
      return second;
	}
   public static int getthird(){
		System.out.println("What is the bowler's First score: " );
		int third = input.nextLine();
      return third;
	}
}
   
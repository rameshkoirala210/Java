import java.util.Scanner;//importing scanner

	public class BasicCalculator {
	    public static void main(String[] args){//main method
	        Scanner input = new Scanner(System.in);//inputing scanner in system.in
	        // Variable Declaration
       int  y, x, z, z2;//declaring int
       double dy, dx, dz;//declaring double
       float f = 7.12f;//Float
       System.out.print("Enter a Double Number(dy): ");
      //Take user input and store it in dy
      dy = input.nextDouble();
      //Prompt the user for another number
      System.out.print("Enter another Double Number(): ");
	dx = input.nextDouble();
      y =  (int) dy; // What do you think will happen now? //gives you syntax error
      x = (int) dx; // Turning it into int value
      System.out.println(y + " , " + dy);
      // What is the output in Line #18?
      System.out.println(x + " , " + dx);
     //What is the output in Line #20?
      dz = dx + dy;
       z = (int) (dx + dy);//turning it into int value
       f = z;
       z2 = x + y;
       System.out.println(z + " , " + z2 + " , " + f);
      //What is the output in Line #26?
      //Are they the same? If different, explain why are they different? (Write your answer in the Table below for Line #28.)
	System.out.println(x / y + " , " + dx / dy);
     //What is the output in Line #29?
      System.out.println(x % y + " , " + (int)dx % (int)dy);
      //What is the output in Line #31?
	}
}
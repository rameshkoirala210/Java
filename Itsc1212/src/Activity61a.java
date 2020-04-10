import java.util.Scanner;

public class Activity61a{
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int choice;
     do {
     displayMenu();
     System.out.print("Enter your choice: ");
     choice = scan.nextInt();
     }while (choice > 6 || choice < 0);
     if(choice == 1){
       System.out.print("Enter two numbers to add: ");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       System.out.println("Sum = " + add(num1, num2));
     }else if (choice == 2) {
    	 System.out.print("Enter two numbers to Subtract: ");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         System.out.println("Subtracting Int = " + subtract(num1, num2));
     }else if (choice == 3) {
    	 System.out.print("Enter two numbers to Subtract: ");
         double num1 = scan.nextDouble();
         double num2 = scan.nextDouble();
         System.out.println("Subtracting Double = " + subtract(num1, num2));
     }else if (choice == 4) {
    	 System.out.print("Enter two numbers to Multiply: ");
         double num1 = scan.nextDouble();
         double num2 = scan.nextDouble();
         System.out.println("Multiplying  = " + multiply(num1, num2));
     }else if (choice == 5) {
    	 System.out.print("Enter two numbers to Divide: ");
         double num1 = scan.nextDouble();
         double num2 = scan.nextDouble();
         System.out.println("Dividing  = " + divide(num1, num2));
     }else if (choice == 6) {
    	 System.out.println("Bye");
     }
     
     System.out.println("BYE");
  }

  public static void displayMenu(){
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Subtract with doubles");
    System.out.println("4. Multiple");
    System.out.println("5. Divide");
    System.out.println("6. Quit");
 }

 public static int add(int a, int b){
    int sum = a + b;
    return sum;
 }

 public static int subtract(int a, int b){
    int sub = a - b;
    return sub;
 }

 public static double subtract(double a, double b){
	 double sub = a - b;
	 return sub;

 }
 
 public static double multiply(double a, double b){
	 double multiply = a * b;
	 return multiply;
 }
 
 public static double divide(double a, double b){
	 double divide = a / b;
	 return divide;
 }
}
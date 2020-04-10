import java.util.Scanner;

public class CoffeeShop {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int mainMenuChoice = -1;
      System.out.println("Welcome to the coffee shop!");

      double total = 0.0;

      do{
    	  do {
         displayMainMenu();
         mainMenuChoice = scan.nextInt();
    	  }while(mainMenuChoice > 4);
         char selection;

         switch(mainMenuChoice){
            case 1:
               coffeeSubmenu();
               selection = scan.next().charAt(0);
               total += calculateCoffeePrice(selection);
               break;
            case 2:
            	pastrySubmenu();
            	selection = scan.next().charAt(0);
            	total += calculatePastryPrice(selection);
            	break;
            case 3:
            	sodaSubmenu();
            	selection = scan.next().charAt(0);
            	total += calculateSodaPrice(selection);
            	break;
         }

      }while(mainMenuChoice != 4);

      System.out.println("Total: $" + total);
      System.out.println("goodbye ");
   }
   public static double calculateSodaPrice(char selection) {
	      double price = 0.0;
	      if(selection == 'A' || selection == 'a'){
	         price = 2.99;
	      } else if (selection == 'B' || selection == 'b'){
	         price = 2.49;
	      }
	      return price;
	   }
   public static double calculatePastryPrice(char selection) {
	      double price = 0.0;
	      if(selection == 'A' || selection == 'a'){
	         price = 4.99;
	      } else if (selection == 'B' || selection == 'b'){
	         price = 2.49;
	      }
	      return price;
	   }
   public static double calculateCoffeePrice(char selection) {
      double price = 0.0;
      if(selection == 'A' || selection == 'a'){
         price = 2.99;
      } else if (selection == 'B' || selection == 'b'){
         price = 3.99;
      }
      return price;
   }

   public static void displayMainMenu() {
	  System.out.println("Please select the item type(put 4 to exit).");
      System.out.println("1. Coffee");
      System.out.println("2. Pastry");
      System.out.println("3. Soda");
      
   }

   public static void coffeeSubmenu() {
      System.out.println("Please select the coffee.");
      System.out.println("A. Drip Coffee");
      System.out.println("B. Latte");
   }

   public static void pastrySubmenu() {
      System.out.println("Please select the pastry.");
      System.out.println("A. Croissant");
      System.out.println("B. Muffin");
   }

   public static void sodaSubmenu() {
      System.out.println("Please select a soda.");
      System.out.println("A. Coca-Cola");
      System.out.println("B. Pepsi");
   }
}
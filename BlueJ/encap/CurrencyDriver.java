import java.util.Scanner;
/**
 * This class contains main() where
 * excution starts. main( ) creates and instance
 * of the Currency class. The code then promts the
 * user to enter different amounts of money specifying
 * any of the currencies. The code then calls a set( )
 * method and prints that amount in all five of the currency 
 * types.
 * 
 * The user continues to enter new amounts of money
 * until the user enters anything but a 'y'/
 *
 */
public class CurrencyDriver {
    public static void main(String[] args) {
        Currency cur; 
        Scanner input = new Scanner(System.in);
        char goAgain;
        double amount;
        String typeOfMoney;
        cur = new Currency();
        System.out.println("Starting out broke\n" + cur.toString( ));
        
        goAgain = 'y'; 
        
        while(goAgain == 'y')
        { 
           
            System.out.print("Enter a new amount of money: ");
            amount = input.nextDouble( );
           
            System.out.print("Enter what type of currency that is: "
                             + "\ndollar\teuro\tbhat\tor dong: ");
            typeOfMoney = input.next( );
            
            
            cur.setMoney(amount, typeOfMoney);
            
            
            System.out.println(cur.toString( ));
            
            
            System.out.print("Enter 'y' to change the amount or anything else to quit: ");
            goAgain = input.next( ).charAt(0);
        }
        
    
      System.out.println("good bye.");
    }
}


import java.util.*;
public class Driver{
    public static void main(String [ ] args){
    
        Scanner input = new Scanner(System.in); 
        
        int inNumber;
        double inPriceOfOne;
        double inDiscount;
        double finalCost;
        ItemSale mySales;
        
        System.out.println("You will be asked to enter the price of an" +
        " item, \nthe number of items you are purchasing" +
        " and the discount percent. \n\n");
        
        System.out.println("Please enter the price of the item: ");
        inPriceOfOne = input.nextDouble( );

        System.out.println("How many items are you buying: ");
        inNumber = input.nextInt( );

        System.out.println("What discount percent are you using: ");
        inDiscount = input.nextDouble( );
    
        mySales = new ItemSale( );
        mySales.setCost(inPriceOfOne);
        mySales.setNumberOfItems(inNumber);
        mySales.setDiscount(inDiscount);
        
        finalCost = mySales.getFinalCost( );

        System.out.println("Your final cost is: " + finalCost);
    }   
}
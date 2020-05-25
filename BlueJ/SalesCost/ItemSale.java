
/**
* This class holds data for a sales slip after a discount is applied.
*
* @author (Ramesh Koirala)
* @version (5/25/20)
*/
public class ItemSale
{
    private double costOfOneItem;
    private int numberOfItems;
    private double discountRate;
    
    public ItemSale( )
    {
        costOfOneItem = 0;
        numberOfItems = 0;
        discountRate = .05;
    }

    public void setCost(double inCost)
    {
    if(inCost < 0)
    costOfOneItem = 0;
    else
    costOfOneItem = inCost;
    }   
 
    public void setNumberOfItems(int inNumber)
    {
        numberOfItems = inNumber < 0? 0:inNumber;
    }
    
    public void setDiscount(double inDiscountRate)
    {
        discountRate = inDiscountRate < 0? 0: inDiscountRate;
    }
    
    public double getFinalCost( )
    {
        double finalCost;
        finalCost = numberOfItems * (costOfOneItem * (1 - discountRate));

        return finalCost;
 }
}

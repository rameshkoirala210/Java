
/**
 * Lab 1
 *
 * @author (Ramesh Koirala)
 */
public class CostCalculator
{
    private double miles;
    private double gallons;
    private double costPerGallon;
    private double mileage;
    private double costForTrip;
    
    public CostCalculator(double inMiles, double inGallons, double inCostPer)
    {
      miles = inMiles;
      gallons = inGallons;
      costPerGallon = inCostPer;
      
      mileage = miles/gallons;
      costForTrip = gallons + costPerGallon;
    }   
}

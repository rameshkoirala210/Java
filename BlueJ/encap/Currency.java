
/**
 * This class holds a value of currency in various
 * denominations
 *

 */
public class Currency
{
    
    private final double EURO_PER_DOLLAR;
    private final double DONG_PER_DOLLAR;
    private final double BHAT_PER_DOLLAR;
    private final double POUND_PER_DOLLAR;
    
    
    private double dollar;
    private double euro;
    private double bhat;
    private double pound;
    private double dong;
    
    
    public Currency() {
        dollar = euro = bhat = pound = dong = 0;
        EURO_PER_DOLLAR = .89;
        DONG_PER_DOLLAR = 23246.15;
        BHAT_PER_DOLLAR = 30.80;
        POUND_PER_DOLLAR = .80;
    }
   
    
    public Currency(double epd, double dpd, 
    double bpd, double ppd, double money, String moneyType) {
        EURO_PER_DOLLAR = epd;
        DONG_PER_DOLLAR = dpd;
        BHAT_PER_DOLLAR = bpd;
        POUND_PER_DOLLAR = ppd;
        
        
        setMoney(money, moneyType);
     
    }
    
    public void setMoney(double money, String moneyType) {
        
        
        switch (moneyType) {
            case "dollar":
                dollar = money;
                break;
            case "euro":
                dollar = money / EURO_PER_DOLLAR;
                break;
            case "dong":
                dollar = money / DONG_PER_DOLLAR;
                break;
            case "bhat":
                dollar = money / BHAT_PER_DOLLAR;
                break;
            case "pound":
                dollar = money / POUND_PER_DOLLAR;
                break;    
        } 
        
       
        euro = dollar * EURO_PER_DOLLAR;
        dong = dollar * DONG_PER_DOLLAR;
        bhat = dollar * BHAT_PER_DOLLAR;
        pound = dollar * POUND_PER_DOLLAR;
    } 
    
    
    public String toString() {
        return "Dollars: " + dollar
                + "\nEuros: " + euro
                + "\nDong: " + dong
                + "\nBhat: " + bhat
                + "\nPound: " + pound;
    }
}

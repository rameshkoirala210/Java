
public class Temp {
	
	private static double celsius;
	
	private static double fahrenheit; 
		
	private static double kelvin; 
		
	
	
	public Temp(double c, double f,double k) {
		celsius = c;
		fahrenheit = f;
		kelvin = k;
	}
	public static void setCelsius(double newCelsius) {
		celsius = newCelsius;
	}  
	public static double getCelsius() {
		return celsius;
	}
	public static void setFahrenheit(double newFahrenheit) {
		fahrenheit = newFahrenheit;
	}  
	public static double getFahrenheit() {
		return fahrenheit;
	}
	public static void setKelvin(double newKelvin) {
		kelvin = newKelvin;
	}  
	public static double getKelvin() {
		return kelvin;
	}
	public String toString() {
		return "Today's temperature is " + celsius + " Celsius" + " or " + fahrenheit
				+ " Fahrenheit " + " or " + kelvin + " Kelvin.";
	}
}

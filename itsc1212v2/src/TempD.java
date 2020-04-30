import java.util.Scanner;

public class TempD {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter Celsius Temperature: ");
		double celsius = a.nextInt();
		Temp.setCelsius(celsius);
		
		double fahrenheit = (double) ((celsius*1.8) + 32);
		Temp.setFahrenheit(fahrenheit);
		
		double kelvin = (double) (celsius + 273.15);
		Temp.setKelvin(kelvin);
		
		Temp first = new Temp(Temp.getCelsius(), Temp.getFahrenheit(), Temp.getKelvin());
		
		System.out.println(first);
	}
}

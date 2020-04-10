import java.util.Scanner;

	public class a8 {
		public static void main(String[] args) {
			
			//---- Declare all the variables here 
			int choice ,num;
			double total;
			Scanner scan;
			final double tax = 1;
			Scanner a = new Scanner(System.in);
			
			//-----------------------------------
			
			System.out.println("Please select 1 of the following options to buy: ");
			System.out.println("1. Shirts (7$ / item)");
			System.out.println("2. Pants  (10$ / item)");
			System.out.println("3. Top    (5$ / item)");
			
			System.out.println("What is your choice");
			 choice  = a.nextInt();
			
			 if(choice == 1){
				 System.out.println("how many shirts would you like to buy");
				  int s  = a.nextInt();
				
				  int total3 = s*7;
				  
				  total = total3 * tax; 
					System.out.println("Hello Customer, Thank you for your purchase at our store.");
					System.out.println("Your total bill was : " + total);
				}else if(choice == 2){
					 System.out.println("how many pants would you like to buy");
					  int p  = a.nextInt();
					
					 int total1 = p*10;
					  total = total1 * tax; 
						System.out.println("Hello Customer, Thank you for your purchase at our store.");
						System.out.println("Your total bill was : " + total);
				
				}else if(choice == 3){
					System.out.println("how many tops would you like to buy");
					  int t  = a.nextInt();
					
					  int total2 = t*10;
					  total = total2 * tax; 
						System.out.println("Hello Customer, Thank you for your purchase at our store.");
						System.out.println("Your total bill was : " + total);
						}
			}
		}
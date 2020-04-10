import java.util.Scanner;
//Basically this is telling us to ask user to enter beginning 
//inventory values and calculate values that are sold 
//to see how much each of the inventory at the end.
//
public class Flowchart {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("Enter Inventory for store 1: ");
		 double store1  = a.nextDouble();
		 System.out.print("Enter Inventory for store 2: ");
		 double store2  = a.nextDouble();
		 System.out.print("Enter Inventory for store 3: ");
		 double store3  = a.nextDouble();
		 
		 System.out.print("How many widgets were sold at store 1? ");
		 double sold1  = a.nextDouble();
		 
		 store1 = store1-sold1;
		 
		 System.out.print("How many widgets were sold at store 2? ");
		 double sold2  = a.nextDouble();
		 
		 store2 = store2 - sold2;
		 
		 System.out.print("How many widgets were sold at store 3? ");
		 double sold3  = a.nextDouble();
		 
		 store3 = store3 - sold3;
		 
		 System.out.println("Store 1 now has " + store1 + " widgets left");
		 System.out.println("Store 2 now has " + store2 + " widgets left");
		 System.out.println("Store 3 now has " + store3 + " widgets left");
		 
		 System.out.print("How much each widgets cost? ");
		 double Wcost  = a.nextDouble();
		 
		 double totalsales = store1+store2+store3;
		 System.out.println("Total sales is " + totalsales);
		 
		 if(totalsales > 2000) {
			 System.out.print("Good Job you got more then 2000 dollars"); 
		 }
		 else {
			 System.out.print("Let's try to get 2000 dollars next time ");
		 }
	}
}

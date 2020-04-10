import java.util.Scanner;
/*Program Name: Mobile Phone Service
 * Programmer: Ramesh Koirala
 * Date: 2/11/2020
 * Lab Section: 02
 * Purpose:
 * Algorithm:
 */
public class MockTest1A {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("What is your choice of package? A, B, C: ");
		 String choice  = a.next(); 
		System.out.println("For the current month, how many minutes you spent on your phone? ");
		 double minutes  = a.nextDouble();
		 System.out.println("What is your data usage in MB? ");
		 double data  = a.nextDouble();
		 
		 double cA = 39.99;
		 double cB = 59.99;
		 double cC = 69.99;
		 //A
		 double dATaAA = (data - 1)/0.2;
		 double dATaA = (dATaAA*10);
		 double AA = cA + dATaA;
		 double ecAA = (minutes - 450)* .45; 
		 double ecA = ecAA +39.99;
		 double AAB = ecA + dATaA;
		 //B
		 double dataBB = (data - 2)/0.25;
		 double dataB = (dataBB * 10);
		 double BB = cB + dataB;
		 double ecBB = (minutes - 900)* .40; 
		 double ecB = ecBB +59.99;
		 double BBB = ecB + dataB;
		 //C
		 double dataC = (data - 20)* 10; 
		 double CC = cC; 
		 double CCC = 69.99 + dataC;
				 
		 if (choice.equals("A")) {  
			 if (minutes < 450) {
				 if (data < 1) {
					 System.out.println("Your bill for this month is: " + cA );
					 System.out.print("Package B would have been " + cB);
					 System.out.print("Package C would have been " + cC);
					 System.out.print("You are on the most optimal Package");

				 }else {
					 
					 if (cA < cB) {
						 System.out.println("Your bill for this month is: " + cA );
						 System.out.print("Package B would have been " + cB);
						 System.out.print("Package C would have been " + cC);
						 System.out.print("You are on the most optimal Package");
					 }else if (cA > cB) {
						 System.out.println("Your bill for this month is: " + cA );
						 System.out.print("Package B would have been " + cB);
						 System.out.print("Package C would have been " + cC);
						 System.out.print("You would have saved a total of " + (BB-AA) + " by switching to package B and " + (CC-AA) + " by switching to Package C");
					 }
				 }
			}else if(minutes > 450) {
				 if (data < 1) {
					 System.out.println("Your bill for this month is: " + ecA );
				 }else {
					 System.out.println("Your bill for this month is: " + AAB);
				 } 
			 }
		 }else if (choice.equals("B")) {
			 if (minutes < 900) {
				 if (data < 2) {
					 System.out.println("Your bill for this month is: " + cB );
					 System.out.print("Package A would have been " + AAB);
					 System.out.print("Package C would have been " + CCC);
					 System.out.print("You are on the most optimal Package");
				 }else {
					 System.out.println("Your bill for this month is: " + BB );
				 }
			}else if(minutes > 450) {
				 if (data < 2) {
					 System.out.println("Your bill for this month is: " + ecB );
				 }else {
					 System.out.println("Your bill for this month is: " + BBB);
				 } 
			 } 
		 }else if(choice.equals("C")) {
				 if (data < 20) {
					 System.out.println("Your bill for this month is: " + CC );
					 System.out.print("Package A would have been " + AAB);
					 System.out.print("Package C would have been " + CCC);
					 System.out.print("You are on the most optimal Package");
				 }else {
					 System.out.println("Your bill for this month is: " + CCC );
				 }
		 }
		 
	}
}
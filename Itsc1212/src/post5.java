import java.util.Scanner;

//By Ramesh Koirala
//Verson 1?
//Date: 3/15/2020
//Post05 - Case Studies 
public class post5 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		boolean isPrime=true;
		
		System.out.println("ID001");
		int aa, num;
		
		do {
		System.out.println("Enter any number(enter -1 to exit):");
		 num=a.nextInt();
		
		for(int i=2;i<=num/2;i++){
	           aa=num%i;
		   if(aa==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
			if(isPrime) {
			  System.out.println(num + " is a Prime Number");
			}else {
			  System.out.println(num + " is not a Prime Number");
			}
		}while(num > 0);
		//System.out.println("Enter a max range:");
		//int max =a.nextInt();
		int num1 = 0;
		do{
			num1++;
			for(int i=2;i<=num1/2;i++){
		           aa=num1 % i;
		           
			   if(aa==0)
			   {
			      isPrime=false;
			      break;
			   }
			}
				if(isPrime) {
				  System.out.println(num1 + " is a Prime Number");
				}else {
				  System.out.println(num1 + " is not a Prime Number");
				}
		}while(num1 < 5);
	}
}

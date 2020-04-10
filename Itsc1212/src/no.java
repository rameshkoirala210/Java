import java.util.Scanner;
public class no {
public static void main(String[] args) {

//Part A
Scanner sc=new Scanner (System.in);

do{
char choice;
System.out.println("A. Buy cheese");
System.out.println("B. Buy cake");
System.out.println("C. Buy cappuccino");
System.out.println("D. Buy corn flakes");
System.out.println("Enter your choice:");
choice =sc.next().toUpperCase().charAt(0);

}while(choice!='A'||choice!='B'||choice!='C'||choice!='D');

//Part B
String item;
double unitPrice;
switch(choice){
case'A':
item="cheese";
unitPrice=2.3;
case 'B':
item="cake";
unitPrice=3.34;
case 'C':
item="cappuccino";
unitPrice=3.32;
case 'D':
item= "corn flakes";
unitPrice=4.3;
default:
item="";
unitPrice=0;
System.out.println("ERROR: Invalid choice");
}

int amount;
System.out.println("How many "+item+"(s) did you buy?");
amount=sc.nextInt();
double total=0;
// multiply unitPrice by amount using a for loop
int i=0;
for (i=0;i<amount;i++);{
total+=unitPrice;
}

total*=1.03; //add sales tax
System.out.println("The total is "+total);


}
}
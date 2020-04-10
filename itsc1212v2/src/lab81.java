import java.util.Scanner;

class lab81 {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    
    

    int array[]=new int[10];
    
    System.out.println("Enter 10 numbers");
    	
    for(int i=0;i<10;++i) {
         array[i]=a.nextInt();
    }
    int pos = 0; 
    do {	
    System.out.println("enter an index position");
    pos = a.nextInt();
    if(pos < 10) {
    System.out.println(array[pos]);
    }else if(pos >= 10 || pos <= -2) {
    	System.out.println("enter between 0-9");
    }
    }while(pos != -1);
  
   } 
}
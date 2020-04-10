import java.util.*;

class lab83 {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    
    int array[]=new int[50];
      
    int i;
    
    for(i=0;i<50;i++) {
        array[i]= (int)(1000 * Math.random());
        //System.out.println(array[i]);
   } 
    int ar = array.length;
    double avg =  getAverage(array)/ar;
    
    
    System.out.println("Maximum Value is: " + gethighest(array));
    
    System.out.println("Minimum Value is: " + getlowest(array));
    
    System.out.println("Average is:  " + avg);
    
    System.out.println("Numbers above average are :");
    getAboveAverage(array,avg,ar);
    
    System.out.println("\nNumbers below average are :");
    getBelowAverage(array,avg,ar);
    
  }
  public static int gethighest(int[] array){ 
	    int highest = array[0]; 
	    for(int i=1;i < array.length;i++){ 
	      if(array[i] > highest){ 
	         highest = array[i]; 
	      } 
	    } 
	    return highest; 
	  }
  public static int getlowest(int[] array){ 
	    int lowest = array[0]; 
	    for(int i=1;i<array.length;i++){ 
	      if(array[i] < lowest){ 
	    	  lowest = array[i]; 
	      } 
	    } 
	    return lowest; 
  }public static double getAverage(int[] array){
	  double t = 0;
	    for(int i=0; i<array.length; i++){
	    	t = t + array[i];
	    }
		return t;
  }public static void getAboveAverage(int[] array,double avg, int ar){
	 int n = 0;
	  for (int i = 0; i < ar; i++)  
          if (array[i] > avg) {
        	  System.out.print(array[i] + " ");
          }	  
  }public static void getBelowAverage(int[] array,double avg, int ar){
		 int n = 0;
		  for (int i = 0; i < ar; i++)  
	          if (array[i] < avg) {
	        	  System.out.print(array[i] + " ");
	          }	  
	  }
  
}
 
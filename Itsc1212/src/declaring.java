// This Program will determine the area and sum of a rectangle

import java.util.Scanner;//importing scanner

public class declaring {//class
public static void main(String[] args) {//main
 Scanner a = new Scanner(System.in);//putting scanner in System.in
 int h, l, sum, area;//int variables
 
 System.out.print("What is the length : ");//asking for length
 l = a.nextInt();//saving length in l
 
 System.out.print("What is the height : ");//asking for height
 h = a.nextInt();//saving height in h
 
 area = l*h;//getting area
 System.out.println("The area is " + area);//printing area
 sum = (2*h) + (2*l);//getting sum
 System.out.println("The sum is " + sum);//printing sum
 
}
}
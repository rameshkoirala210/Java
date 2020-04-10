import java.util.Scanner;
import java.util.Arrays;

public class test {
        

        static int[] list = { 1, 2, 3 };

        public static void main(String[] args) {
             System.out.println("from Main():");
            System.out.println(Arrays.toString(list));
             list[0]=10;
             print();
             System.out.println("from Main():");
             System.out.println(Arrays.toString(list));
         }


        public static void print(){
               System.out.println("from print():");
               System.out.println(Arrays.toString(list));
               list[0]=7;
         }
     }
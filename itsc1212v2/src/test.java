public class test {
 static String global = "";

   public static void main(String[] args) {

        global = "Yum!"; // part A
        System.out.println(global);// part B
        String global = "Greasey Pie"; // part C
       System.out.println(global); // part D
        myMethod();

  }
     public static void myMethod() {
          global= "I'm not hungry";
          System.out.println(global); // part E
 }
}
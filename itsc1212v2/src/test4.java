import java.util.*;


public class test4 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> pets = new ArrayList<String>();
    ArrayList<String> types = new ArrayList<String>();

    Scanner a = new Scanner(System.in);
    int choice;
    do{
    
      System.out.println("Main Menu: ");
      System.out.println("1. Add a new customer\r\n"+ "2. Display all customers\r\n"+ "3. Search\r\n" + "4. Exit");

 
      System.out.println("Enter Choice between 1-4");
      choice = a.nextInt();
      if(choice == 1){
        getInfo(names, pets, types);
      }else if(choice == 2){
        display(names,pets,types);
      }else if(choice == 3){
        String sChoice; 
          System.out.println("What customer (name) would you like to search for?");
          String costumer = a.next();
          int result = searching(names,costumer);

          if(result == -1){
            System.out.print("Not Found");
          }else{
            System.out.println(costumer + " was found");
            System.out.println("Pet: " + pets.get(result));
            System.out.println("Pet's Type:" + types.get(result));
          }   
      }else if(choice == 4){
    	  System.out.println("bye");
      }
    }while(choice != 4);
  }
  public static void getInfo(ArrayList<String> names, ArrayList<String> pets, ArrayList<String> types){
    Scanner a = new Scanner(System.in);
      System.out.println("Enter name: ");
      String name = a.nextLine();
      names.add(name);
      System.out.println("Enter " + name +"'s Pet: ");
      String pet = a.nextLine();
      pets.add(pet);
      System.out.println("What kind of pet is " + pet + "? ");
      String cc = a.next();
      types.add(cc);
  }
  public static void display(ArrayList<String> names, ArrayList<String> pets, ArrayList<String> types){
    System.out.printf("%-10s %10s %10s %n", "Name", "Pet", "Type");
    System.out.println("--------------------------------");

    for(int i = 0; i < names.size(); i++){
      System.out.printf("%-10s %10s %10s %n",names.get(i),pets.get(i), types.get(i));
    }
  }
  public static int searching(ArrayList<String> name,String costumer){
    int aa = name.size();
    for(int i = 0; i < aa; i++){
      if(name.get(i).equals(costumer)){
        return i;
      }
    }
    return -1;
  }
}
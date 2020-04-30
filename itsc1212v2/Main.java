import java.util.*;

/**
*Program Name:Lab test 3
*@author Name-Ramesh Koirala
*@version - 1 
*Date- 4/28/20
*Lab Section-002
*Purpose:writing a program for a pet store to keep track of their *customers and their pets. 
*
*Pseudocode: Write the steps of the program in English:
*     Think about inputs, processes, and outputs.
*/
class Main {
  public static void main(String[] args) {
    //data for the arraylist
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> pets = new ArrayList<String>();
    ArrayList<String> types = new ArrayList<String>();

    Scanner a = new Scanner(System.in);
    int choice;
    do{
      //print out the main menu
      System.out.println("Main Menu: ");
      System.out.println("1. Add a new customer\r\n"+ "2. Display all customers\r\n"+ "3. Search\r\n" + "4. Exit");

      //choice to the customer
      System.out.println("Enter Choice between 1-5");
      choice = a.nextInt();
      if(choice == 1){
        getInfo(names, pets, types);
      }else if(choice == 2){
        display(names,pets,types);
      }else if(choice == 3){
        String sChoice; 
        do{
        //Search Menu
        System.out.println("Search  Menu: ");
        System.out.println("A. Search for Customer\r\n" + "B. Search for Pet\r\n" + "C. Pet Type Counter\r\n"+"D. Back to Main Menu");
        sChoice = a.next();
        if(sChoice.equals("A")){
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

        }else if(sChoice.equals("B")){
          
        }else if(sChoice.equals("C")){
          
        }else if(sChoice.equals("D")){
          
        }
        }while(!(sChoice.equals("D")));
      }else if(choice == 4){

      }
    }while(choice != 4);
  }


//Methods to get name, pet and type info
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

//method to display the data
  public static void display(ArrayList<String> names, ArrayList<String> pets, ArrayList<String> types){
    System.out.printf("%-10s %10s %10s %n", "Name", "Pet", "Type");
    System.out.println("--------------------------------");

    for(int i = 0; i < names.size(); i++){
      System.out.printf("%-10s %10s %10s %n",names.get(i),pets.get(i), types.get(i));
    }
  }
  
  //method to search for name of the customer, return index
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
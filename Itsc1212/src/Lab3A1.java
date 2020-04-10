

public class Lab3A1 {
	public static void main(String[] args) {
	
		System.out.println("Welcome today We have a spicial event and there is a 50/50 chance you will either get 20% discount, or a 25% discount");
		
			 int num = (int) ( Math.random() * 2 + 1);
			 if(num == 1) {
				System.out.println("You got 20% discount");
				System.out.println("Enjoy that 20% off");
			 }else if (num == 2){
				System.out.println("You got 25% discount");
				System.out.println("Thats 1/4 off everythimg");
			 }else{
				System.out.println("Goodbye!");
				}
	}
}



public class sk {
	public static void main(String[] args) {
		StupidKiran object = new StupidKiran ("Stupid Kiran");
		StupidKiran object2 = new StupidKiran ("Idiot Kiran");
		object.saying();
		object2.saying();
		
		object.setKiran(24);
		object.setStupid(12.3);
		object2.setKiran(24);
		object2.setStupid(25.5);
		
		System.out.print ("He is "+ object.getKiran() + " years old");
		System.out.print(" and He is " + object.getStupid()+"% dumb");
		System.out.print ("\nHe is "+ object2.getKiran() + " years old");
		System.out.print(" and He is now " + object2.getStupid()+"% dumb");
		
	}
	
}
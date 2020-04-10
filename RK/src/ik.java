
public class ik {
	public static void main(String[] args) {
		idiotkiran Yes = new idiotkiran(); // constructor gets called when you create an object
		
		Yes.setBone("KiranIdiot");
		Yes.setKiran(24); 
		Yes.setStupid(12.3);
		
		System.out.println("Hi my name is " + Yes.getBone());
		
		System.out.print ("I am "+ Yes.getKiran() + " years old");
		System.out.print(" and I am " + Yes.getStupid()+"% dumb");
	}
}

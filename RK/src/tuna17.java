
public class tuna17 {
	private String girlName;
	
	public tuna17(String name) {
		girlName=name;
	}
	
	public void setName(String name) {
		girlName = name;
}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Person was %s\n", getName());
	}
	

}

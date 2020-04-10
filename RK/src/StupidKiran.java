public class StupidKiran {
	private String yesyes;
	private int kiran;
	private double stupid;
	
	public StupidKiran(String name) {
		yesyes=name;
	}
	
	public void setName(String name) {
		yesyes = name;
}
	public String getName() {
		return yesyes;
	}
	public void saying() {
		System.out.printf("Kiran's Name should be %s\n", getName());
	}
	public void setKiran(int kiran) {
		this.kiran = kiran; 
	}
	public int getKiran() {
		return kiran;
	}
	public void setStupid(double stupid) {
		this.stupid = stupid; 
	}
	public double getStupid() {
		return stupid;
	}

}

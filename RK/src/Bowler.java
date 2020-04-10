
public class Bowler {
	
	private String name;
	private int age;
	private int first;
	private int second;
	private int third;
	
	public Bowler(String name, int first, int second, int third) {
		this.name = name;
		this.first = first;
		this.second = second;
		this.third = third;
	}
	public Bowler () {
		this.name = null;
		this.first = 0;
		this.second = 0;
		this.third = 0;
	}
	public void set(String name){
		this.name = name; 
	}
	public String get() {
		return name;	
	}
	public void saying() {
		System.out.printf ("The Name of the bowler is %s\n ",  get());
	}
	public void setAge(int age){
	//System.out.println("What is the bowler's Age: " );
		this.age = age; 
	}
	public int getAge() {
		return age;	
	}
	public void setFirst(int first){
		if (first < 0 || first > 300){
			System.out.println("Wrong");
		} else{
			this.first = first; 	
		}
	}
	public int getFirst() {
		return first;	
	}
	public void setSecond(int second){
		if (second < 0 || second > 300){
			System.out.println("Wrong");
		} else{
			this.second = second;  	
		}
	}
	public int getSecond() {
		return second;	
	}
	public void setThird(int third){
		if (third < 0 || third > 300){
			System.out.println("Wrong");
		} else{
			this.third = third;  	
		}
		
	}
	public int getThird() {
		return third;	
	}
	public double calcAverage(){
		double average = (first+second+third)/3;
		return average;	
	}	
}

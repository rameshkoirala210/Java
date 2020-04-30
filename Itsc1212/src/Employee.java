public class Employee {

private String name;
	
private int age; 
	
private final int ID; 
	
private double salary; 
	
private String department; 


	//create a employee with name, age, id, salary, and department. 
	public Employee(String n, int a, int id, double s, String dept) {
		name = n;
		age = a;
		ID = id;
		salary = s;
		department = dept;
	}




	//updates salary value
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	//returns new name,age,id,salary,depertment
	public String toString() {
		return name + " (" + ID + ") " + " is " + age 
		+ " years old and earn " + salary 
		+ " working for " + department;
	}
	//returns salary  
	public double getSalary() {
		return salary;
	}
	//retuens name
	public String getName() {
		return name;
	}
	//compares 2 employees salary
	public int compareTo(Employee other) {
		if (this.salary > other.salary)
			return 1;
		else if (this.salary < other.salary)
			return -1;
		else
			return 0;
	}

}

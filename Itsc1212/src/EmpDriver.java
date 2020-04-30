import java.util.Scanner;

public class EmpDriver {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name = a.next();
		System.out.println("Enter your Age: ");
		int age = a.nextInt();
		System.out.println("Enter your ID: ");
		int id = a.nextInt();
		System.out.println("Enter your Salary: ");
		double salary = a.nextDouble();
		System.out.println("Enter your Department: ");
		String department = a.next();
		
		Employee employee1 = new Employee(name, age, id, salary, department);
		
		System.out.println(employee1);
	}

}

import java.util.Scanner;

public class e7 {
	public static void main(String args[]) {
		Scanner rk = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = rk.nextDouble();
		System.out.println("Enter second num: ");
		snum = rk.nextDouble();
		answer = fnum / snum;
		System.out.println(answer);
	}

}

import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Bowler yes; 
		Bowler no;
		
		String name;
		int score;
		int score1;
		int score2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the bowler's Name: " );
		name = scanner.next();
		System.out.println("What is the bowler's First Score: " );
		score = scanner.nextInt();
		System.out.println("What is the bowler's Second Score: " );
		score1 = scanner.nextInt();
		System.out.println("What is the bowler's Third Score: " );
		score2 = scanner.nextInt();
		yes = new Bowler(name, score, score1, score2);
		System.out.println("What is the bowler's Name: " );
		name = scanner.next();
		System.out.println("What is the bowler's First Score: " );
		score = scanner.nextInt();
		System.out.println("What is the bowler's Second Score: " );
		score1 = scanner.nextInt();
		System.out.println("What is the bowler's Third Score: " );
		score2 = scanner.nextInt();
		no = new Bowler(name, score, score1, score2);
		
		System.out.println (yes.get() + " has a bowling average of "+ yes.calcAverage() );
		System.out.println (no.get() + " has a bowling average of "+ no.calcAverage() );
		
		yes.setFirst(12);
		
		if (averageA > averageB){
			System.out.println(\n has a higher average than Ralph Cramden. Their averages are "+ averageA + " and " + averageB);
		} else{
			System.out.println("\nRalph Cramden has a higher average than Ed Norton. Their averages are" + averageB + " and " + averageA);
		}	
		//yes.saying();
		//System.out.print ("The bowler is "+ Yes.getAge() + " years old");
		//System.out.print("\nThe bowler First score is " + Yes.getFirst());
		//System.out.print("\nThe bowler Second score is " + Yes.getSecond());
		//System.out.print("\nThe bowler Third score is " + Yes.getThird());
		//System.out.print("\nThe bowler Average score is " + Yes.getAverage());
		
		//No.saying();
		//System.out.print ("The bowler is "+ No.getAge() + " years old");
		//System.out.print("\nThe bowler First score is " + No.getFirst());
		//System.out.print("\nThe bowler Second score is " + No.getSecond());
		//System.out.print("\nThe bowler Third score is " + No.getThird());
		//System.out.print("\nThe bowler Average score is " + No.getAverage());
		
		//if (Yes.getAverage() > No.getAverage()){
			//return = System.out.print(Yes.getName() + "has a higher average than" + No.getName() + ". Their averages are "+ Yes.getAverage() + "and" + No.getAverage());
		//} else{
		  //  return = System.out.print(No.getName() +"has a higher average than" + Yes.getName() + ". Their averages are " + No.getAverage() + "and" + Yes.getAverage());
		//}
		//if (averageA > averageB){
			//System.out.println("\nEd Norton has a higher average than Ralph Cramden. Their averages are "+ averageA + " and " + averageB);
		//} else{
			//System.out.println("\nRalph Cramden has a higher average than Ed Norton. Their averages are" + averageB + " and " + averageA);
		//}	
		
	}
}


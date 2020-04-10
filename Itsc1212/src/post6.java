import java.util.Scanner;

//By Ramesh Koirala
//Verson 1?
//Date: 3/22/2020
//Post06 
public class post6 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("ID001/ID002");
		//string input
		System.out.println("Enter a String: ");
		 String b = a.nextLine();
		 //specific letter
		 System.out.println("Enter a letter: ");
		 String c = a.next();
		 
		 //finding length
        int num = 1;
        for (int i = 0; i < b.length(); i++) 
        {
            if (b.charAt(i) == ' ') 
            {
                num++;
            } 
        }

        System.out.println("Total Words = " + num);
        //index of specific letter
        System.out.println("Total Occurrences: "+b.indexOf(c));
        
        System.out.println("ID003 \n");
		
		 //replacing letter
		 System.out.println("Enter Word 1 (to be replaced):  ");
		 String word1 = a.next();
		 System.out.println("Enter Word 2 (that replaces Word 1):  ");
		 String word2 = a.next();
		 
		 String p1 = b.replace(word1,word2);
		 System.out.println(p1); 
        
    }  
}
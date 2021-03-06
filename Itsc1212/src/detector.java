import java.util.Scanner;

public class detector {

	public static void main(String[] args) {
		//================================
		//== Setting up game window ======

		SpaceGame myGame; //declaring the object form the class
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the window name? ");    //window title text
		String windowTitle = scan.nextLine();

		System.out.println("Enter how wide you want the window to be: ");   //window windowWidth
		int windowWidth = scan.nextInt();

		System.out.println("Enter how tall you want the window to be: ");   //window windowHeight
		int windowHeight = scan.nextInt();

		myGame = new SpaceGame(windowTitle, windowWidth, windowHeight); //instantiation of the object. At this time, object is allocated in the memory (heap)

		System.out.println("What shape do you want to add" );
		System.out.println("0 for triangles" );
		System.out.println("1 for Square " );
		System.out.println("2 for Rectangle " );
		System.out.println("3 for Circle " );
		int shape = scan.nextInt();
	
		
		int spaceShipX;
		int spaceShipY;
		do {
		System.out.println("Where do you want your spaceship? (x and y)");  //spaceship location
		 spaceShipX = scan.nextInt();    //x coordinate
		 spaceShipY = scan.nextInt();    //y coordinate

		//To check whether the spaceship coordinates are inside of the game
		// window, what should we do?

		//TODO: Check whether the spaceship is inside the game window
		if(spaceShipX > windowWidth || spaceShipX > windowHeight || spaceShipY > windowWidth || spaceShipY > windowHeight) {
			System.out.println("Spaceship is going to be bigger then the window");
		}else {
			System.out.println("it's inside the window");
		}
		}while(spaceShipX > windowWidth || spaceShipX > windowHeight || spaceShipY > windowWidth || spaceShipY > windowHeight);

		//If the spaceship coordinates are not inside of the window, 
		// repeat by keep asking the user for coordinates until it is inside.
		
		//System.out.println("What is the Width of the shape " );
		//int width = scan.nextInt();
		//System.out.println("what is the Height if the shape " );
		//int height = scan.nextInt();

			//Shape myShape = new Shape(shape, spaceShipX, spaceShipY, width, height);
			//myGame.addShape(myShape);

				
		//make random integers between 0 and the width and height of the window
		//these two values will be the coordinates of our point
		int randomX = (int)(Math.random() * spaceShipX); //TODO: FIX THESE!!!
		int randomY = (int)(Math.random() * spaceShipY);

	//TODO: Add a line here to create the point at the above random location 
		Shape myShape = new Shape(shape, spaceShipX, spaceShipY, randomX, randomY);
		myGame.addShape(myShape);
		

			
		boolean end = false;    //when this is equal to true, stop the game!
		while(!end){    //while the game has not ended

	//How can we move the spaceship in a random direction for a random distance?
	//hint: Random direction is either up, down, right, or left, you can do it by
	// generating a random number between 1 to 4 for each of the 4 directions
	// TODO: Generate a random direction
			int randirec = (int)(Math.random()* 4)+1;
	//TODO: Move the spaceship in a random direction
			if(randirec == 1){
				myGame.moveUp(myShape, 50, 5);
			}else if (randirec == 2) {
				myGame.moveDown(myShape, 50, 5);
			}else if (randirec == 3) {
				myGame.moveRight(myShape, 50, 5);
			}else{
				myGame.moveLeft(myShape, 50, 5);
			}
	//Hint: You need to move the ship in the above random direction
	// Hint: Every time before moving, you need to check if it's still in the bounds. 
	// If it's not in the bounds, then reset to where the user wanted the spaceship to be 
	//Hint: you need to have user specify spaceShipX, spaceShipY
	//TODO: check and see the point is inside the ship
			myShape.isPointInShape(windowHeight, windowWidth);	
//	      If the point is inside of the spaceship, stop the game. 
	// (HINT: use the API method isPointInSpace)

			}

			//Extra Credit (5 points): Make another game function!
		}
	}


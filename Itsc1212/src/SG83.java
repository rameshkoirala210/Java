import java.util.Scanner;


public class SG83 {

	public static void main(String[] args) {
		
		SpaceGame myGame = new SpaceGame("my game", 500, 500);
		
		int ssX = 250, ssY = 250; //spaceship location
		int shape = 0; //triangle
		int shapeX = 50; int shapeY = 50; //size of spaceship
		
		Shape spaceShip = new Shape(shape, ssX, ssY, shapeX, shapeY);
		
		myGame.addShape(spaceShip);
		
		int pointX = (int)(Math.random() * 250); 
		int pointY = (int)(Math.random() * 250);
		//System.out.println(pointX + "  "+pointY);
		Point base = new Point(pointX, pointY);
		
		myGame.addShape(base);
			while(spaceShip != base) {
				if(spaceShip.getLocY() > pointY && base != spaceShip){
					myGame.moveUp(spaceShip, 1, 1);
				}else if (spaceShip.getLocY() < pointY && base != spaceShip) {
					myGame.moveDown(spaceShip, 1, 1);
				}
			
				if (spaceShip.getLocX() < pointX && base != spaceShip) {
					myGame.moveRight(spaceShip, 1, 1);
				}else if(spaceShip.getLocX() > pointX && base != spaceShip){
					myGame.moveLeft(spaceShip, 1, 1);
				}
			}	
	}
}

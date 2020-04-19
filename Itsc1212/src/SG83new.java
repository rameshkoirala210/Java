import java.util.Scanner;


public class SG83new {

  static boolean debug = true;
  public static void main(String[] args) {
    SpaceGame myGame = new SpaceGame("Space",700,500);
    int shipX = 250,shipY = 350;
    Shape spaceShip = new Shape(0, shipX,shipY, 12,30);
    myGame.addShape(spaceShip);
    int homeX = randint(0,700),homeY = randint(0,500);
    Shape home = new Shape(1,homeX,homeY,75,75);
    myGame.addShape(home);
    while(!isClose(shipX,shipY,homeX,homeY,15)){
      myGame.removeAll();
      shipX = moveCloser(homeX,shipX);
      shipY = moveCloser(homeY,shipY);
      spaceShip = new Shape(0, shipX,shipY, 12,30);
      myGame.addShape(home);
      myGame.addShape(spaceShip);
    }
  
  
  }
  private static int moveCloser(int x1,int x2){
    int ret = 0;
    if(x2!=x1){
      if(x2>x1){
        ret = x2-1;
      }else{
        ret = x2+1;
      }
    }else{
      ret = x1;
    }
    return ret;
  }
  private static boolean isClose(int x1, int y1, int x2, int y2, int margin){
    boolean ret = false;
    boolean a = false;
    boolean b = false;
    if(x1-x2<margin && x1-x2>margin*-1){
      a = true;
    }
    if(y1-y2<margin && y1-y2>margin*-1){
      b = true;
    }
    if(a&&b){
      ret = true;
    }
    if(debug){System.out.println("("+x1+","+y1+") ("+x2+","+y2+") "+ret);}
    return ret;
  }
  private static int randint(int min,int max) {
		int ret =0;
		ret = (int)(Math.random()*(max-min)+min);
		return ret;
	}
}
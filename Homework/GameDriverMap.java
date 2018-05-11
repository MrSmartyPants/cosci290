/*
	Text Adventure:	Kathy
	Author:			Giovanni Pernudi
*/

public class GameDriverMap{
  
  //Gift has 2 class object for the current location. 
	private int xLocation;
  private int yLocation;
  
  //zero-argument default constructor
  public GameDriverMap() {
    this.xLocation = 0;
    this.yLocation = 0;
  }
  
  public int getXLocation() {
    return this.xLocation;
  }
  
  public int getYLocation() {
    return this.yLocation;
  }
  
  public void setXLocation(int xLocation) {
    this.xLocation = xLocation;
  }
  
  public void setYLocation(int yLocation) {
    this.yLocation = yLocation;
  }
  
  public String toString(){
    return "X - Coordinate: " + this.xLocation + "Y - Coordinate: " + this.yLocation;
  }
}

/*
	Text Adventure:	Kathy
	Author:			Giovanni Pernudi
*/

public class GameDriverMap{
  
  //Gift has 2 class object for the current location. 
	private String location;
  private String currentRoom;
  
  //zero-argument default constructor
  public GameDriverMap() {
    this.location = "nowhere";
    this.currentRoom = "no room";
  }
  
  public String getLocation() {
    return this.location;
  }
  
  public void setLocation(String location) {
    this.location = location;
  }
  
  public String getCurrentRoom() {
    return this.currentRoom;
  }
  
  public void setCurrentRoom(String currentRoom) {
    this.currentRoom = currentRoom;
  }
  
  public String toString(){
    return "Location: " + this.location + " Current Room: " + this.currentRoom; 
  }
}

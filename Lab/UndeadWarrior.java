/*
  Author: Giovanni Pernudi
  Co Sci 290
  
  This file acts as a subclass for the class Undead. It will store the datafields and methods
  for an object called UndeadWarrior
*/

public class UndeadWarrior
    extends Undead {
    private String rightHandWeapon;
    private String leftHandWeapon;

  public UndeadWarrior() {
    this.rightHandWeapon = "No Weapon";
    this.leftHandWeapon = "No Weapon";
  }

  public UndeadWarrior(String leftHandWeapon, String name, int expierence) {
    super(name, expierence);
    this.leftHandWeapon = leftHandWeapon;
  } 
  
  /* This method is a manipulator, it can modify the data fields of the instance varaible of area */
  /* This method requires the varaible of area as its argument.*/
  public void setRightHandWeapon(String rightHandWeapon){
    this.rightHandWeapon = rightHandWeapon;
  }
  
  public void setLeftHandWeapon(String leftHandWeapon){
    this.leftHandWeapon = leftHandWeapon;
  }
  
  /* This method is an accessor, it can access the date fields of the instance varaible of area */  
  public String getRightHandWeapon(){
    return this.rightHandWeapon;
  }
  
  public String getLeftHandWeapon(){
    return this.leftHandWeapon;
  }
  
  /* This method will print out a random number that will represent the attack of the Object. */
  public String toString(){
    return super.toString() + " Left Hand Weapon: " + this.leftHandWeapon + " Right Hand Weapon: " + this.rightHandWeapon;
  }
}
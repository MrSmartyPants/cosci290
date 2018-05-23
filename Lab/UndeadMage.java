/*
  Author: Giovanni Pernudi
  Co Sci 290
  
  This file acts as a subclass for the class Undead. It will store the datafields and methods
  for an object called UndeadMage.
*/

public class UndeadMage
    extends Undead {
    private String spellOne;
    private String spellTwo; 

  public UndeadMage() {
    super();
    this.spellOne = "No spell";
    this.spellTwo = "No spell";
  }

  public UndeadMage(String spellOne, int health, int experience, String name) {
    super(health, experience, "");
    this.spellOne = spellOne;
  } 
  
  /* This method is a manipulator, it can modify the data fields of the instance varaible of area */
  /* This method requires the varaible of area as its argument.*/
  public void setSpellOne(String spellOne){
    this.spellOne = spellOne;
  }
  
  public void setSpellTwo(String spellTwo){
    this.spellTwo = spellTwo;
  }
  
  /* This method is an accessor, it can access the date fields of the instance varaible of area */  
  public String getSpellOne(){
    return this.spellOne;
  }
  
  public String getSpellTwo(){
    return this.spellTwo;
  }
  
  /* This method will print out a random number that will represent the attack of the Object. */
  public String toString(){
    return super.toString() + " Spell One: " + this.spellOne + " Spell Two: " + this.spellTwo;
  }
}
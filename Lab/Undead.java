/*
  Author: Giovanni Pernudi
  Co Sci 290
  
  This class will be used for the objects of undead. They will store 
  how much health the enemy object has, the expierence, and the name 
  of the object
*/

public abstract class Undead {
    
  /* Declare variables as private to avoid users from manipulating the data fields. */
  private int health;
  private int experience;
  private String name;

  /* Create a constructor with default values */
  public Undead() {
    this.health = 0;
    this.experience = 0;
    this.name = "No Name";
   }
  
  public Undead(int health, int experience, String name) {
    this.health = health;
    this.experience = experience;
    this.name = name;
  }
  
  public Undead(String name, int experience){
    this.name = name;
    this.experience = experience;
  }
  
  /* This method is an accessor, it can access the date fields of the instance varaible of area */
   public int getHealth() {
    return this.health;
  }
  
  public int getExperience() {
    return this.experience;
  }
  
  public String getName() {
    return this.name;
  }
  
  /* This method is a manipulator, it can modify the data fields of the instance varaible of area */
  /* This method requires the varaible of area as its argument.*/
  public void setHealth(int Health) {
    this.health = health;
  }
  
  public void setExperience(int experience) {
    this.experience = experience;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  /* This method will put all of the information of the class into a String. */
  public String toString() {
    return "Undead Name: " + this.name + " Undead Health: " + this.health + " Undead Experience " + this.experience;
  }
  
  /* This method will print out a random number that will represent the attack of the Object. */
  public void attack() {
    System.out.println(getName() + " has attacked the enemy! It dealt " + 0 + (int)(Math.random() * 100) + " % of hitpoints.");
  }
}
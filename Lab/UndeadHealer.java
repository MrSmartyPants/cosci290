/*
  Author: Giovanni Pernudi
  Co Sci 290
  
  This file acts as a subclass for the class Undead. It will store the datafields and methods
  for an object called UndeadHealer.
*/

public class UndeadHealer
    extends Undead {
  
  /* Declare variables as private to avoid users from manipulating the data fields. */
    private String healSpell;
    private String healPotion; 
  
  /* Create a constructor with default parameters in case no information is given to the datafields */
  public UndeadHealer(){
    super();
    this.healSpell = "No spell";
    this.healPotion = "No item";
  }
  
  /* Create a consturctor with given parameters given to enter in the dayafields.*/
  public UndeadHealer(int health, int experience, String name, String healPotion) {
    super(health, experience, name);
    this.healPotion = healPotion;
  }
  
  public UndeadHealer(String name, int experience) {
    super(name, experience);
  }
  
  public UndeadHealer(int health, int experience, String name){
    super(health, experience, name);
  }
  
  public UndeadHealer(int health, int experience, String name, String healSpell, String healPotion){
    super(health, experience, name);
    this.healSpell = healSpell;
    this.healPotion = healPotion;
  }

  
  /* This method is a manipulator, it can modify the data fields of the instance varaible of area */
  /* This method requires the varaible of area as its argument.*/
   public void setHealSpell(String healSpell){
    this.healSpell = healSpell;
   }
  
  public void setHealPotion(String healPotion){
    this.healPotion = healPotion;
  }
  
  /* This method is an accessor, it can access the date fields of the instance varaible of area */  
  public String getHealSpell(){
    return this.healSpell;
  }
  
  public String getHealPotion(){
    return this.healPotion;
  }
  
   /* This method will print out a random number that will represent the attack of the Object. */
  public String toString(){
    return super.toString() + " Heal Spell: " + this.healSpell + " Heal Item " + this.healPotion;
  }
  
  /* custom method that the object can use to heal teammates. It will display the amount of hitpoints
  healed by choosing a random number from 1 to 100, utalizing a new method. */
  public void heal(){
    System.out.println(super.getName() + " used its Healing spell! It healed " + 0 + (int)(Math.random() * 100) + " % of hitpoints");
  }
}
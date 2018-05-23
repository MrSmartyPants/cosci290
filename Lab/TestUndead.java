/*
  Author: Giovanni Pernudi
  Co Sci 290
  
  This file will test out the methods of the class Undead
*/

public class TestUndead{
  public static void main(String[] args) {
    
    Undead Grunt = new UndeadMage();
    UndeadMage mage = new UndeadMage();
    Undead Boss = new UndeadMage("Fire Spell", 10, 1000, "Boss");
    Undead FinalBoss = new UndeadWarrior("Bow", "Final Boss", 4521);
   
    
    /* Create two objects, one with the default parameters, the second with some values assigned to it. */
    
    
    /* Test the To-String methods */
    System.out.println(Grunt.toString());
    System.out.println(mage.toString());
    System.out.println(Boss.toString());
    System.out.println(FinalBoss.toString());
    
    /* Test the attack method */
    Boss.attack();
    
    
  }
}
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
    
    /* Creating 5 new objects of UndeadHealer class with different parameters */ 
    UndeadHealer Priest = new UndeadHealer();
    UndeadHealer Druid = new UndeadHealer( "Druid", 630);
    UndeadHealer Paladin = new UndeadHealer(720, 1880, "Paladin");
    UndeadHealer Monk = new UndeadHealer(3287, 5667, "Monk", "Elixer");
    UndeadHealer Shaman = new UndeadHealer(7283, 9832, "Shaman", "Retribution", "Phoenix Down");
    
    
    /* Test the To-String methods */
    System.out.println(Grunt.toString());
    System.out.println(mage.toString());
    System.out.println(Boss.toString());
    System.out.println(FinalBoss.toString());
    
    System.out.println("\n");
    
    /* Print out the information of the UndeadHealer objects */
    System.out.println(Priest.toString());
    System.out.println(Druid.toString());
    System.out.println(Paladin.toString());
    System.out.println(Monk.toString());
    System.out.println(Shaman.toString());
    
    System.out.println("\n");
    
    /* Utalize the heal and attack method for each of the UndeadHealer object */
    Priest.attack();
    Priest.heal();
    Druid.attack();
    Druid.heal();
    Paladin.attack();
    Paladin.heal();
    Monk.attack();
    Monk.heal();
    Shaman.attack();
    Shaman.heal();
  }
}
/*

  Giovanni Pernudi 
  Co SCi 290
  
  Lab 3
   1. Using if - else if - else, create a scenario that sets up your character/user with random objects/situations.
  
   2. Use Random number generator
   
   3.Use at least one compound /complex conditional with a ogival operator. e.g. randomNum <= 80 
   && randomNum >= 70
   
 */


public class Lab03TestScenario {
  
  //entry-point for application
  public static void main(String[] args) {
    
    //setting up random generator for luck factor in this 
    int minimum = 1;
    int maximum = 100;
    int luck = minimum + (int)(Math.random() * maximum);
    
    System.out.println("You arrive to the resturant. Kathy is looking amazing with\n"
                      + "the new clothes you bought you. You walk up to ask for a table.");
    
    //Setting up a scenario for your date with Kathy. The game creates a factor known as Luck.
    //Your luck is randomly generated each game. If you luck is high enough. Fortunate things happen
    //if your luck is bad then your date will be much more difficult. 
    
    //if-else conditions to check to see if your luck is good enough for good scenarios.
    //if your luck is more than 95. You  get an extra bonus for your date.
    if(luck >=  75) {
      System.out.println("Thankfully you've managed to reseve a table for your date!");
      if(luck >= 95) {
        System.out.println("They've set up a table right next to the window and aquarium!\n"
                          + "Lucky you! Kathy is excited for this date.");
      }
    }
    else if (luck <= 75 && luck >= 25) 
      System.out.println("Oh No! You forgot to reseve a table. But luckily, there was a table waiting for you.");
    else 
      System.out.println("Oh No! You forgot to reseve a table. Now you have to wait. Kathy is getting annoyed.");
    
  }
    
}
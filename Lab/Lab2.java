/* 
  Giovanni Pernudi
  Co Sci 290
  
  Prompting user questions for Textbase Game
  
 */

import java.util.Scanner;
public class Lab2{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("The year is 2327. Humanity has accelerated the space travel project\n"
                      + " and successfully colonized many planets on the outer rim.\n"
                      + "However upon entering a hollow planet, they discovered an alien\n"
                      + "race that feed off any sentient being to survive.\n"
                      + "You are the commander of a crew.\n"
                      + "What is your name, Space Commander?: ");
      
    String name = input.next();
    
    System.out.println("What is your weapon of choice?: ");
    
    String weaponOfChoice = input.next();
    
    System.out.println("What is the name of the planet you crashed landed?: ");
    
    String nameOfPlanet = input.next();
    
    System.out.println("How many people did you start off with? " + name + ": ");
    
    int numberOfCrew = input.nextInt();
    
    System.out.println("How many people are left?: ");
    
    int numberOfSurvivors = input.nextInt();
    
    int diedOnImpact = numberOfCrew - numberOfSurvivors;
    
    System.out.println( diedOnImpact + " have died on impact.");
    
    
     }
  
  }

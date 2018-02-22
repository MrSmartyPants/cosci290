/* 
  
  Giovanni Pernudi
  Co Sci 290
  
  This application will run the start and first few features of a text-based
  dating simulation game called Kathy. This game will include the beginning 
  splash screen, the introduction, 
  and serveral alternative scenarios of the brancing paths of the game. 
  
  Note To Professor: My group was originally going to make a Space
  Surival Horror Text-Based Adevnture however we have decided to
  switch it to a dating simulation game.
  
*/

//import Scanner from class to use for user input.
import java.util.Scanner;

public class GameDriver {
  //entry point of the application
  public static void main(String[] args) {
    
    //assign System.in to variable to get input from user.
    Scanner input = new Scanner(System.in);
  
   //splash-screen at the start of the game.
  System.out.println(" _  __     _   _ \n"          
                    + "| |/ /    | | | |\n"         
                    + "| ' / __ _| |_| |__  _   _\n"
                    + "|  < / _` | __| '_ \\| | | |\n"
                    + "| . \\ (_| | |_| | | | |_| |\n"
                    + "|_|\\_\\__,_|\\__|_| |_|\\__, |\n"
                   +  "                     __/ |\n"
                   +  "                    |___/ \n");
    
    //background story for the beginning of the game.
    System.out.println("Greetings brave soul. You are about to undertake the most\n"
                      + "difficult quest known to man, \"dating\". Our story begins with you,\n"
                      + "our protagonist, walking to school as any ordinary day. You quickly\n" 
                      + "make it to the school and your first class. As the class starts, the teacher makes an\n"
                      + "announcement, a new student will be attending the class. The new student walks in and you\n"
                      + "can't believe it, the most beautiful girl you have ever seen. She says \"Hello. I'm Kathy\"\n"
                      + "and so your quest to win Kathy's heart begins.\n\n");
      
    //declare variable of String type for player's name.                 
    String yourName;
    int favoriteNumber;
    int kathyNumber;
    int heightfeet;
    int heightinches;
    
    //declare variables to set up the random number generator.declare
    int randomNumber = 0;
    int minimum = 1; //set min for range for random numbers
    int maximum = 3; //set max for range for random numbers
    
    //conversation with Kathy starts while prompting user to enter.
    System.out.println("Kathy was asked to take the empty seat next to you. Despite your\n"
                      + "paralysis due to her beauty, you've managed to muster up the courage to say\n"
                      + "something to her\n\n");
    
    //set up the first random event that will be different for each game. 
    randomNumber = minimum + (int)(Math.random() * maximum);
    
    if(randomNumber == 1){
      System.out.println("You: Aargh!\n"
                        + "Kathy: ... What?\n"
                        + "You: Uhh.. I meant to say \"Hi!\"\n"
                        + "Kathy: Hi, Nice to meet you.\n");
    }
    else if(randomNumber == 2) {
      System.out.println("You: H-Hello.\n"
                         + "Kathy: Hi. How are you.\n"
                         + "You: Fine. Thanks for asking.\n");
    }
     else {
       System.out.println("You: Lovely day we're having aren't we?\n"
         + "Kathy: I agree! What a wonderful day to be starting my new school!\n\n");
     }
      
     System.out.println("Narrator: You've decided to introduce yourself to Kathy.\n"
                       + "You: My name is: ");
    
    //get user input for their name.
    yourName = input.next();
    
    System.out.print("Please to meet you.\n"
                    + "Kathy: The feeling is mutual.\n");
    
    System.out.println("Narrator: You decided to ask Kathy about herself.\n"
                       + yourName + ": My favorite number is ");
    
    //get user input for favoriteNumber
    
    favoriteNumber = input.nextInt();
    
    System.out.println(yourName + ":What about you?\n");
    
    //change the value for maximum to update number generator
    maximum = 100;
    
    //generate a random number for Kathy
    kathyNumber = minimum + (int)(Math.random() * maximum);
    
    //comparison operator to compare Kathy's number with yours
    if(favoriteNumber == kathyNumber) {
       System.out.println("Kathy: Oh wow! That's my favorite number too!\n"
                         + "This is amazing!\n");
    }
    else {
      System.out.println("That's cool. My favorite number is " + kathyNumber + "\n");
    }
    
    
    System.out.println("     _____                         ____                 _\n"
                     + "   / ____|                       / __ \\               | |\n"
                     + "  | |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __| |\n"
                     + "  | | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__| |\n"
                     + "  | |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |  |_|\n"
                     + "   \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|  (_)");
    
  }
}
    

    
      
      
    
                       
                       
    
    
   
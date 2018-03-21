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
import java.util.*;

public class GameDriver {
  //entry point of the application
  public static void main(String[] args) {
    
    //assign System.in to variable to get input from user.
    Scanner input = new Scanner(System.in);
  
    //method call to display the splash screen of the text-based adventure to user.
    displaySplashScreen();
    
    //method call to display the background story of the game to the user.
    displayBackstory();
    
    //declare variable of String type for player's name.                 
    String yourName;
    int favoriteNumber;
    int kathyNumber;
    int heightFeet;
    int heightInches;
    int yourAge;
    int totalHeight; //will be converted to inches. 
    int affectionPoints = 0; //points that will determine different paths and endings either if the
    //date is going well or poorly. 
    
    //declare variables to set up the random number generator.declare
    int randomNumber = 0;
    int minimum; //set min for range for random numbers
    int maximum; //set max for range for random numbers
   
    //method call to use the random number genetor and store the new random number in a variable.
    randomNumber = useRandomNumberGenerator(1, 3);
    
    //method call to display a random encounter to Kathy for the user.
    displayRandomEncounter(randomNumber);
    
    System.out.print("Narrator: You've decided to introduce yourself to Kathy.\n"
                    + "You: My name is: ");
    
    //get user input for their name.
    yourName = input.next();
    
    System.out.print("Please to meet you.\n"
                    + "Kathy: The feeling is mutual.\n");
    
    System.out.println("Narrator: You decided to ask Kathy about herself.\n"
                       + yourName + ": My favorite number is ");
    
    //get user input for favoriteNumber
    
    favoriteNumber = input.nextInt();
    
    System.out.println(yourName + ": What about you?\n");

    
    //generate a random number for Kathy
    kathyNumber = useRandomNumberGenerator(1, 100);
    
    //comparison operator to compare Kathy's number with yours
    if(favoriteNumber == kathyNumber) {
       System.out.println("Kathy: Oh wow! That's my favorite number too!\n"
                         + "This is amazing!\n");
      affectionPoints = affectionPoints + 7; //add affection points to total
    }
    else {
      System.out.println("That's cool. My favorite number is " + kathyNumber + "\n");
    }
    
    //prompt the user to enter in their age
    
    System.out.print("Kathy: Okay. My turn.\n"
              + "Kathy: How old are you?\n"
              + yourName + ": I am ");
    
    yourAge = input.nextInt();
    
    System.out.print(" years old\n");
    
    //method call to create different paths for age response.
    ageScenario(yourAge, yourName, affectionPoints);
    
     if(yourAge < 15 || yourAge > 18){
       yourAge = 17; //reset age in case user enters an invalid age for current setting.
     }
    
    //prompt the user to enter in their age
    System.out.println("Kathy: You seem to be a lot taller than how you're sitting\n"
                      + "Kathy: How tall are you?\n"
                      + yourName + ": I happen to be\n"
                    + "Narrator: Enter in your height in feet and then inches, separated by a space or hitting enter.\n");
    
    heightFeet = input.nextInt();
    heightInches = input.nextInt();
    System.out.print(heightFeet + "'" + heightInches + "\"\n");
    
    totalHeight = ((heightFeet * 12) + heightInches);
    
    //method call to create multiple paths for height.
    heightPaths(totalHeight, yourName, affectionPoints);
   
    System.out.println("Kathy: I happen to be 5\"4'");
    
    
    System.out.println("Teacher: Alright everyone. Take out your books and turn to\n"
                      + "page 394.\n");
    
    //create pathways for endings, use affection points to see how well the user did.
    displayEnding(affectionPoints, yourName);
    
   
    //method call to display Game-Over Screen
    displayGameOverScreen();
    
    //instantiate ArrayList of int objects
    ArrayList<Gift> gifts = new ArrayList<Gift>();
    
    //instantiate each Gift object
    Gift g1 = new Gift();
    Gift g2 = new Gift();
    Gift g3 = new Gift();
    Gift g4 = new Gift();
    Gift g5 = new Gift();
    
    //add student objects to ArrayList
    gifts.add(g1);
    gifts.add(g2);
    gifts.add(g3);
    gifts.add(g4);
    gifts.add(g5);
    
    //Setting properties for each student object
    g1.setName("Flowers");
    g2.setName("Chocolates");
    g3.setName("Teddy Bear");
    g4.setName("Jewelry");
    g5.setName("Diamond Ring");
    
    g1.setType("Plant");
    g2.setType("Food");
    g3.setType("Toy");
    g4.setType("Accessory");
    g5.setType("Accessory");
    
    //set-up the random number generator and use it for the method to assign a value.
    g1.setPrice(useRandomNumberGenerator(10, 15));
    
    //Use the random number generator again to get a new value with the updated number range.
    g2.setPrice(useRandomNumberGenerator(10, 20));
    
    g3.setPrice(useRandomNumberGenerator(10, 25));
    
    g4.setPrice(useRandomNumberGenerator(25, 40));
    
    g5.setPrice(useRandomNumberGenerator(40, 99));
    
    g1.setRomancePoints(useRandomNumberGenerator(1, 2));
    
    g2.setRomancePoints(useRandomNumberGenerator(1, 5));
    
    g3.setRomancePoints(useRandomNumberGenerator(5, 10));
    
    g4.setRomancePoints(useRandomNumberGenerator(10, 25));

    g5.setRomancePoints(useRandomNumberGenerator(25, 100));
    
    //printing information of each gift after setting properties
    for(int i = 0; i < gifts.size(); i++)
      System.out.println(gifts.get(i));
    
  } //end of main-method
  
  //method to display Spalsh Screen of Text-Based Adventure Game
  public static void displaySplashScreen() {
      System.out.println(" _  __     _   _ \n"          
                    + "| |/ /    | | | |\n"         
                    + "| ' / __ _| |_| |__  _   _\n"
                    + "|  < / _` | __| '_ \\| | | |\n"
                    + "| . \\ (_| | |_| | | | |_| |\n"
                    + "|_|\\_\\__,_|\\__|_| |_|\\__, |\n"
                   +  "                     __/ |\n"
                   +  "                    |___/ \n");
  }
  
  //method to display the background story of the text-based adventure game to user.
  public static void displayBackstory() {
        System.out.println("Greetings brave soul. You are about to undertake the most\n"
                      + "difficult quest known to man, \"dating\". Our story begins with you,\n"
                      + "our protagonist, walking to school as any ordinary day. You quickly\n" 
                      + "make it to the high school and your first class. As the class starts, the teacher makes an\n"
                      + "announcement, a new student will be attending the class. The new student walks in and you\n"
                      + "can't believe it, the most beautiful girl you have ever seen. She says \"Hello. I'm Kathy\"\n"
                      + "and so your quest to win Kathy's heart begins.\n\n");
    
        System.out.println("Kathy was asked to take the empty seat next to you. Despite your\n"
                      + "paralysis due to her beauty, you've managed to muster up the courage to say\n"
                      + "something to her\n\n");
  }
  
  //method to use the random number generator and get a new random number. 
  public static int useRandomNumberGenerator(int minimum, int maximum) {
    return minimum + (int)(Math.random() * maximum);
}
  
  //method to randomly generate an encounter using the random number generator
  public static void displayRandomEncounter(int randomNumber) {
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
  }
  
  //method to create scenarios for age question response.
  public static void ageScenario(int yourAge, String yourName, int affectionPoints) {
     if(yourAge <= 14) {
      System.out.println("Kathy: Hahaha! Stop messing around. What is a " + yourAge + "\n"
                        + "Kathy: doing in a highschool? I'm guessing that you're 17.\n"
                        + yourName + ": You got me. I'm 17.\n"
                        + "Kathy:  Oh cool. I'm 16 years old.\n");
    }
    else if(yourAge >= 15 && yourAge <= 18) {
      System.out.println("Kathy: Oh cool. I'm 16 years old.\n");
      affectionPoints = affectionPoints + 2;
    }
    else if(yourAge >= 19 && yourAge <= 21) {
      System.out.println("Kathy: We're you held back a couple of grades?\n"
                        + yourName + ": Hahaha, no. I'm kidding. I'm 17.\n"
                        + "Kathy:  Oh cool. I'm 16 years old.\n");
    }
    else {
      System.out.println("Kathy: What?! Did you forget how to count or something?\n"
                        + yourName + ": Hahaha, no. I'm kidding. I'm 17.\n"
                        + "Kathy:  Oh cool. I'm 16 years old.\n");
    }
  }
  
  public static void heightPaths(int totalHeight, String yourName,  int affectionPoints) {
     if (totalHeight > 76) {
      System.out.println("Kathy: Wow! Have you considered trying out for the\n"
                        + "Kathy: Highschool's basketball team?\n");
    }
    else if(totalHeight >= 68 && totalHeight <= 76) {
            System.out.println("Kathy: Wow! You are incredibly tall.\n"
                        + "Narrator: Kathy begins to blush.\n");
      affectionPoints = affectionPoints + 3;
    }
    else if(totalHeight > 64 && totalHeight < 68) {
      System.out.println("Kathy: Oh cool. Just about the same height as me.\n");
      affectionPoints = affectionPoints + 1;
    }
    else {
      System.out.println("That short? I must have mistaken your height earlier.\n");
      affectionPoints = affectionPoints - 2; //take off points for bad response.
    }
  }
  
  //method to display which ending that the user got depending on his performance
  public static void displayEnding(int affectionPoints, String yourName) {
         if(affectionPoints >= 5) {
       System.out.println("Kathy: We'll talk again once class is over.\n"
                         + "Narrator: Kathy gives you a meaniful look.\n");
     }
    else if(affectionPoints >= 0 && affectionPoints < 5) {
      System.out.println("Kathy: We'll continue this some other time.\n"
                        + yourName + ": Looking forward to it.\n");
    }
    else {
      System.out.println("Kathy: It was nice talking to you ..um Ted?\n"
                        + yourName + ": Umm, it's " + yourName + "\n"
                         + "Kathy: Oh right. Sorry.\n"
                         + "Narrator: Kathy seems to have a disappointed look.\n"
                         + yourName + ": Did I do something wrong?\n");
    }
  }
  
  //method to display the game-over screen to user
  public static void displayGameOverScreen() {
        System.out.println("     _____                         ____                 _\n"
                     + "   / ____|                       / __ \\               | |\n"
                     + "  | |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __| |\n"
                     + "  | | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__| |\n"
                     + "  | |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |  |_|\n"
                     + "   \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|  (_)");
  }
}
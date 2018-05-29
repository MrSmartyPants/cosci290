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
    //calling a class that you made, giving a varaible and instantiating in memory to use it.
    //constructor.
    Utility tool = new Utility();
    
    ArrayList<Stat> stats = new ArrayList<Stat>();
    
    Stat s1 = new Stat();
    Stat s2 = new Stat();
    Stat s3 = new Stat();
    Stat s4 = new Stat();
    Stat s5 = new Stat();
    Stat s6 = new Stat();
    
    stats.add(s1);
    stats.add(s2);
    stats.add(s3);
    stats.add(s4);
    stats.add(s5);
    stats.add(s6);
    
    s1.setName("Intellegence");
    s2.setName("Strength");
    s3.setName("Charisma");
    s4.setName("Courage");
    s5.setName("Humor");
    s6.setName("Sensitivity");
    
    ArrayList<Kathy> kathyList = new ArrayList<Kathy>();
    
    Kathy k1 = new Kathy();
    kathyList.add(k1);
    k1.setName("Phone Number");
    Kathy k2 = new Kathy();
    kathyList.add(k2);
    k2.setName("Birthday");
    Kathy k3 = new Kathy();
    kathyList.add(k3);
    k3.setName("Mom's Occupation");
    Kathy k4 = new Kathy();
    kathyList.add(k4);
    k4.setName("Favorite Movie");
    Kathy k5 = new Kathy();
    kathyList.add(k5);
    k5.setName("Favorite Color");
    Kathy k6 = new Kathy();
    kathyList.add(k6);
    k6.setName("Favorite Food");
    Kathy k7 = new Kathy();
    kathyList.add(k7);
    k7.setName("Favorite Song");
    Kathy k8 = new Kathy();
    kathyList.add(k8);
    k8.setName("Zodiac Sign");
    Kathy k9 = new Kathy();
    kathyList.add(k9);
    k9.setName("Weight");
    Kathy k10 = new Kathy();
    kathyList.add(k10);
    k10.setName("Height");
    Kathy k11 = new Kathy();
    kathyList.add(k11);
    k11.setName("Blood Type");
    Kathy k12 = new Kathy();
    kathyList.add(k12);
    k12.setName("Favorite Subject");
    
    //method call to display the splash screen of the text-based adventure to user.
    tool.readFile("SplashScreens.txt", "Beginning Splash Screen", "}");

    //method call to display the background story of the game to the user.
    tool.readFile("Story.txt", "Scene1", "endScene1");
    
     lines();
    
    tool.readFile("Story.txt", "Scene2", "endScene2");
    
    beginningChoices1(stats);
    
    tool.readFile("Story.txt", "Scene3", "endScene3");
    
    beginningChoices2(stats);
    
    tool.readFile("Story.txt", "Scene4", "endScene4");
     
    beginningChoices3(stats);
    
    tool.readFile("Story.txt", "Scene5", "endScene5");
    
    beginningChoices4(stats);
    
    lines();
    
    tool.readFile("Story.txt", "Scene6", "endScene6");
    
    //declare variables to set up the random number generator
    int minimum; //set min for range for random numbers
    int maximum; //set max for range for random numbers
    
    //method call to use the random number genetor and store the new random number in a variable.
    int randomNumber = useRandomNumberGenerator(1, 3);

    //method call to display a random encounter to Kathy for the user.
    displayRandomEncounter(randomNumber); 
    
    lines();
    
    System.out.println("You: Hello, my name is\n" +
                       "Narrator: Type in your name here: ");
    
     //declare variable of String type for player's name.      
    String yourName;
    //This string varaible will store what a user wants to input into a file.
    String content = "";
    
    content = input.next();
    
    yourName = content;
    tool.writeFile("testWriting.txt", content);
    
    System.out.print(yourName + ":");
    
    tool.readFile("Story.txt", "Scene8", "endScene8");
    
    lines();
    
    System.out.print("My favorite color is\n"
                      + "Enter in your favorite color: ");
    
    String favoriteColor = input.next();
    
    randomNumber = useRandomNumberGenerator(1, 5);
   
    k5.setInformation(kathysFavoriteColor(randomNumber));
    
    int affectionPoints = 0; //points that will determine different paths and endings either if the
    //date is going well or poorly. 
    
    colorSituation(favoriteColor, affectionPoints, kathyList);
    
    lines();

    tool.readFile("Story.txt", "Scene11", "endScene11");
    
    randomNumber = useRandomNumberGenerator(1, 5);
    
    k12.setInformation(kathysFavoriteSubject(randomNumber));
    
    String favoriteSubject = input.next();
    
    subjectSituation(favoriteSubject, affectionPoints,
                    favoriteColor, kathyList);
    
    lines();
    
    tool.readFile("Story.txt", "Scene12", "endScene12");
     
    int heightFeet;
    int heightInches;
    int totalHeight; //will be converted to inches. 
    
    System.out.print("I happen to be: ");

    //get first number entered  by the user
    heightFeet = input.nextInt();
    //get second number entered by the user.
    heightInches = input.nextInt();
    System.out.print(heightFeet + "'" + heightInches + "\"\n");

    //convert to inches from feet to inches.
    totalHeight = ((heightFeet * 12) + heightInches);

    //method call to create multiple paths for height.
    heightPaths(totalHeight, yourName, affectionPoints);
    
    randomNumber = useRandomNumberGenerator(1, 3);
    
    k10.setInformation(kathyHeight(randomNumber));
    
    tool.readFile("Story.txt", "Scene13", "endScene13");
    
    lines();

    //create pathways for endings, use affection points to see how well the user did.
    displayEnding(affectionPoints, yourName);

    tool.readFile("Story.txt", "Scene14", "endScene14");
    
    lines();
    
    promptCommand();
    
    input.next();
    
    tool.readFile("SplashScreens.txt", "Game Instructions", "End Game Instructions");
    
    tool.readFile("Story.txt", "Scene15", "endScene15");
    
    lines();
    
    promptCommand();
    
    input.next();
    
    int userCommand = 0;
    int Cash = 0;
    
    displayMainMenu(userCommand, stats, kathyList, Cash);

    //method call to display Game-Over Screen
    tool.readFile("SplashScreens.txt", "GameOver Splash Screen", "{");
    
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
  
  //This method will display the first of the user choices. 
  public static void beginningChoices1(ArrayList<Stat> stats){
    Scanner input = new Scanner(System.in);
    
    int choice;
    boolean clear;
    
    do {
      choice = input.nextInt();
      clear = true;
      
      if(choice == 1){
         stats.get(0).setValue(stats.get(0).getValue() + 1);
        System.out.println("Intellegence +1!");
      }
      else if(choice == 2){
        stats.get(1).setValue(stats.get(1).getValue() + 1);
        System.out.println("Strength +1!");
      }
      else if(choice == 3){
        stats.get(3).setValue(stats.get(3).getValue() + 1);
        System.out.println("Courage +1!");
      }
      else if(choice == 4){
        stats.get(5).setValue(stats.get(5).getValue() + 1);
        System.out.println("Sensitivity +1!");
      }
      else {
        System.out.println("Invalid input. Please enter in a valid choice.");
        clear = false;
      }
    }while(clear == false);
  }
  
  public static void beginningChoices2(ArrayList<Stat> stats){
    Scanner input = new Scanner(System.in);
    
    int choice;
    boolean clear;
    
    do {
      choice = input.nextInt();
      clear = true;
      
      if(choice == 1){
        stats.get(0).setValue(stats.get(0).getValue() + 1);
        System.out.println("Intellegence +1!");
      }
      else if(choice == 2){
        stats.get(1).setValue(stats.get(1).getValue() + 1);
        System.out.println("Strength +1!");
      }
      else if(choice == 3){
        stats.get(2).setValue(stats.get(2).getValue() + 1);
        System.out.println("Charisma +1!");
      }
      else if(choice == 4){
        stats.get(4).setValue(stats.get(4).getValue() + 1);
        System.out.println("Humor +1!");
      }
      else {
        System.out.println("Invalid input. Please enter in a valid choice.");
        clear = false;
      }
    }while(clear == false);
  }
  
    public static void beginningChoices3(ArrayList<Stat> stats){
    Scanner input = new Scanner(System.in);
    
    int choice;
    boolean clear;
    
    do {
      choice = input.nextInt();
      clear = true;
      
      if(choice == 1){
        stats.get(0).setValue(stats.get(0).getValue() + 1);
        System.out.println("Intellegence +1!");
      }
      else if(choice == 2){
        stats.get(2).setValue(stats.get(2).getValue() + 1);
        System.out.println("Charisma +1!");
      }
      else if(choice == 3){
        stats.get(3).setValue(stats.get(3).getValue() + 1);
        System.out.println("Courage +1!");
      }
      else if(choice == 4){
        stats.get(5).setValue(stats.get(5).getValue() + 1);
        System.out.println("Sensitivity +1!");
      }
      else {
        System.out.println("Invalid input. Please enter in a valid choice.");
        clear = false;
      }
    }while(clear == false);
  }
  
  public static void beginningChoices4(ArrayList<Stat> stats){
     Scanner input = new Scanner(System.in);
    
    int choice;
    boolean clear;
    
    do {
      choice = input.nextInt();
      clear = true;
      
      if(choice == 1){
        stats.get(0).setValue(stats.get(0).getValue() + 1);
        System.out.println("Intellegence +1!");
      }
      else if(choice == 2){
        stats.get(2).setValue(stats.get(2).getValue() + 1);
        System.out.println("Charism +1!");
      }
      else if(choice == 3){
        stats.get(4).setValue(stats.get(4).getValue() + 1);
        System.out.println("Humor +1!");
      }
      else if(choice == 4){
        stats.get(5).setValue(stats.get(5).getValue() + 1);
        System.out.println("Sensitivity +1!");
      }
      else {
        System.out.println("Invalid input. Please enter in a valid choice.");
        clear = false;
      }
    }while(clear == false);
  }
  
  public static void lines() {
    System.out.println("------------------------------------------------------------");
  }
  
  public static void promptCommand() {
    System.out.print("Type in any key and press enter to continue.\n");
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
  
  public static String kathysFavoriteColor(int randomNumber) {
    if(randomNumber == 1)
       return "Blue";
    else if(randomNumber == 2)
       return "Red";
    else if(randomNumber == 3)
       return "Green";
    else if(randomNumber == 4)
      return "Pink";
    else
      return "Purple";
  }
  
  public static void colorSituation(String favoriteColor, int affectionPoints, ArrayList<Kathy> kathyList) {
    if(kathyList.get(4).getInformation().equalsIgnoreCase(favoriteColor)) {
      System.out.print("Kathy: Oh wow! I was just about to say that to! That's amazing!\n");
      affectionPoints += 3;
    }
    else {
      System.out.print("Oh how cool, My favorite color is " + kathyList.get(4).getInformation()
                      + "\n");
    }
  }
  
  public static String kathysFavoriteSubject(int randomNumber) {
    if(randomNumber == 1)
      return "Math";
    else if(randomNumber == 2)
      return "English";
    else if(randomNumber == 3)
      return "Science";
    else if(randomNumber == 4)
      return "History";
    else
      return "Art";
  }
  
  public static void subjectSituation(String favoriteSubject, int affectionPoints,
                                     String favoriteColor, ArrayList<Kathy> kathyList) {
    if(kathyList.get(11).getInformation().equalsIgnoreCase(favoriteSubject) &&
     (kathyList.get(4).getInformation().equalsIgnoreCase(favoriteColor)))  {
      System.out.print("Oh wow! Favorite color and favorite school subject!" 
                      + " We're going to be amazing friends!\n");
      affectionPoints += 5;      
    }
    else if(kathyList.get(11).getInformation().equalsIgnoreCase(favoriteSubject)) {
      System.out.print("Me too! I hope we get to work together.\n");
      affectionPoints += 3;
    }
    else
      System.out.print("Yeah. That's also a good subject. My favorite is " + kathyList.get(11).getInformation()
                      + "\n");
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
  
  public static String kathyHeight(int randomNumber) {
    if(randomNumber == 1){
      System.out.print("I'm 5'3\" by the way.\n");
      return "162 cm";
    }
    else if(randomNumber == 2){
      System.out.print("I'm 5'4\" by the way.\n");
      return "165 cm";
    }
    else{
      System.out.print("I'm 5'5\" by the way.\n");
      return "168 cm";
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
  
  public static void displayMainMenu(int userCommand, ArrayList<Stat> stats,
                                    ArrayList<Kathy> kathyList, int Cash) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Type \"1\" and press enter to go to the start menu\n"
                      + "Type \"2\" and press enter to go to the gym\n"
                      + "Type \"3\" and press enter to go to the school\n"
                      + "Type \"4\" and press enter to go to the park\n"
                      + "Type \"5\" and press enter to go to the mall\n"
                      + "Type \"6\" and press enter to go to City Hall\n"
                      + "Type \"7\" and press enter to go to the Comedy Show\n");
    
    userCommand = input.nextInt();
    
    boolean clear = true; 
    
    do{
      if(userCommand == 1)
        displayStartMenu(userCommand, stats, kathyList, Cash);
      else if(userCommand == 2)
        displayGymMenu(stats, Cash);
      else if(userCommand == 3)
        displaySchoolMenu(stats, kathyList);
   else{
       System.out.print("Invalid input. Please enter in a valid input.\n");
       clear = false; 
     }
   }while(clear == false);
  }
  
  
  public static void displayStartMenu(int userCommand, ArrayList<Stat> stats, ArrayList<Kathy> kathyList, int Cash){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Type \"1\" and press enter to view your current stats\n"
                      + "Type \"2\" and press enter to view Kathy's known information\n");
    
    userCommand = input.nextInt();
    
    boolean clear = true;
    
   do{
     if(userCommand == 1)
       displayStats(stats, Cash);
     else if(userCommand == 2)
       displayKathyInformation(kathyList);
     else{
       System.out.print("Invalid input. Please enter in a valid input.\n");
       clear = false; 
     }
   }while(clear == false);
                     
  }
  
  public static void displayStats(ArrayList<Stat> stats, int Cash) {
    Scanner input = new Scanner(System.in);
    lines();
    
    for(int i = 0; i < stats.size(); i++){
      System.out.println(stats.get(i));
    }
    
    System.out.println("Amount of Money: " + Cash);
    
    lines();
    
     promptCommand();
    
    input.next();
  }
  
  public static void displayKathyInformation(ArrayList<Kathy> kathyList) {
    Scanner input = new Scanner(System.in);
    lines();
    
    for(int i = 0; i < kathyList.size(); i++){
      System.out.println(kathyList.get(i));
    }
     lines();
    
     promptCommand();
    
    input.next();
  }
  
  public static void displayGymMenu(ArrayList<Stat> stats, int Cash) {
    Scanner input = new Scanner(System.in);
    lines();
    
    int userCommand = 0;
    
    System.out.println("Press \"1\" and hit enter to hit the weights. (Increase Strength 1 - 4 pts.)\n"
                      +"Press \"2\" and hit enter to hire a private trainer( Increase Strength 5 - 9 pts)\n"
                      + "Press \"3\" and hit enter to work around the gym(Increase money by $5 - $10)\n");
    userCommand = input.nextInt();
    
    boolean clear = true;
    
   do{
     if(userCommand == 1) {
       stats.get(1).setValue(stats.get(1).getValue() + useRandomNumberGenerator(1, 4));
       System.out.println(stats.get(1).toString());
     }
     else if(userCommand == 2) {
       stats.get(1).setValue(stats.get(1).getValue() + useRandomNumberGenerator(5, 9));
       System.out.println(stats.get(1).toString());
     }
     else if(userCommand == 3) {
       Cash = Cash + useRandomNumberGenerator(5, 10);
       System.out.println("Amount of Cash: " + Cash);
     }
     else{
       System.out.print("Invalid input. Please enter in a valid input.\n");
       clear = false; 
     }
   }while(clear == false);
  }
  
  public static void displaySchoolMenu(ArrayList<Stat> stats, ArrayList<Kathy> kathyList){
    Scanner input = new Scanner(System.in);
    lines();
    
    int userCommand = 0;
    
    System.out.println("Press \"1\" and hit enter to hit the books (Increase Intellegence 1 - 4 pts.)\n"
                      +"Press \"2\" and hit enter to hire a private tutor(Increase Intellegence 5 - 9 pts)\n"
                      + "Press \"3\" to talk to Kathy and potentially learn more about her.\n");
    userCommand = input.nextInt();
    
    boolean clear = true;
    
   do{
     if(userCommand == 1) {
       stats.get(0).setValue(stats.get(0).getValue() + useRandomNumberGenerator(1, 4));
       System.out.println(stats.get(0).toString());
     }
     else if(userCommand == 2) {
       stats.get(0).setValue(stats.get(0).getValue() + useRandomNumberGenerator(5, 9));
       System.out.println(stats.get(0).toString());
     }
     else if(userCommand == 3) {
       talkToKathy(kathyList);
     }
     else{
       System.out.print("Invalid input. Please enter in a valid input.\n");
       clear = false; 
     }
   }while(clear == false);
  }
  
 public static void talkToKathy(ArrayList<Kathy> kathyList) {
   int random = useRandomNumberGenerator(1, 10);
   
   if(random == 1){
      kathyPhoneNumber(kathyList);
   }
   else if(random == 2){
     kathyBirthday(kathyList);
   }
   else if(random == 3){
     momOccupation(kathyList);
   }
   else if(random == 4){
     kathyFavoriteMovie(kathyList);
   }
   else if(random == 5){
     kathyFavoriteFood(kathyList);
   }
   else if(random == 6){
     kathyFavoriteSong(kathyList);
   }
 }
    
  public static void kathyPhoneNumber(ArrayList<Kathy> kathyList) {
    if(!(kathyList.get(0).getInformation().equals("Unknown"))){
      System.out.println("What's my number again? It's " + kathyList.get(0).getInformation()
                        + "\nTry not to lose it");
    }
    else{
      int random = useRandomNumberGenerator(1, 2);
      
      if(random == 1){ 
        kathyList.get(0).setInformation("866-731-8410");
        System.out.println("Kathy: I never gave you my number? It's " + kathyList.get(0).getInformation());
      }
       else{
         kathyList.get(0).setInformation("866-656-7354");
         System.out.println("Kathy: I never gave you my number? It's " + kathyList.get(0).getInformation());
      }
    }
  }
  
  public static void kathyBirthday(ArrayList<Kathy> kathyList) {
    if(!(kathyList.get(1).getInformation().equals("Unknown"))){
      System.out.println("My Birthday? Sure, it's " + kathyList.get(1).getInformation()
                        + "\nDon't try to calculate my age.");
    }
    else{
      int random = useRandomNumberGenerator(1, 2);
          if(random == 1){ 
        kathyList.get(1).setInformation("August 29");
        System.out.println("Kathy: I never told you my birthday? Really? It's " + kathyList.get(1).getInformation());
        kathyList.get(7).setInformation("Virgo");
      }
       else{
         kathyList.get(1).setInformation("November 21");
         System.out.println("Kathy: I never told you my birthday? Really? It's " + kathyList.get(1).getInformation());
         kathyList.get(7).setInformation("Scorpio");
       }
    }
  }
  
  public static void momOccupation(ArrayList<Kathy> kathyList) {
    if(!(kathyList.get(2).getInformation().equals("Unknown"))){
      System.out.println("My mom sure does love working at " + kathyList.get(2).getInformation());
    }
    else{
      int random = useRandomNumberGenerator(1, 4);
      
      if(random == 1){ 
        kathyList.get(2).setInformation("Wedding Planner");
        System.out.println("Kathy: Does my mother enjoy her work? Of course, she works as a " + kathyList.get(2).getInformation());
      }
       else if(random == 2){
         kathyList.get(2).setInformation("Web-Page Designer");
         System.out.println("Kathy: Does my mother enjoy her work? Of course, she works as a " + kathyList.get(2).getInformation());
      }
      else if(random == 3){
       kathyList.get(2).setInformation("Florist");
        System.out.println("Kathy: Does my mother enjoy her work? Of course, she works as a " + kathyList.get(2).getInformation());
      }
      else{
        kathyList.get(2).setInformation("Landscape Architect");
        System.out.println("Kathy: Does my mother enjoy her work? Of course, she works as a " + kathyList.get(2).getInformation());
       }
     }
   }
  
   public static void kathyFavoriteMovie(ArrayList<Kathy> kathyList) {
    if(!(kathyList.get(3).getInformation().equals("Unknown"))){
      System.out.println("I can't wait to watch " + kathyList.get(3).getInformation()
                        + "\nIt's going to be great");
    }
    else{
      int random = useRandomNumberGenerator(1, 2);
      
      if(random == 1){ 
        kathyList.get(3).setInformation("Titanic");
        System.out.println("Kathy: We should watch " + kathyList.get(3).getInformation()
                          + " It's my favorite movie. You'll like it");
      }
       else{
        kathyList.get(3).setInformation("Twlight");
        System.out.println("Kathy: We should watch " + kathyList.get(3).getInformation()
                          + " It's my favorite movie. You'll like it");
      }
    }
  }
  
     public static void kathyFavoriteFood(ArrayList<Kathy> kathyList) {
    if(!(kathyList.get(5).getInformation().equals("Unknown"))){
      System.out.println("I hope today's lunch is " + kathyList.get(5).getInformation()
                        + "\nI haven't had it in a while");
    }
    else{
      int random = useRandomNumberGenerator(1, 2);
      
      if(random == 1){ 
        kathyList.get(5).setInformation("Noodle soup");
        System.out.println("Kathy: Have you tried " + kathyList.get(5).getInformation()
                          + "? It's the bomb");
      }
       else{
        kathyList.get(5).setInformation("Sushi");
        System.out.println("Kathy: Have you tried " + kathyList.get(5).getInformation()
                           + "? It's the bomb");
      }
    }
  }
  
  
  
  
}
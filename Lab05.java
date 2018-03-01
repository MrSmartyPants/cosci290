/*
  Giovanni Pernudi
  Co Sci 290
  
  Lab 5 
  - fix the logic and make this code, check if each character is a letter
*/
import java.util.Scanner;

public class Lab05 {
  //main method
  public static void main(String[] args) {
    
  //instantiate the Scanner object
  Scanner input = new Scanner(System.in);
    
    //initalize each variable 
    int nameLength = 0; //the amount of characters in a name. 
    //nameLength is initalized to 0 in order to run the while loop at least once.
    String name = ""; //user will input name of themselves. 
    boolean flag = false; 
    
    //ask the user for their name.
    System.out.print("Enter in your name. Hit enter when you're done typing in your name.\n");
    
    do {
      //runs the program at least once 
      //prompt the user to enter in their names again.
      name = input.next(); //user will enter in their names again
      nameLength = name.length(); //amount of letters will be stored in Length variable 
      
      while(nameLength < 2) {
        
        System.out.print("The name you've entered is less than 2 characters.\n"
                         + "Please enter in a valid name.\n");
        
        //if name is less than 2, the user will enter in a new name.
        name = input.next();
        //new name will have its length stored in sme variable. 
        nameLength = name.length(); 
      }
      
      for(int index = 0; name.length() > index; index++) { //initalized for loop to check every single character.       
        if(!Character.isLetter(name.charAt(index))) { //if current index is not a character, prompt the user to enter their names again, 
          //show errors and repeat the loop
          flag = false; //set the condition to true in order to run the loop again. 
          System.out.print(name.charAt(index) + " is not a letter.\n" //displays to the user, the current index that is not a character.
                            + "Please enter in a name without numbers or illegal characters.\n");
          nameLength = 0;
          break;
        }
        else {
        flag = true; //Set flag to false to exit out of do-while loop if user meets the two criterias.
        }
      }
    } while(flag == false && nameLength < 2); //check flag condition to see if user meets all of the criterias. 
    System.out.println("That's a nice name.");
  } 
}
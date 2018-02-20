import java.util.Scanner;

public class Selections {
  public static void main(String[] args) { 
  
    Scanner input = new Scanner(System.in);
    
    int number;
    boolean results;
    
    System.out.println("This program will determine if the number that you entered is\n"
                      + "more than 4.5 after subtracting 5 It will also make it to positive.");
    System.out.print("Enter in a number and hit return: ");
    
    number = input.nextInt();
    
    number = number - 5;
    
    if(|number - 5| < 4.5)
      results = true;
    else 
      results = false;
    
    System.out.println("It is " + results + " that, " + number + " is more than 4.5 after subtracting 5.");
    
    
  }
}
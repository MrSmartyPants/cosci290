import java.util.Scanner;

public class IfStatementPractice {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("This program will read in a number. If the number entered is more than 0\n" 
                    + "the program will assign a 1 value to X\n"
                    + "Please enter in a number: ");
    
    int number1;
    int x = 0;
    
    number1 = input.nextInt();
    
    if (number1 > 0)
      x = 1;
    
    System.out.println("X is equal to " + x);
    
  }
}
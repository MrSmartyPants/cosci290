import java.util.Scanner;

public class TwoWayStatements {
  public static void main(String[] args) {
    
    int number1 = 0 + (int)(Math.random() * ((20 - 0) + 1));
    int number2 = 0 + (int)(Math.random() * ((20 - 0) + 1));
    int answer;
    
    if(number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
      }
    
      System.out.println("What is " + number1 + " - " + number2);
      System.out.println("Enter in your answer and then hit return.");
      
      Scanner input = new Scanner(System.in);
      
      answer = input.nextInt();
    
    if(answer == number1 - number2) 
      System.out.println("Correct! " + number1 + " - " + number2 + " is " + answer);
    else {
      System.out.println("That is incorrect. " + number1 + " - " + number2 + " is " + (number1 - number2));
    }
      
  }
}
import java.util.Scanner;


public class IfStatementPractice2 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("This program will increase pay by 3% if score is more than 90.\n"
                      + "Please enter in a number and hit enter.");
    
    int score;
    double pay = 3.15; 
    double increase_pay;
    
    score = input.nextInt();
    
    
    if (score > 90)
    {
      increase_pay = pay * 0.03;
      pay = pay + increase_pay;
    }
    
    System.out.println("Your pay for this week is " + pay);
    
  }
}
  
import java.util.Scanner;

public class ComputeAverage{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    double n1;
    double n2;
    double n3;
    double average;
    
    System.out.print("This program will take in three numbers and compute the average.\n"
                    + "Hit space or Enter after entering in a number.\n" 
                    + "Hit return after enterning all three numbers\n"
                    + "Enter in three numbers: ");
    
    
    n1 = input.nextDouble();
    n2 = input.nextDouble();
    n3 = input.nextDouble();
    
    average = (n1 + n2 + n3) / 3;
    
    System.out.println("The averga of " + n1 + " " + n2 + " " + n3 + " " + " is " + average);
    
    
 
  }
}
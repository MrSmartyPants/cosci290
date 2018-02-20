/* 

Scanner input = new Scanner(System.in);
Scanner => Class
input => Object
= => Assignment Operator
new => keyword
Scanner => Object
(System.in) => Standard input device 

*/
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    double radius;
    double area;
    
    System.out.print("Enter in the radius of a circle: ");
    
    radius = input.nextDouble();
    
    
    area = radius * radius * 3.14159;
    
    System.out.println("The area of a circle with the radius of " + radius 
                      + " is " + area);
    
  }
  
}
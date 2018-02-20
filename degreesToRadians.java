import java.util.Scanner;

public class degreesToRadians {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int degrees = 47;
    double radians;
    
    radians = Math.toRadians(degrees);
    
    System.out.println("The amount of radians in " + degrees + " degrees is " + radians);
  }
}
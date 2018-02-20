/*
  Giovanni Pernudi
  Co Sci 290
  
  Demo topics on: 
    - increment/decrement opertators
    - augmented assignments operators.
    - Casting with ints, doubles, and chars
    - basic if-else block
    
*/

public class DemoBooleans{
  
  //start of application
  public static void main(String[] args){
    
    int num = 1; 
    
    num = num + 1; //increment num by 1
    num++; 
    ++num;
    
    num = 1;
    int count = ++num; //pre-increment 2, count 2, num 2
    System.out.println("count " + count + " num " + num );
    num = 1;
    count = num++; //post-increment, 1, count 1, num 2
    System.out.println("count " + count +  " num " + num );
    
    
    count = num--; //post-decrement
    count = --num; //pre-decrement
    
    //examples of agumented assignment operators
    num += 2; //Equivalent to => num = num + 2;
    //num *= 2; //Equivalent to => num * 2;
    //num /= 2; //num = num / 2;
    num -= 2; //num = num - 2;
    
    num = 2;
    double num2 = 3.0;
    System.out.println("Double wins: " + num * num2);
    System.out.println("Casting a double to int: " + (int) num2); //lose the decimial points
    System.out.println("Casting an int to a double " + (double) num); //ads floating point notation
    System.out.println("Casting a char to an int " + (int) 'c'); //truns the c into 99 because of ASCII
    
    
    int numOfZombies = 3; 
    int actualNumofZombies = 100;
    
    //basic if-else statement
    if(numOfZombies == actualNumofZombies) 
      System.out.println("You might survive this apocalypse.");
    
    else 
      System.out.println("You might Not survive this apocalypse.");
    
    //Generating a random number
    //Math.pow(3, 2); 3^2
    System.out.println(Math.random()); // random number between 0 and 1;
    
    System.out.println(1 + (int)(Math.random() * (10 - 1)));
    //minimum + Math.random() * maximum
    
    //Specific Range = Min + (Math.random() * (Max - Min))
    
    //you have a thirty percent chance of surviving.
    int chanceOfSurviving =  (1 + (int)(Math.random() * (10 - 1)));
    
   //random number
   System.out.println("Random Num: " + chanceOfSurviving);
    if (chanceOfSurviving <= 3){
      System.out.println("You made it alive!");
      }
    else {
      System.out.println("Game Over!");
    }
  }
}

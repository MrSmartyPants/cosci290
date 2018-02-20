/*
  Giovanni Pernudi
  Co Sci 290
  
  Topics: 
    - multi-way if-else
    - logical operators
    - symbolic logic
    - Compound/Complix
 */
import java.util.Scanner;

public class TestLogic {
  
  //entry point of application
  public static void main(String[] args) {
    
    //Setting up Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //prompt the user to enter in a grade
    System.out.println("Enter in a score and press return.");

    int grade = input.nextInt();
    
    //simple if
    
    /*
    
    if(grade < 90) {
      System.out.println("Grade is not an A");
    }
    else 
    {
      System.out.println("Grade is an A");
    }
    
    
    //two-way if-else statement
    if(grade < 90) {
      System.out.println("grade is not an A");
    }
    else {
      System.out.println("grade is an A");
    }
      
    */ 
      //multi if-else-elseif
    
    /*
      
     if(grade >= 90) {
       System.out.println("A");
     }
     else if(grade >= 80){
       System.out.println("B");
     }
    else if(grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
    
   */
    
    /*
      Logical Operators 
      
      ! - NOT
      != -  NOT equal to 
      == - Equal to?
      
      && - AND ==>
      || - OR
      
    */
    
    //using if-else, write code that checks wheather
    //a student grade is good,average, or bad.a
    
    if(grade >= 80) {
      System.out.println("This is a good grade.");
      
      //nested-if else statement
      if(grade >= 90) {
        System.out.println("Wow! You got an A");
      }
    }
    else if(grade < 80 && grade >= 70) {
      System.out.println("This grade is average.");
    }
    else {
      System.out.println("This is a bad grade.");
    }
 
    
    //TestScenario{}
    
  }
}
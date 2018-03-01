/* 
  Sina Tuy
  CoSci 290
  
  Topics:
  functions/methods - whate are the different parts
  - access modifier
  -return type
  - function name
  -parameters (optional)

*/

public class testFunctions{

  //entry point pf the application
  public static void main(String[] args) {
  
  /* 
    access modifiers
    public - anything can see/access
    private - only functions within a class can access.private
    default - same thing as no written declared modifier
    (another way of saying folders in Java are packages.)
    
    void part is called the return type 
    
    Return Types
    - int
    - double
    - string
    - char
    - booleans 
    - also can returns different objects
    - void (doesn't return anything)
    
    function names 
    - follows the same rules as any identifiers 
    
  - use the name of the function to call it.
  
  function parameters
  -input that the function uses inside somewhere in the function body
  - separate multiple parameters with commas. 
  
  */ 
   
    //testing custom function called findSum()
    
    System.out.println("The sum of 2 and 3 is " + findSum(2, 3));
   
    //test print Hello()
    System.outprintln(;
  }
  
  //this function finds the sum of two given numbers. 
  public static int findSum(int num1 , int num2) {
    int sum = num1 + num2;
    return sum;
    
  }
  
  public static string printHello(String name){
    return "Hello " + name;
  }
    
}

/* 
  Author: Giovanni Pernudi
  Co Sci 290 
  
  (7.8) Writing two overloaded methods that return the average of the array. One for
  int type return and one for double type return. 
*/ 
  
//import Scanner object from utilities package to get input from user  
import java.util.Scanner; 

public class arrayAverage{
  
  //entry point of the application 
  public static void main(String[] args) {
    
    //assign System.in to the Object input
    Scanner input = new Scanner(System.in); 
    
    //declaring a array variables
    int[] array;
    
    //creating an array of size 10
    array = new int[10];
    
    //declare variables to store the average of the arrays of both int and double type.
    int averageOfArray = 0;
    double averageOfArray2 = 0;
    
    //prompt the user to enter in 10 numbers
    System.out.println("Enter in 10 numbers, separated by spaces or by hitting the enter key: ");
    
    //Use a for-loop to process through the 10 inputs
    for(int i = 0; i < array.length; i++) 
      array[i] = input.nextInt();
    
    //method-call to get the average of the array.
    //method call twice to store the number in different data types.
    //One for int and another for double
    averageOfArray = average(array);   
    averageOfArray2 = average(array);
    
    //output the average in both type int and double
    System.out.println("The average of the array in data type int is: " + averageOfArray);
    System.out.println("The average of the array in data type double is: " + averageOfArray2);
  }
  
  //method to return a value of type int that is average of an array 
  public static int average(int[] array) { 
    
    //declare a variable to store the total sum of the numbers in the array
    int total = 0; 
    
    //Use a for-loop to add all the numbers in the array and store it in a variable.
    for(int i = 0; i < array.length; i++) 
      total += array[i];
    
    
    //return the average of an array by taking the total and dividing it by the amount of numbers. 
    return total / array.length;
  }
  
  //method to return a value of type double that is average of an array 
  public static double average(double[] array) { 
    
    //method to return a value of type int that is average of an array
    int total = 0;
    
    //Use a for-loop to add all the numbers in the array and store it in a variable.
    for(int i = 0; i < array.length; i++)
      total += array[i];
    
    //return the average of an array by taking the total and dividing it by the amount of numbers. 
    return total / array.length;
  }
}
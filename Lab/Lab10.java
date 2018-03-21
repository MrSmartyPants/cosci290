/* 
  Author: Giovanni Pernudi
  Co Sci 290 
  
  (7.8) Writing two overloaded methods that return the average of an array. One for
  int type return and one for double type return. You get the arguments from the command line 
  and use arrayList instead of arrays.
*/ 

//import everything from utilities to use ArrayList
import java.util.*;

public class Lab10{
  
  //entry point of the application 
  public static void main(String[] args) {
    
    //create a decoy variable to set as one of the arguments for one of the method-call
    //this ensure that the application does not create an erasure error without having to 
    //resort to factory method/creating a new function object.
    int decoy = 0; 
    
    //instantiate ArrayList of int objects
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Double> list2 = new ArrayList<Double>();
    
    //process the arguments from the command line. parse for both Integer and Double type in two different arrayLists
    for(int i = 0; i < args.length; i++) {
    list.add(Integer.parseInt(args[i]));
    list2.add(Double.parseDouble(args[i]));
    }
    
    //declare variables to store the average of the arrays of both int and double type.
    int averageOfArray = 0;
    double averageOfArray2 = 0;
    
    //method-call to get the average of the array.
    //method call twice to store the number in different data types.
    //One for int and another for double
    averageOfArray = average(list, decoy);   
    averageOfArray2 = average(list2);
    
    //output the average in both type int and double
    System.out.println("The average of the array in data type int is: " + averageOfArray);
    System.out.println("The average of the array in data type double is: " + averageOfArray2);
  }
  
  //method to return a value of type int that is average of an arrayList 
  public static int average(ArrayList<Integer> list, int decoy) { 
    
    //declare a variable to store the total sum of the numbers in the arrayList
    int total = 0; 
    
    //Use a for-loop to add all the numbers in the arrayList and store it in a variable.
    for(int i = 0; i < list.size(); i++) 
      total += (list.get(i));
    
    
    //return the average of an arrayList by taking the total and dividing it by the amount of numbers. 
    return total / list.size();
  }
  
  //method to return a value of type double that is average of an arrayList
  public static double average(ArrayList<Double> list2) { 
    
    //method to return a value of type int that is average of an arrayList
    int total = 0;
    
    //Use a for-loop to add all the numbers in the arrayList and store it in a variable.
    for(int i = 0; i < list2.size(); i++)
      total += (list2.get(i));
    
    //return the average of an arrayList by taking the total and dividing it by the amount of numbers. 
    return total / list2.size();
  }
}
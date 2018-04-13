/* 
  Author: Giovanni Pernudi
  Co Sci 290 
  
  Midterm - This program will prompt the user for how many numbers they wish to enter. The user will enter in the numbers.
  The program will finally sort the array in increaing order and 
 */

//import the Scanner object from the util package to get input from user.
import java.util.Scanner;

public class midterm{
  
  //entry point of the application
  public static void main(String[] args) {
    
    //this method call will display the description of the program to the user.
    description();
       
     //declare an object for Scanner using the method System.in to get input from user.
    Scanner input = new Scanner(System.in);

    //declare a variable that will store the value of how mnay numbers the user 
  //wishes to enter. Save the value of the variable when creating the array size. 
    int numberSize = 0;

    //method call to get the amount of numbers from the user.
    numberSize = listSize(numberSize);

    //declaring and creating the array that will store the list of numbers. 
    int[] list = new int[numberSize];

    //method call to get numbers from user and store them within an array.
    storeNumbers(list, numberSize);

    //method call to sort the array in increasing order
    sortArray(list);

    //method call to display the new array.     
    displayArray(list);

  System.out.println("This is the end of the program.");
  }
  
   //this method will display a description of what the program does to the user. 
   public static void description() { 
     System.out.println("\nThis program will ask for the amount of numbers that you\n"
                       + "wish to enter. Next the program will prompt you for the numbers\n" 
                       + "and save those numbers into an array. Finally the program will output\n"
                       + "the list of numbers in increasing order.\n");
   }
  
  //this method  will prompt the user to enter in the size of the array to store the number. 
  public static int listSize(int numberSize) {
    
    //declare an object for Scanner using the method System.in to get input from user.
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter in the amount of numbers you wish to input: ");
    
    //get the value from user.
    numberSize = input.nextInt();
    
    //return the value from the method call.
    return numberSize;
  }
  
  //this method will prompt the user to enter in a list of numbers and will store the numbers in an array.
  public static int[] storeNumbers(int[] list, int numberSize) {
    System.out.print("Enter in the list of numbers separated by a space or by hitting enter.\n"
                    + "Enter in a number: ");
    
    //declare an object for Scanner using the method System.in to get input from user.
    Scanner input = new Scanner(System.in);
    
    //use a for-loop to get each number that the user has entered. 
    for(int i = 0; i < numberSize; i++) {
       list[i] = input.nextInt();
    }
    
    //return the array. 
    return list; 
  }
  
  //this method will sort the array in increasing order.
  public static int[] sortArray(int[] list) {
    
    //create a variable that will hold one of the array values temporary, to switch to another array position
    //in increasing order. 
    int temp;
    
    //nested for-loops. One to literal scan the current index with the other indexes in the list(inner-loop)
    for(int i = 0; i < list.length; i++) {
      for(int k = 0; k < list.length; k++) {
        //if the curret index value is smaller than any of the other values, switch their positons.
          if(list[i] < list[k]) {
            //temp to store the larger value
            temp = list[k];
            list[k] = list[i];
            list[i] = temp;
          }
        } 
      }
    
    //return the array with the values now in increasing order.
    return list;
  }
  
  //this method will display the new array in increasing order.
  public static void displayArray(int[] list) {
    System.out.print("The list of numbers now in increasing order is ");
    for(int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
  }
}
}
/* 
  Author: Giovanni Pernudi
  Co Sci 290 
  
  Problem 7.19 - This program will prompt the user for how many numbers they wish to input.
  The program will then ask for the numbers from the user and store them into an array.
  The program will finally tell the user if the list of numbers is in nondecreasing order. 
*/ 

//import Scanner object from java.util package
import java.util.Scanner;
  
 public class Lab11 {
   
   //entry point of the application
   public static void main(String[] args) {
     
     //method call to display the description of the program to the user. 
     description();
     
     //declaring a varaible that stores the size of the array and a flag to check if the array is sorted or not.
     int numberSize = 0; 
     boolean flag = false;
     
     //method call to prompt the user how many numbers they wish to enter and store that number for array size in a variable
     numberSize = promptUser(numberSize);
     
     //declare a variable reference for an array
     int[] numbers;
     
     //create an array and plug in the size of the list into the array size. 
     numbers = new int[numberSize];
     
     //method call to get numbers from user and store them into an array
     getNumbers(numbers, numberSize);
     
     //method call to display the how many numbers are within a list and the numbers in that list.
     displayList(numberSize, numbers);
     
     //method call to check if the list is sorted in nondecending order and return true or false to store it into a variable
     flag = isSorted(numbers, numberSize);
     
     //display to the user if the list already sorted or not. 
     displayOutput(flag);
   }
   
   //this method will display a description of what the program does to the user. 
   public static void description() { 
     System.out.println("\nThis program will ask for the amount of numbers that you\n"
                       + "wish to enter. Next the program will prompt you for the numbers\n" 
                       + "and save those numbers into an array. Finally the program will output\n"
                       + "if the list of number is sorted in nondecreasing order.\n");
   }
   
   //this method will ask the user how many numbers they wish to enter and return that int value
   public static int promptUser(int numberSize) {
     
     //Create a Scanner object for user input
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter the size of the list: ");
     numberSize = input.nextInt();
     return numberSize;
   }
   
   //this method will prompt the user to enter in a list of numbers and will store the numbers in an array.
   public static void getNumbers(int[] numbers, int numberSize) {
     
     //Create a Scanner object for user input
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter in the contents of the list\n"
                     + "separated by a space or by pressing enter.\n"
                     + "Enter in a number: ");
     
     for (int i = 0; i < numberSize; i++) {
       numbers[i] = input.nextInt();
     }
     
   }
   
   //this method will display how many numbers the user has in a list and the numbers within that list
   public static void displayList(int numberSize, int[] numbers) {
     System.out.println("The list has " + numberSize + " integers ");
     for (int i = 0; i < numberSize; i++) {
       System.out.print(numbers[i] + " "); 
     }
     
     System.out.print("\n");
   }
   
   //this method will check if the list is in nondecreasing order and return true or false
   public static boolean isSorted(int[] numbers, int numberSize) { 
     
     //boolean variable to store true or false.
     boolean flag = true; 
     
     //for condition, have numberSize - 1 to avoid ArrayIndexOutofBound run-time error
     for(int i = 0; i < numberSize - 1; i++) {
       if(numbers[i + 1] >= numbers[i]) //if the index value above the current index is more then continue through the array. 
         flag = true;
       else //else return false for the method. 
         return false;
     }
     
     return true; //return true once you have gone through the entire array. 
   } 
   
   //this method will display to the user if the list is in order or not. 
   public static void displayOutput(boolean flag) {
     if(flag == false) 
       System.out.println("The list is not sorted");
     else
       System.out.println("The list is already sorted");
   }
 
 }

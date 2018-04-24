/*
  Author: Giovanni Pernudi
  Co Sci 290
  
  This program will instantiates a 5 by 5 multi-dimensional array of integers
  The values will be random and utilize a loop to return a random values
  The program will finally print out the all the values in the array.
*/

 public class Lab15 {
   //entry point of the application.
   public static void main(String[] args) {
     
     displayDescription();
     
     //declare a multi-deminsional array of int type. 
     int[][] numbers;
     
     //instantiates a 5 by 5 multi-dimensional array of integers
     numbers = new int[5][5];
     
     //nested for-loops, one for the rows and the inner loop for the column. 
     for(int row = 0; row < numbers.length; row++) {
       for(int column = 0; column < numbers[row].length; column++) {
         //method call the random number generator to get a random value and assign it to the current multi-deminsional index.
         //pass 0 as the minimum numnber and 100 for a maximum value, the system will pick  a number between those two values.
         numbers[row][column] = useRandomNumberGenerator(0, 100);
       }
     }
     //same nested for-loop for displaying the multi-deminsional array.
      for(int row = 0; row < numbers.length; row++) {
       for(int column = 0; column < numbers[row].length; column++) {
         System.out.print(numbers[row][column] + " ");
       }
        //System print a new line to sepearate the rows. 
        System.out.println();
   }
     
     System.out.print("\nEnd of program.\n");
   }
   
   //method to display the description of the program to the user
   public static void displayDescription() {
     System.out.println( "\nThis program will instantiates a 5 by 5 multi-dimensional array of integers\n"
                        + "The values will be random and utilize a loop to return a random values\n"
                        + "The program will finally print out the all the values in the array.\n");
   }
   
   //method to use the random number generator and get a new random number. 
  public static int useRandomNumberGenerator(int minimum, int maximum) {
    return minimum + (int)(Math.random() * maximum);
    }
 }



/*
  Giovanni Pernudi
  Co Sci 290
  
  Intro to arrays
  
  Lab - Assign every element a value and then iterate and print each element
*/

public class Arrays1{
  public static void main(String[] args) {
    
    //declare an array of type int
    String[] numbers = new String[10]; //*** ******** *** ********
    
    numbers[0] = "nine";
    numbers[1] = "three";
    numbers[2] = "zero";
    numbers[3] = "five";
    numbers[4] = "Eleven";
    numbers[5] = "Two";
    numbers[6] = "Six";
    numbers[7] = "Four";
    numbers[8] = "Five";
    numbers[9] = "Eight";
      
    for(int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    
    //assign element at index 3 the value "five"

    //numbers[11] = "twenty"; //can't do this line, will give arrayIndexOutOfBOunds 
    
    //redeclare with a different size because you can't or remove
    //numbers = new String[8];
    
    
  }
}
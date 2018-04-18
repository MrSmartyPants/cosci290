/*
  Author: Giovanni Pernudi
  Co Sci 290
  
  - Input/Output file
  - Custom class utilities for custom methods.Custom
  - Remove string literals
  - Place string literals in file and have it processes through program
*/

//BufferedReader is class.
import java.io.BufferedReader;
import java.io.FileReader;
//When errors happens, your programs won't crash/
import java.io.IOException;

public class Lab13demo {
  //entry point of the application.
  public static void main(String[] args) {
    //static won't be required. 
    //buffer reader and file reader.
    
    String currentLine; //holds current line being read in file
    String filename = "Test.txt"; //hold the relative path of a file. //absolute is harddrive. 
    //ls list all of the folder names in a given folder. 
    
    //trying to open a file to read 
    //instatiate filereader for class and takes a file name. 
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){ //try-catch block. If file is not there. instead of crashing - it'll run the programs
      //if file is found, it'll read from file. 
      
      
      //read each line of the file until end of file. 
    while(!((currentLine = br.readLine()).equals("cat"))) {
        System.out.println(currentLine);
        
      }
      
    //if there is no file to read to open the exception will be caught.
    }catch(IOException e){
      e.printStackTrace();
    }
  } //end main methods
} // end class 
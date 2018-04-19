/*
  Author: Giovanni Pernudi
  
  This Utility class houses all the custom methods 
  that support my text adventure.
*/

//Java creates its own constructor. 
import java.io.BufferedReader;
import java.io.FileReader;
//When errors happens, your programs won't crash/
import java.io.IOException;

public class Utility {
  
  /*
    This methods opens a file and prints out each line.
  */ 
 
  //create comments for developed custom methods.
  //filename is either or one word or two words. 
  public void readFile(String filename, String startingLine, String endingLine){
    
    String currentLine; //holds current line being read in file
    //ls list all of the folder names in a given folder. 
    
    //trying to open a file to read 
    //instatiate filereader for class and takes a file name. 
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){ //try-catch block. If file is not there. instead of crashing - it'll run the programs
      //if file is found, it'll read from file. 
      
      while(!((currentLine = br.readLine()).equals(startingLine))){
      }
      while(!((currentLine = br.readLine()).equals(endingLine))) {
        System.out.println(currentLine);
       }
      }catch(IOException e){
      
    //if there is no file to read to open the exception will be caught 
      e.printStackTrace();
    }
  }
}

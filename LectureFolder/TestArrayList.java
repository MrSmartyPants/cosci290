/*
  Author: Giovanni Pernudi
  Co Sci 290 
  
  Testing ArrayLists
 */

//import everything from utilities to use ArrayList
import java.util.*;
public class TestArrayList{
  
  //main method of application
  public static void main(String[] args){
    
    //instantiate ArrayList of int objects
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    //add stuff to list
    list.add(30);
    list.add(100);
    
    //get an element
    System.out.println("Get first element: " + list.get(0));
    
    //remove an element
    list.remove(0);
    
    System.out.println("Get first element after removing: " 
                       + list.get(0));
    
    list.add(13);
    list.add(1);
    list.add(2, 50); //overloaded add method, index of insertion, element value
    
    
    System.out.println("Iterate through list...");
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
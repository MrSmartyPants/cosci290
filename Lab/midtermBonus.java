/*
   Author: Giovanni Penudi
   Co Sci 290
   
   Midterm - Bonus
*/

import java.util.*;

public class midtermBonus{
  
  //main method of application
  public static void main(String[] args) {
    
    System.out.println("\nThis program will output\n"
                       + "the GPA of students in increasing order.\n");
    
    //setting two variables for random number generator.
    double minimum = 0.0;
    double maximum = 4.0;
    
    //instantiate studentList of objects
    ArrayList<Student> studentList = new ArrayList<Student>();
    
    //instantiate each Student object
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();
    
    //add student objects to ArrayList
    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);
    studentList.add(s5);
    
    //Setting properties for each student object
    s1.setGpa(useRandomNumberGenerator(minimum, maximum));
    s2.setGpa(useRandomNumberGenerator(minimum, maximum));
    s3.setGpa(useRandomNumberGenerator(minimum, maximum));
    s4.setGpa(useRandomNumberGenerator(minimum, maximum));
    s5.setGpa(useRandomNumberGenerator(minimum, maximum));
    
    sortArray(studentList);
      
    printStudents(studentList);
  }
  
  //this method will sort the array in increasing order.
  public static ArrayList sortArray(ArrayList<Student> studentList) {
    
    //create a variable that will hold one of the array values temporary, to switch to another array position
    //in increasing order. 
    double temp;
    
    //nested for-loops. One to literal scan the current index with the other indexes in the list(inner-loop)
    for(int i = 0; i < studentList.size(); i++) {
      for(int k = 0; k < studentList.size(); k++) {
        //if the curret index value is smaller than any of the other values, switch their positons.
          if(studentList.get(i).getGpa() < studentList.get(k).getGpa()) {
            //temp to store the larger value
            temp = studentList.get(k).getGpa();
            studentList.get(k).setGpa(studentList.get(i).getGpa());
            studentList.get(i).setGpa(temp);
          }
        } 
      }
    
    return studentList;
  }
  
 public static void printStudents(ArrayList<Student> studentList) {
  for(int i = 0; i < studentList.size(); i++) {
      System.out.println(studentList.get(i).getGpa());
    }
  }
  
  //method to use the random number generator and get a new random number. 
  public static double useRandomNumberGenerator(double minimum, double maximum) {
    return minimum + (double)(Math.random() * maximum);
  }
}
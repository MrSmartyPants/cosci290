/* 
  Author: Giovanni Pernudi
  Co Sci 290
  
  You don't need to declare and create a new array if you miscalculate the amount of elements
  required in your program. With an Arraylist, you can simply add or remove a value to the list at any time.
  Arrays only allows you to use primitive types of data while an ArrayList allows you to use a wrapper
  type encompassing its respective primitive data type
*/

//wild-card import to import all the classes in a package, specifically to use ArrayList
import java.util.*;

public class Lab09{
  
  //main method of application
  public static void main(String[] args){
    
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
    s1.setGpa(2.3);
    s1.setMajor("Electrical Engineering");
    s2.setGpa(3.5);
    s2.setMajor("Psychology");
    s3.setGpa(3.8);
    s3.setMajor("Math");
    s4.setGpa(4.0);
    s4.setMajor("Kinesiology");
    s5.setGpa(3.0);
    s5.setMajor("Art");  
    
    //method-call to print out the information of the students
    printStudents(studentList);
    
    //new-line to separate the results of the two methods.
    System.out.print("\n");
    
    //method-call to find a specific object relating to the major of the student 
    System.out.println(findMajor(studentList, "Art"));
                                         
 } //end of main-method
  
  /* 
  This function prints an arrray of Student objects
  */
  
  public static void printStudents(ArrayList<Student> studentList) {
    for(int i = 0; i < studentList.size(); i++) {
      System.out.println(studentList.get(i));
    }
  }
  
  /*
  This function does a linear search for a specific Student object if a major matches.
  When the search finds a matching major in a Student object, return the Student object.
  */
  
  public static Student findMajor(ArrayList<Student> studentList, String major) {
    for (int i = 0; i < studentList.size(); i++) { //Scan through every single object.
      if(major.equals(studentList.get(i).getMajor()))
        return studentList.get(i); //return index of objet if major is a match to  one of the objects.
    }
    return null; //return null if there isn't a single match from th array of objects.
  }
}
  
import java.util.*;

public class midtermBonus{
  
  //main method of application
  public static void main(String[] args) {
    
    //instantiate studentList of objects
    ArrayList<Student> studentList = new ArrayList<Student>();
    
    int numbersize = 0;
    
    listSize(numberSize);
    
    //instantiate each Student object
    for(int i = 0; i < numberSize; i++) {
      "Student s" + i = new Student();
      studentList.add(s + i);
    }
    
    s1.setGpa(2.3);
    s2.setGpa(3.5);
    s3.setGpa(3.8);
    s4.setGpa(3.0);
    
    //method-call to print out the information of the students
    printStudents(studentList);
    
    
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
  
    /* 
  This function prints an arrray of Student objects
  */
  
  public static void printStudents(ArrayList<Student> studentList) {
    for(int i = 0; i < studentList.size(); i++) {
      System.out.println(studentList.get(i));
    }
  }
} 
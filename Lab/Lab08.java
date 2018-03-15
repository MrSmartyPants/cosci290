/* 
  Giovanni Pernudi
  Co Sci 290
  
  Group 3/Lab 8

  1st Part - Writing a program instantiates 5 Student objects with the
  information given.
  2nd Part - Write a method that will print out the information presented
  3rd Part - Write a method that will search out a specific object to 
  see if the majors matches.
  
*/

public class Lab08{
   
  //main method
  public static void main(String[] args){
  
   //declare an array of students
   Student[] students = new Student[5];
  
    //instantiate each Student object
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();
    
    //add student object to array
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    students[3] = s4;
    students[4] = s5;
    
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
    printStudents(students);
    
    //method-call to find a specific object 
    System.out.println(findMajor(students, "Computer Science"));
                                         
 } //end of main-method
  
  /* 
  This function prints an arrray of Student objects
  */
  
  public static void printStudents(Student[] students) {
    for(int i = 0; i < students.length; i++) {
      System.out.println(students[i].toString());
    }
  }
  
  //This function does a linear search for a specific Student object if a major matches.
  //When the search finds a matching major in a Student object, return the Student object.
  
  public static Student findMajor(Student[] students, String major) {
    for (int i = 0; i < students.length; i++) { //Scan through every single object.
      if(major.equals(students[i].getMajor())) 
        return students[i]; //return index of objet if major is a match to  one of the objects.
    }
    return null; //return null if there isn't a single match from th array of objects.
  }
}

/* 
  Author: Giovanni Pernudi
  Co Sci 290 
  
  Lab 20 - This class creates shapes as objects, sets their area, retrieves 
  their area, and displays the area in a String. 
*/
public class TestShape{
  public static void main(String[] args) {
    Shape circle = new Shape();
    
    System.out.println(circle.toString());
  }
}

class Shape{
  /* The are of the shape. Declare it to private to avoid users from manipulating the data fields. */
  private int area; 
  
  /* Create a constructor with a default value. */ 
  public Shape(){
     this.area = 0;
  }
  
  /* This method is an accessor, it can access the date fields of the instance varaible of area */
  public int getArea(){
    return this.area;
  }
  
  /* This method is a manipulator, it can modify the data fields of the instance varaible of area */
  /* This method requires the varaible of area as its argument.*/
  public void setArea(int area){
    this.area = area;
  }
  
  /* This method displays the area of the shape */ 
  public String toString(){
    return "The area of the shape is " + this.area;
  }
}
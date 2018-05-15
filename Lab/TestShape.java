/* 
  Author: Giovanni Pernudi
  Co Sci 290 
  
  Lab 20 - This class creates shapes as objects, sets their area, retrieves 
  their area, and displays the area in a String. 
*/
public class TestShape{
  public static void main(String[] args) {
    Shape circle = new Shape();
    Shape square = new Shape(5, "Square");
    Shape rectangle = new Shape(10);
    
    System.out.println(circle.toString());
    System.out.println(square.toString());
    System.out.println(rectangle.toString());
  }
}

class Shape{
  /* The are of the shape. Declare it to private to avoid users from manipulating the data fields. */
  private int area; 
  private String name;
  
  /* Create a constructor with a default value. */ 
  public Shape(){
     this.area = 0;
      this.name = "Shape";
  }
  
  public Shape(int area){
    this.area = area;
    this.name = "Shape";
  }
  
  public Shape(String name){
    this.area = 0;
    this.name = name;
  }
  
  public Shape(int area, String name){
    this.area = area; 
    this.name = name;
  }
  
  /* This method is an accessor, it can access the date fields of the instance varaible of area */
  public int getArea(){
    return this.area;
  }
  
  public String getName(){
    return this.name;
  }
  
  /* This method is a manipulator, it can modify the data fields of the instance varaible of area */
  /* This method requires the varaible of area as its argument.*/
  public void setArea(int area){
    this.area = area;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  /* This method displays the area of the shape */ 
  public String toString(){
    return "The area of the " + this.name + " is " + this.area;
  }
}
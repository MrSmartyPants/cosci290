/* 
  Giovanni Pernudi
  Co Sci 290 
  
  Creating an array of objects with the custom class. 
  Setting random values to each attribute
*/ 

public class Lab07 { 
  
  //main method (entry point of the application)
  public static void main(String[] args) {
    
    //declaring an array of objects 
    Gift[] gifts = new Gift[5];
    
    //instantiate each Gift object
    Gift g1 = new Gift();
    Gift g2 = new Gift();
    Gift g3 = new Gift();
    Gift g4 = new Gift();
    Gift g5 = new Gift();
    
    //adding student objects to the array
    gifts[0] = g1;
    gifts[1] = g2;
    gifts[2] = g3;
    gifts[3] = g4;
    gifts[4] = g5;
    
    //Setting properties for each student object
    g1.setName("Flowers");
    g2.setName("Chocolates");
    g3.setName("Teddy Bear");
    g4.setName("Jewelry");
    g5.setName("Diamond Ring");
    
    g1.setType("Plant");
    g2.setType("Food");
    g3.setType("Toy");
    g4.setType("Accessory");
    g5.setType("Accessory");
    
    //declaring minimum and maximum variables for creating a random number generator. 
    int minimum = 10;
    int maximum = 15; 
    
    //set-up the random number generator and use it for the method to assign a value.
    g1.setPrice(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    //change the value of maximum to set a new number range.
    maximum = 20;
    //Use the random number generator again to get a new value with the updated number range.
    g2.setPrice(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    maximum = 25;
    g3.setPrice(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    //change the value of minimum to set a new number range
    minimum = 25;
    maximum = 40; 
    g4.setPrice(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    minimum = 40;
    maximum = 99; 
    g5.setPrice(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    minimum = 1;
    maximum = 2; 
    g1.setRomancePoints(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    maximum = 5;
    g2.setRomancePoints(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    minimum = 5;
    maximum = 10;
    g3.setRomancePoints(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    minimum = 10;
    maximum = 25;
    
    g4.setRomancePoints(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    minimum = 25;
    maximum = 100;
    g5.setRomancePoints(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
    
    //printing information of each gift after setting properties
    for(int i = 0; i < gifts.length; i++)
      System.out.println(gifts[i].toString());
    
  }
}
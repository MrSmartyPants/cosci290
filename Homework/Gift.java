/*
	Text Adventure:	Kathy
	Author:			Mike Plata
*/

public class Gift{

	//Gift has 4 class members
	private String name;
	private String type;
	private int price;
	private int romancePoints;
	
	//Gift has 1 default constructor
	public Gift(){
		
		//assigns the indicated string to the name property
		this.name = "someGift";
		
		//assigns the indicated string to the type property
		this.type = "someType";
		
		//assigns a value to the price property
		this.price = 0;
		
		//assigns a value to the romancePoints property
		this.romancePoints = 0;
		
	}
	
	//Gift has 1 implicit constructor
	public Gift(String someName, String someType, int somePrice, int somePoints){
	
		//assigns the value of someName to the name property
		this.name = someName;
		
		//assigns the value of someType to the type property
		this.type = someType;
		
		//assigns the value of somePrice to the type property
		this.price = somePrice;
		
		//assigns the value of somePoints to the romancePoints property
		this.romancePoints = somePoints;
	}
	
	//method to set a value to the name property
	public void setName(String newName){
	
		//assigns the value of newName to the name property
		this.name = newName;
	}
	
	//method to return the value of the name property
	public String getName(){
		
		//returns the value of the name property
		return name;
	}
	
	//method to set a value to the type property 
	public void setType(String newType){
	
		//assigns the value of newType to the type property
		this.type = newType;
	}
	
	//method to return the value of the type property
	public String getType(){
		
		//returns the value of the type property
		return type;
	}
	
	//method to set a value to the price property
	public void setPrice(int newPrice){
	
		//assigns the value of newPrice to the price property
		this.price = newPrice;
	}
	
	//method to return the value of the price property
	public int getPrice(){
		
		//returns the value of the price property
		return price;
	}
	
	//method to set a value to the romancePoints property
	public void setRomancePoints(int newPoints){
	
		//assigns the value of newPoints to the romancePoints property
		this.romancePoints = newPoints;
	}
	
	//method to return the value of the romancePoints property
	public int getRomancePoints(){
		
		//returns the value of the romancePoints property
		return romancePoints;
	}
	
	//method to add together in a string to display the information to user
	public String toString(){
		return "Gift:" + this.name + " Type:" + this.type + "\n"
				   + " Price: " + this.price + " dollars Romance Points:" + this.romancePoints;
	}
}
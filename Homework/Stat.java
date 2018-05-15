/*
	Text Adventure:	Kathy
	Author:			Giovanni Pernudi
*/

public class Stat{

	//Stats has 2 class members
	private String name;
	private int value;
	
	//Gift has 1 default constructor
	public Stat(){
		
		//assigns the indicated string to the name property
		this.name = "someGift";

		//assigns a value to the value property
		this.value = 0;
	}
	
	//Gift has 1 implicit constructor
	public Stat(String someName, int someValue){
	
		//assigns the value of someName to the name property
		this.name = someName;
		
		//assigns the value of someValue to the  value property
		this.value = someValue;
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
	
	//method to set a value to the value property
	public void setValue(int newPoints){
	
		//assigns the value of newPoints to the value property
		this.value = newPoints;
	}
	
	//method to return the value of the Value property
	public int getValue(){
		
		//returns the value of the Value property
		return value;
	}
	
	//method to add together in a string to display the information to user
	public String toString(){
		return this.name + ": " + this.value;
	}
}
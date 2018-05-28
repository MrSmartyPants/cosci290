/*
	Text Adventure:	Kathy
	Author:			Giovanni Pernudi
*/

public class Kathy{

	//Stats has 2 class members
	private String name;
	private String information;
	
	//Gift has 1 default constructor
	public Kathy(){
		
		//assigns the indicated string to the name property
		this.name = "Some Information";

		//assigns a value to the value property
		this.information = "Unknown";
	}
	
	//Gift has 1 implicit constructor
	public Kathy(String someName, String someInformation){
	
		//assigns the value of someName to the name property
		this.name = someName;
		
		//assigns the value of someValue to the  value property
		this.information = someInformation;
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
	public void setInformation(String newInformation){
	
		//assigns the value of newPoints to the value property
		this.information = newInformation;
	}
	
	//method to return the value of the Value property
	public String getInformation(){
		
		//returns the value of the Value property
		return information;
	}
	
	//method to add together in a string to display the information to user
	public String toString(){
		return this.name + ": " + this.information;
	}
}
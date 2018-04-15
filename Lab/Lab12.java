/*
	Giovanni Pernudi
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	        *
	      * * * 
	    * * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
	    * * * * *
	      * * *
	        *
					
					
 * * * * *
		   * * * * 
	  	   * * * 
	      	 * * 
	      	   *
	4. Fix the indentation of the code. 
	Note:
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

public class Lab12 {
	
	//entry-point of the application. 
	public static void main(String[] args) {
		//create a for-loop for the amount of lines required for the output. 
		for(int i = 1; i <= 5; i++) {
			//create a nested for-loop for the amount of spaces required before each line.
			//the first iteration reqires 4 spaces, initalize the varaible to 1 so the loop,
			//can iterate 4 times, leaving a space for each loop. Increasing the condition amount
			//by one after every iteration to display less spaces. 
			for(int j = i; j < 5; j++) {
				System.out.print(" ");
				}
			
			//create another for loop, to print out the stars. 
			//iterate through the loop once for the first set to display the
			//required output. Increasing by 2 by multiply the condition by 2 and
			//only increasing the other varaible by one.
			for(int k = 1; k < (i * 2); k++) {
				System.out.print("*");
				}
		//print out a new line for the bottom part of the output.
		System.out.println();
		}
		
	//create for-loops for the bottom portion for the output.
	//this time, the pattern is in decreasing order to take away 
	//the output for the required output. 
	for(int i = 4; i >= 1; i--) {
		for(int j = 5; j > i; j--) {
		System.out.print(" ");
	}
	
	for(int k = 1; k < (i * 2); k++) {
		System.out.print("*");
	}
		System.out.println();
	}
	
		
	System.out.println("\n");
	//method call to print another traingle. 
	printTriangle();
	
}

	//this method returns the 2nd triangle required for the output.
	public static void printTriangle() {
		for(int i = 5; i >= 1; i--) {
			for(int j = 6; j > i; j /= 2) {
				System.out.print(" ");
			}
			
			for(int k = 1; k < (i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
}
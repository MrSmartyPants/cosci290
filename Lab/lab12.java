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

public class lab12 {
	
	//entry-point of the application. 
	public static void main(String[] args) {
		int i = 1, j = 1, k = 0;
		
		for(i = 1; i <= 5; i++) {
			for(j = i; j < 5; j++) {
				System.out.print(" ");
				}
			
			for(k = 1; k < (i * 2); k++) {
				System.out.print("*");
				}
		System.out.println();
		}
		
	for(i = 4; i >= 1; i--) {
		for(j = 5; j > i; j--) {
		System.out.print(" ");
	}
	
	for(k = 1; k < (i * 2); k++) {
		System.out.print("*");
	}
		System.out.println();
	}
	
	System.out.println("\n\n");
	printTriangle();
	
}



	public static void printTriangle() {
		for(int i = 5; i >= 1; i--) {
			for(int j = 5; j > i * 2; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k < (i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
}
//1) Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the                resultant value by 5. Display the final result.(Using Assignment Operators)

package krish;

public class maths {
	
	    public static void main(String[] args) {
	        int number = 2345;

	        
	        number += 8;

	        number /= 3;

	     
	        number %= 5;

	        number *= 5;

	  
	        System.out.println("The final result is: " + number);
	    }
	}


//6.Write a program to check whether a year is leap year or not?
package krish;

import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter any year :");
		
		long year=sc.nextLong();
		
		 if(year%4==0) 
			    {  
			 System.out.println(" is a leap year");  
	    } else {  
	    	System.out.println("is not a leap year");  
	    }  
	}

}

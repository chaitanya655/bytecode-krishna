//9.Write a program to input any character and check whether it is alphabet, digit or special character?
package krish;
import java.util.Scanner;
public class checking {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a character: ");
	        char inputCharacter = scanner.next().charAt(0);

	        if ((inputCharacter >= 'a' && inputCharacter <= 'z') || (inputCharacter >= 'A' && inputCharacter <= 'Z')) {
	            System.out.println("The character is an alphabet.");
	        }

	      
	        else if (inputCharacter >= '0' && inputCharacter <= '9') {
	            System.out.println("The character is a digit.");
	        }

	        
	        else {
	            System.out.println("The character is a special chaaracter.");
	        }
	    }
	}
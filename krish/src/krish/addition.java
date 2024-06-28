//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
package krish;

public class addition {

	public static void main(String[] args) {
		
       int a= 8;
       int b=2345;
       int c=3;
       int d=5;
       int sol = ((((a+b)/c)%d)*d);
       System.out.println("sol is ;"+sol);
       
	}

}

//5.Write a program to check whether a number is even or odd?
package krish;
import java.util.Scanner;
public class evenorodd {

	public static void main(String[] args) {
	
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter any number :");
		
		int num= sc.nextInt();
		if(num/2==0)
		{
			System.out.println("even");
		}
		else{
			System.out.println("ODD");
			}
		}

}

//Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.
package krish;

public class rectangle 
{
public static void main(String args[]) {
	int length=5;
	int breath=7;
	int area = length*breath;
	int perimeter = 2*(length+breath);
	
	System.out.println("area of rectangle is :"+ area);
	System.out.println("perimeter of the rectagle is :"+ perimeter);

}
}

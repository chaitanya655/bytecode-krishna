//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.
package krish;

public class percentage {

	public static void main(String[] args) {
		int sub1 = 78;
		int sub2 = 45;
		int sub3 = 62;
		float percentage;
		int totalmarks=300;
		
		
        float scored = sub1+sub2+sub3;
	
	System.out.println("total marks of robert :"+scored);


	percentage = (float)((scored / totalmarks) * 100);
    System.out.println("Percentage ::"+ percentage);
        
	}

}


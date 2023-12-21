/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Put your code here	
	    int sideNum1 = Integer.parseInt(args[0]);
		int sideNum2 = Integer.parseInt(args[1]);
		int sideNum3 = Integer.parseInt(args[2]);
		boolean triangleCreation = false;
		
		if (((sideNum1 + sideNum2) >= sideNum3) 
			&& ((sideNum1 + sideNum3) >= sideNum2) 
		    && ((sideNum2 + sideNum3) >= sideNum1)) {
			triangleCreation = true;
		} 
		System.out.println(sideNum1 + ", " + sideNum2 + ", " + sideNum3 + ": " + triangleCreation);
	}
}
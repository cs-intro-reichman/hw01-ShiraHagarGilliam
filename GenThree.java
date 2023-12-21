/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
		int firstArg = Integer.parseInt(args[0]);
		int SecondArg = Integer.parseInt(args[1]);
		int biggerArg = (int)(Math.max(firstArg,SecondArg));
		int smallerArg = (int)(Math.min(firstArg,SecondArg));
		int range = (biggerArg - smallerArg);
		int randomNum1 = (int)((range * Math.random()) + smallerArg);
		int randomNum2 = (int)((range * Math.random()) + smallerArg);
		int randomNum3 = (int)((range * Math.random()) + smallerArg);
		int minimalGenerated = Math.min(randomNum1, randomNum2);
		minimalGenerated = Math.min(minimalGenerated, randomNum3);
		
		System.out.println(randomNum1);
		System.out.println(randomNum2);
	    System.out.println(randomNum3); 
		System.out.println("The minimal generated number was " + minimalGenerated); 
	}
}
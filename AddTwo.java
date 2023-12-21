/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		
		// Put your code here
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int sum = (firstNum + secondNum);
		System.out.println(firstNum + " + " + secondNum + " = " + sum);
	}
}

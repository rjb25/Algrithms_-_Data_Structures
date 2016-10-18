
/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/blob/master/Depth.java
 * COSC 311
 * HW 10/12
 * FALL 2016
 */
import java.util.Stack;

public class Depth {
	public static void main(String[] args) {
		String test = "(((((()()())))))";
		// Outputs 6
		System.out.println("Max depth of test string is " + depth(test));
	}

	public static int depth(String parenthesis) {
		Stack<Character> stack = new Stack<Character>();
		int depthMax = 0;
		int depthCurrent = 0;

		for (int i = 0; i < parenthesis.length(); i++) {
			stack.push(parenthesis.charAt(parenthesis.length() - i - 1));
		}
		for (int i = 0; i < parenthesis.length(); i++) {
			char popped = stack.pop();
			if (popped == '(') {
				depthCurrent++;
			}
			if (popped == ')') {
				depthCurrent--;
			}
			if (depthCurrent > depthMax) {
				depthMax = depthCurrent;
			}
		}
		if (depthCurrent != 0) {
			return -1;
		} else {
			return depthMax;
		}
	}
}

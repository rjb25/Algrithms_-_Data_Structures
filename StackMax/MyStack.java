
/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/blob/master/Stack.java
 * COSC 311
 * HW 10/10
 * FALL 2016
 */

public class MyStack {
	private int[] stack = new int[25];
	private int top = 0;
	private int[] max = new int[25];

	public void push(int addTop) {
		stack[top] = addTop;
		if (top == 0 || addTop > max[top - 1]) {
			max[top] = addTop;
		} else {
			max[top] = max[top - 1];
		}
		top++;
	}

	public int pop() {
		int popped = stack[top - 1];
		top--;
		return popped;
	}

	public int peek() {
		return stack[top - 1];
	}

	public int max() {
		return max[top - 1];
	}
}

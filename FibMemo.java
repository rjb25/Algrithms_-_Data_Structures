/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/blob/master/FibMemo.java
 * COSC 311
 * HW 10/17
 * FALL 2016
 */

public class FibMemo {
	private static int[] fibPrev;
	public static void main(String[] args) {
		System.out.println(fibMemo(7));
	}

	public static int fibMemo(int n) {
		fibPrev = new int[n + 1];
		for (int i = 0; i < fibPrev.length; i++) {
			fibPrev[i] = -1;
		}
		return fib(n);
	}

	public static int fib(int n){
		if (fibPrev[n] != -1) {
			System.out.println("skipping");
			return fibPrev[n];
		}
		if (n == 0) {
			System.out.println("new " + n);
			fibPrev[n] = 0;
			return fibPrev[n];
		}
		if (n <= 2) {
			System.out.println("new " + n);
			fibPrev[n] = 1;
			return fibPrev[n];
		}
		fibPrev[n] = fib(n - 1) + fib(n - 2);
			System.out.println("new " + n);
		return fibPrev[n];
		}
}

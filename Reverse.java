/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/blob/master/Reverse.java
 * COSC 311
 * HW 09/24
 * FALL 2016
 */

public class Reverse {
	public static void main(String[] args) {
		int[] values = {1,2,3,4,5,6,7};

		for (int i = 0; i < (values.length / 2); i++) {
			int tmp = values[i];
			values[i] = values[values.length-i-1];
			values[values.length-i-1] = tmp;
		}

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

	}
}

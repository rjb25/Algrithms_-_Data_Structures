//http://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
//http://stackoverflow.com/questions/6443176/how-can-i-generate-a-random-number-within-a-range-but-exclude-some
/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/random.java
 * COSC 311
 * HW 09/14
 * FALL 2016
 */
import java.util.*;

public class RandomData {
	public static void main(String[] args) {
		Random random = new Random();
		int[] values = new int[10];
		int[] taken = new int[values.length];
		int take = 3;

		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}

		for (int i = 0; i < taken.length; i++) {
			taken[i] = values.length;
		}

		for (int i = 0; i < take; i++) {
			int randNum = random.nextInt(values.length - i);
				for (int j = 0; j < taken.length; j++) {
					if (randNum >= taken[j]) {
						randNum++;
					}
				}
			taken[randNum] = randNum;
		}

		for (int i = 0; i < taken.length; i++) {
			if(taken[i] != taken.length){
			System.out.println(taken[i]);
			}
		}
	}
}

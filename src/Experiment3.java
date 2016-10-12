import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Experiment3 {
	public static void testSwapAlgorithm() {
		// This stress test fixed an issue where the first call to the function
		// was inexplicably slow
		for (int i = 1; i <= 10; i++) {
			algorithm(5000, 5000, "stress");
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		System.out.println("Algorithm/Experiment 3: Swap end value with taken value and decrease length.");
		System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
		System.out.println("n | k | time in miliseconds");

		System.out.println("Varying n");

		for (int i = 0; i < 10; i++) {
			algorithm(10000 + (i * 10000), 10000, "time");
		}
		System.out.println();
		System.out.println("Varying k");

		for (int i = 1; i <= 10; i++) {
			algorithm(10000000, (i * 1000000), "time");
		}
		System.out.println();

		System.out.println("Sanity check");
		for (int i = 0; i < 5; i++) {
			algorithm(10, 5, "sanity");
		}
		System.out.println();
	}

	private static void algorithm(int n, int k, String mode) {
		Random random = new Random();
		int[] values = new int[n];
		int take = k;
		int[] taken = new int[take];

		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
		long startTime = System.nanoTime();
		for (int i = 0; i < take; i++) {
			int randNum = random.nextInt(values.length - i);
			taken[i] = values[randNum];
			values[randNum] = values[values.length - i - 1];
		}
		long endTime = System.nanoTime();

		long durationNano = endTime - startTime;
		double durationMilliseconds = durationNano / (Math.pow(10, 6));
		if (mode == "sanity") {
			for (int i = 0; i < taken.length; i++) {
				System.out.print(taken[i] + " ");
			}
			System.out.println();
		} else if (mode == "stress") {
		} else {
			System.out.println(n + " | " + k + " | " + Double.toString(durationMilliseconds));
		}
	}
}
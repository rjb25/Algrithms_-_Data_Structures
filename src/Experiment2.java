import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Experiment2 {
	public static void testMarkAlgorithm() {
		// This stress test fixed an issue where the first call to the function
		// was inexplicably slow
		for (int i = 0; i < 5; i++) {
			algorithm(10, 5, "stress");
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Algorithm/Experiment 2: If a value have been selected before retry selection");
		System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
		System.out.println("n | k | time in milliseconds");

		System.out.println("Varying n");

		for (int i = 0; i < 15; i++) {
			algorithm(100000 + (i * 5), 100000, "time");
		}
		System.out.println();
		System.out.println("Varying k");

		for (int i = 1; i <= 20; i++) {
			algorithm(10000000, 9500000 + (i * 25000), "time");
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
		int[] taken = new int[k];
		boolean[] used = new boolean[values.length];

		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}

		long startTime = System.nanoTime();

		int selected = 0;
		while (selected < k) {
			int randNum = random.nextInt(values.length);
			if (!used[randNum]) {
				taken[selected] = values[randNum];
				used[randNum] = true;
				selected++;
			}
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

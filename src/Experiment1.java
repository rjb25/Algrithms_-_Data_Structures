import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Experiment1 {
	public static void testRedoAlgorithm() {
		// This stress test fixed an issue where the first call to the function
		// was inexplicably slow
		for (int i = 0; i < 5; i++) {
			algorithm(10, 5, "stress");
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Algorithm/Experiment 1: Choose k values. Repeat until all values are unique");
		System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
		System.out.println("n | k | time in milliseconds");
		System.out.println("Varying n");

		for (int i = 0; i < 20; i++) {
			algorithm(500 + (i * 10), 120, "time");
		}
		System.out.println();
		System.out.println("Varying k");

		for (int i = 1; i <= 20; i++) {
			algorithm(250, 65 + (i * 1), "time");
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
		Integer[] taken = new Integer[k];

		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
		long startTime = System.nanoTime();
		do {
			for (int i = 0; i < k; i++) {
				int randNum = random.nextInt(values.length);
				taken[i] = values[randNum];
			}
		} while (!unique(taken));
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

	private static boolean unique(Integer[] x) {
		return new HashSet<Integer>(Arrays.asList(x)).size() == x.length;
	}
}

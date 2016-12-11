public class MergeSorter {
	String[] names;
	private int calls = 0;
	private int length;
	String[] tempNames;

	public MergeSorter(String[] names) {
		calls = 0;
		length = names.length;
		this.names = names;
		tempNames = new String[length];
		MergeSort(0, length - 1);
	}

	public void MergeSort(int start, int end) {
		calls++;
		int split = start + (end - start) / 2;
		if (start < end) {
			MergeSort(start, split);
			MergeSort(split + 1, end);
			combine(start, split, end);
		}
	}

	public void combine(int lowerBound, int split, int higherBound) {
		int lowerIndex = lowerBound;
		int higherIndex = split + 1;
		int tempIndex = lowerBound;
		while (lowerIndex <= split && higherIndex <= higherBound) {
			if (names[lowerIndex].compareTo(names[higherIndex]) < 0) {
				tempNames[tempIndex] = names[lowerIndex];
				lowerIndex++;
			} else {
				tempNames[tempIndex] = names[higherIndex];
				higherIndex++;
			}
			tempIndex++;
		}
		while (higherIndex <= higherBound) {
			tempNames[tempIndex] = names[higherIndex];
			higherIndex++;
			tempIndex++;
		}
		while (lowerIndex <= split) {
			tempNames[tempIndex] = names[lowerIndex];
			lowerIndex++;
			tempIndex++;
		}
		applyTemp(lowerBound, higherBound);
	}

	public void applyTemp(int from, int to) {
		for (int i = from; i <= to; i++) {
			names[i] = tempNames[i];
		}
	}

	public void printCalls() {
		System.out.println(calls + " Calls were made to MergeSort");
	}

	public String toString() {
		String list = "";
		for (int i = 0; i < names.length; i++) {
			list += names[i] + "\n";
		}
		return list;
	}
}

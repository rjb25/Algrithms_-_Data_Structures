//Implementation concept, and a few details gathered from http://www.java2novice.com/java-sorting-algorithms/merge-sort/
/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/tree/master/MergeSort
 * COSC 311
 * HW 12/12
 * FALL 2016
 */
public class MergeSortDriver {
	public static void main(String[] args) {
		String[] names = { "ikeji", "bahorski", "chaudhuri", "evett", "haynes", "maniccam", "moore", "narayanan",
				"panja", "poh", "sverdlik", "tehranipour", "zeiger", "zhang", "cowan", "francis", "mansour" };
		MergeSorter sorter = new MergeSorter(names);
		System.out.println(sorter);
		sorter.printCalls();
	}
}

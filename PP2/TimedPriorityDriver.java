/*
 * http://stackoverflow.com/questions/9437594/randomly-generated-numbers-in-a-basic-array 
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/tree/master/PP2
 * COSC 311
 * PP2 12/5
 * FALL 2016
 */

import java.util.Random;
public class TimedPriorityDriver {
	public static void main(String[] args) {
		runRand(250);
		runRand(500);
		runRand(1000);
		runRand(2500);
		runRand(5000);
		runRand(10000);
		runRand(15000);
		runRand(20000);
		runRand(25000);
		runRand(30000);
	}
	public static void runRand(int length){
		PriorityQueue queue = new PriorityQueue(length);
		Random rand = new Random();
		int[] arr = new int[length];
		for(int i = 0; i < length; ++i) {
		    arr[i] = rand.nextInt(length);
		}
		runData(queue, arr);
		System.out.println("Length: " + length + "    Max age: " + queue.maxAgeRemoved);
		
	}
	public static void runData(PriorityQueue queueToRun, int[] data) {
		for(int i = 0; i < data.length; i++){
			queueToRun.insert(data[i]);
		}
		for(int i = 0; i < data.length; i++){
			queueToRun.delete();
		}
	}
}
/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/tree/master/Priority
 * COSC 311
 * HW 1121
 * FALL 2016
 */
public class TimedPriorityDriver {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue(20);
		queue.insert(1);
		queue.insert(7);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.delete();
		queue.delete();
		queue.delete();
		queue.delete();
		queue.delete();
		queue.delete();
		queue.delete();
		queue.delete();
		queue.delete();
	}
}
/*
 * COMMENTS This was an approach at being moderately functional in java. Hence
 * my passing of the queue instead of just using this.priorityQueue in the
 * PriorityQueue class. One exception being the exists function. Also I do not
 * think the provided delete order timestamps in the assignment are correct. The
 * order should be 0 4 2 1 3 not 0 2 4 1 3
 */

/*
 * OUTPUT Inserted: [pri 1 ts 0] Contains Root->leaf:[pri 1 ts 0]
 * 
 * Inserted: [pri 7 ts 1] Contains Root->leaf:[pri 1 ts 0][pri 7 ts 1]
 * 
 * Inserted: [pri 3 ts 2] Contains Root->leaf:[pri 1 ts 0][pri 7 ts 1][pri 3 ts
 * 2]
 * 
 * Inserted: [pri 4 ts 3] Contains Root->leaf:[pri 1 ts 0][pri 4 ts 3][pri 3 ts
 * 2][pri 7 ts 1]
 * 
 * Inserted: [pri 5 ts 4] Contains Root->leaf:[pri 1 ts 0][pri 4 ts 3][pri 3 ts
 * 2][pri 7 ts 1][pri 5 ts 4]
 * 
 * Inserted: [pri 6 ts 5] Contains Root->leaf:[pri 1 ts 0][pri 4 ts 3][pri 3 ts
 * 2][pri 7 ts 1][pri 5 ts 4][pri 6 ts 5]
 * 
 * Inserted: [pri 1 ts 6] Contains Root->leaf:[pri 1 ts 0][pri 4 ts 3][pri 1 ts
 * 6][pri 7 ts 1][pri 5 ts 4][pri 6 ts 5][pri 3 ts 2]
 * 
 * Inserted: [pri 2 ts 7] Contains Root->leaf:[pri 1 ts 0][pri 2 ts 7][pri 1 ts
 * 6][pri 4 ts 3][pri 5 ts 4][pri 6 ts 5][pri 3 ts 2][pri 7 ts 1]
 * 
 * Inserted: [pri 3 ts 8] Contains Root->leaf:[pri 1 ts 0][pri 2 ts 7][pri 1 ts
 * 6][pri 3 ts 8][pri 5 ts 4][pri 6 ts 5][pri 3 ts 2][pri 7 ts 1][pri 4 ts 3]
 * 
 * Deleted: [pri 1 ts 0] Current max age removed: 9 Which is [pri 1 ts 0]
 * Contains Root->leaf:[pri 1 ts 6][pri 2 ts 7][pri 3 ts 2][pri 3 ts 8][pri 5 ts
 * 4][pri 6 ts 5][pri 4 ts 3][pri 7 ts 1]
 * 
 * Deleted: [pri 1 ts 6] Current max age removed: 9 Which is [pri 1 ts 0]
 * Contains Root->leaf:[pri 2 ts 7][pri 3 ts 8][pri 3 ts 2][pri 7 ts 1][pri 5 ts
 * 4][pri 6 ts 5][pri 4 ts 3]
 * 
 * Deleted: [pri 2 ts 7] Current max age removed: 9 Which is [pri 1 ts 0]
 * Contains Root->leaf:[pri 3 ts 8][pri 4 ts 3][pri 3 ts 2][pri 7 ts 1][pri 5 ts
 * 4][pri 6 ts 5]
 * 
 * Deleted: [pri 3 ts 8] Current max age removed: 9 Which is [pri 1 ts 0]
 * Contains Root->leaf:[pri 3 ts 2][pri 4 ts 3][pri 6 ts 5][pri 7 ts 1][pri 5 ts
 * 4]
 * 
 * Deleted: [pri 3 ts 2] Current max age removed: 11 Which is [pri 3 ts 2]
 * Contains Root->leaf:[pri 4 ts 3][pri 5 ts 4][pri 6 ts 5][pri 7 ts 1]
 * 
 * Deleted: [pri 4 ts 3] Current max age removed: 11 Which is [pri 3 ts 2]
 * Contains Root->leaf:[pri 5 ts 4][pri 7 ts 1][pri 6 ts 5]
 * 
 * Deleted: [pri 5 ts 4] Current max age removed: 11 Which is [pri 3 ts 2]
 * Contains Root->leaf:[pri 6 ts 5][pri 7 ts 1]
 * 
 * Deleted: [pri 6 ts 5] Current max age removed: 11 Which is [pri 3 ts 2]
 * Contains Root->leaf:[pri 7 ts 1]
 * 
 * Deleted: [pri 7 ts 1] Current max age removed: 16 Which is [pri 7 ts 1]
 * Contains Root->leaf:
 * 
 */

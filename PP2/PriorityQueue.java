
public class PriorityQueue {
	TimedPriority[] priorityQueue;
	// NOTE end represents the index ready for insert, not the last item index
	int end;
	int time;
	int maxLength;
	int maxAgeRemoved = 0;
	TimedPriority oldestTaken = new TimedPriority(-1, -1);

	public PriorityQueue(int length) {
		this.priorityQueue = new TimedPriority[length];
		this.end = 0;
		this.time = 0;
		this.maxLength = length;
	}

	public void insert(int priority) {
		if (this.end < this.maxLength) {
			TimedPriority newItem = new TimedPriority(priority, this.time);
			this.priorityQueue[this.end] = newItem;
			++this.end;
			this.priorityQueue = reprioritizeUp(this.priorityQueue, this.end - 1);
			this.time++;
		} else {
			System.out.println("No room to insert");
		}
	}

	public void delete() {
		int ageToDelete = this.time - this.priorityQueue[0].timestamp;
		if (ageToDelete > maxAgeRemoved) {
			this.oldestTaken = this.priorityQueue[0];
			this.maxAgeRemoved = Math.max(ageToDelete, maxAgeRemoved);
		}
		if (this.end > 0) {
			this.priorityQueue[0] = this.priorityQueue[this.end - 1];
			--this.end;
			this.priorityQueue = reprioritizeDown(this.priorityQueue, 0);
			this.time++;
		} else {
			System.out.println("No items to delete");
		}
	}

	private TimedPriority[] reprioritizeUp(TimedPriority[] queue, int child) {
		int parent = ((child + 1) / 2) - 1;
		if (exists(parent) && higherPri(queue, parent, child) != parent) {
			return reprioritizeUp(swap(queue, child, parent), parent);
		} else {
			return queue;
		}
	}

	private TimedPriority[] reprioritizeDown(TimedPriority[] queue, int parent) {
		// The odd +1 -1 and swap of second and first here is to fix the 0*2
		// issue
		int second = ((parent + 1) * 2);
		int first = second - 1;
		int childToSwap = getChildToSwap(queue, parent, first, second);
		if (childToSwap != parent) {
			return reprioritizeDown(swap(queue, parent, childToSwap), childToSwap);
		} else {
			return queue;
		}
	}

	private int higherPri(TimedPriority[] queue, int item1, int item2) {
		// if equal defaults to first/left
		int item1Pri = validPriority(queue, item1);
		int item2Pri = validPriority(queue, item2);
		if (item2Pri < item1Pri && item2Pri != -1) {
			return item2;
		}
		return item1;
	}

	private int getChildToSwap(TimedPriority[] queue, int parent, int first, int second) {
		return higherPri(queue, parent, higherPri(queue, first, second));
	}

	private boolean exists(int item) {
		if (item < this.end && item >= 0) {
			return true;
		} else {
			return false;
		}
	}

	private int validPriority(TimedPriority[] queue, int item) {
		if (exists(item)) {
			return queue[item].priority;
		} else {
			return -1;
		}
	}

	private TimedPriority[] swap(TimedPriority[] queue, int item1, int item2) {
		TimedPriority temp = queue[item1];
		queue[item1] = queue[item2];
		queue[item2] = temp;
		return queue;
	}

	public String toString() {
		String content = "";
		int levelEnd = 1;
		int levelLength = 1;
		for (int i = 0; i < this.end; i++) {
			if (i == levelEnd) {
				content += "\n";
				levelLength *= 2;
				levelEnd += levelLength;
			}
			TimedPriority item = this.priorityQueue[i];
			content += item;
		}
		return content + "\n";
	}
}

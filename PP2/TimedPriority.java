
public class TimedPriority {
	int priority;
	int timestamp;

	public TimedPriority(int priority, int timestamp) {
		this.priority = priority;
		this.timestamp = timestamp;
	}

	public String toString() {
		return "[pri " + this.priority + " ts " + this.timestamp + "]";
	}
}

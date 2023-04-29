package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("apple");
		pq.add("banana");
		pq.add("custardApple");
		// pq.clear();
		// pq.element()
		// pq.peek()
		// pq.remove()
		// pq.poll()

		System.out.println(pq);
	}

}

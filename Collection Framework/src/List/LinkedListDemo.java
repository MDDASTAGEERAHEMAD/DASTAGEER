package List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Object> ll = new LinkedList<Object>();

		ll.add(10);
		ll.add(12.5);
		ll.add('A');
		ll.add('A');
		ll.add("Nisar");
		ll.add(null);
		ll.add(3, 100);

		for (Object o : ll) {
			System.out.println(o);
		}
	}
}

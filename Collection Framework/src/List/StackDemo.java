package List;

import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);

		s.pop();

		ListIterator<Integer> litr = s.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("--------------------------------------");
		int peek = s.peek();
		System.out.println(peek);

		System.out.println(s.search(1));

	}

}

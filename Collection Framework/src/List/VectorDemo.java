package List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>(20);

		v.addElement(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);

		System.out.println("Capacity: " + v.capacity());

		Enumeration<Integer> e = v.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}

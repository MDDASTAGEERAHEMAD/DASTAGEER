package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> al1 = new ArrayList<Object>();

		al1.add(20);
		al1.add('A');
		al1.add("Nisar Ahmed");
		al1.add(10);
		al1.add(null);

		ArrayList<Object> al = new ArrayList<Object>();

		al.add(10);
		al.addAll(al1);
		// al.remove(2);
		// al.removeAll(al1);
		// boolean flag1 =al.contains("Nisar Ahmed");
		// boolean flag2 =al.containsAll(al1);
		// al.isEmpty()
		// al.size();
		// al.clear();

		System.out.println(al);

		System.out.println("--------------------------------------");

		Iterator<Object> itr = al.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}

	}

}

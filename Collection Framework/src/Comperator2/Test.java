package Comperator2;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		TreeSet<Car> t = new TreeSet<Car>(new MyComperator());

		Car c1 = new Car(500, "Audi");
		Car c2 = new Car(300, "Cheverolet");
		Car c3 = new Car(200, "Bmw");

		t.add(c1);
		t.add(c2);
		t.add(c3);

		for (Object o : t) {
			System.out.println(o);
		}
	}

}

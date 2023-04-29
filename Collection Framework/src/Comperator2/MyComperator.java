package Comperator2;

import java.util.Comparator;

public class MyComperator implements Comparator<Car> {

	@Override
	public int compare(Car x, Car y) {

		Integer i1 = (Integer) x.cost;
		Integer i2 = (Integer) y.cost;

		return i1.compareTo(i2);
	}

}

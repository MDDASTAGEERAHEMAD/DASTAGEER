package Comperator;

import java.util.*;

// How to compare Predefined comparable class objects using?(Here we have taken StringBuffer)
public class MyComperator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();

		Integer l1 = s1.length();
		Integer l2 = s1.length();

		if (l1 > l2)
			return 1;
		else if (l1 < l2)
			return -1;
		else
			return s1.compareTo(s2);
	}

}

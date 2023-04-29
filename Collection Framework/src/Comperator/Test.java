package Comperator;

import java.util.*;

public class Test {

	public static void main(String[] srgs) {

		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyComperator());
		t.add(new StringBuffer("Nisar"));
		t.add(new StringBuffer("Tauseef"));
		t.add(new StringBuffer("Saqib"));
		t.add(new StringBuffer("AAA"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Hey"));

		for (StringBuffer s : t) {
			System.out.println(s);
		}

	}

}

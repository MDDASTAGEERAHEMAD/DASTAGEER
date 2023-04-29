package Comparable;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student(24, "Nisar");
		Student s2 = new Student(22, "Saqib");
		Student s3 = new Student(23, "Tuseef");

		TreeSet<Student> ts = new TreeSet<Student>();

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);

		for (Student s : ts) {
			System.out.println(s);
		}

	}

}

package Comparable;

public class Student implements Comparable<Student> {

	int age;
	String name;

	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {

		return name + "-" + age;
	}

	public int compareTo(Student s) {
		String i1 = this.name;
		String i2 = s.name;

		return i1.compareTo(i2);

		/*
		 * if(i1<i2) return -1; else if(i1>i2) return 1; else return 0;
		 */

	}

}

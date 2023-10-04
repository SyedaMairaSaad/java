package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Student implements Comparable<Student> {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name:" + this.name + ", age:" + age;

	}

	@Override
	public int compareTo(Student that) {
		if (this.age > that.age)
			return 1;
		else
			return -1;
	}
}

public class ComparatorAndComparable {

	public static void main(String[] arg) {
		Comparator<Student> com = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.age > o2.age)
					return 1;
				else
					return -1;
			}

		};
		List<Student> stds = new ArrayList<Student>();
		stds.add(new Student("Ali", 12));
		stds.add(new Student("Sara", 9));
		stds.add(new Student("Saad", 7));
		stds.add(new Student("Manar", 10));
		stds.add(new Student("Momal", 6));

		stds.sort(com);
		for (Student s : stds) {
			System.out.println(s.toString());
		}

	}

}

package com.ds;

public class ODArray {

	public static void main(String[] args) {
		int array[] = new int[5];
		array[0] = 30;
		array[1] = 25;
		array[2] = 100;
		array[3] = 64;
		array[4] = 17;
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// array of objects (Student class)
		Student[] students = new Student[5];
		students[0] = new Student("diana", 22);
		students[1] = new Student("hugo", 22);
		students[2] = new Student("nuria", 23);
		students[3] = new Student("stannis", 50);
		students[4] = new Student("laura", 26);
		//for(int i = 0; i < students.length; i++)
			//System.out.println("Name: " + students[i].name
				//	+ "Age: " + students[i].age);
		//}
		for(Student student: students) {
			System.out.println("Name: " + student.name
					+ "," + "Age: " +  student.age);
		}
	}
}

package collections;

import java.util.HashMap;

public class Task_06_Hometask_Optional_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, Employee> employeeMap = new HashMap<>();

		Employee emp1 = new Employee(1, "Jay");
		Employee emp2 = new Employee(2, "Tushar");
		Employee emp3 = new Employee(3, "Okesh");

		employeeMap.put(emp1.getId(), emp1);
		employeeMap.put(emp2.getId(), emp2);
		employeeMap.put(emp3.getId(), emp3);

		System.out.println("Employees in the HashMap:");
		for (Employee employee : employeeMap.values()) {
			System.out.println(employee);
		}

		int empIdToFind = 1;
		Employee foundEmployee = employeeMap.get(empIdToFind);
		if (foundEmployee != null) {
			System.out.println("Employee with ID " + empIdToFind + " found: " + foundEmployee.getName());
		} else {
			System.out.println("Employee with ID " + empIdToFind + " not found.");
		}

		HashMap<Integer, Student> studentMap = new HashMap<>();

		Student student1 = new Student(1, "Jay");
		Student student2 = new Student(2, "Tushar");
		Student student3 = new Student(3, "Okesh");

		studentMap.put(student1.getId(), student1);
		studentMap.put(student2.getId(), student2);
		studentMap.put(student3.getId(), student3);

		System.out.println("\nStudents in the HashMap:");
		for (Student student : studentMap.values()) {
			System.out.println(student);
		}

		int studentIdToFind = 2;
		Student foundStudent = studentMap.get(studentIdToFind);
		if (foundStudent != null) {
			System.out.println("Student with ID " + studentIdToFind + " found: " + foundStudent.getName());
		} else {
			System.out.println("Student with ID " + studentIdToFind + " not found.");
		}

	}

}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}

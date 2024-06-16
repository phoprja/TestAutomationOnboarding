package java8;

import java.util.function.Function;

class Employee {
	private String name;
	private String account;
	private double salary;

	public Employee(String name, String account, double salary) {
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getAccount() {
		return account;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", account='" + account + '\'' + ", salary=" + salary + '}';
	}
}

public class Task_07_Hometask_ConstructorReference {

	public static void main(String[] args) {
		Function<String, Employee> createEmployee = Task_07_Hometask_ConstructorReference::createEmployee;
		Employee emp1 = createEmployee.apply("Jay Phopre,HDFC,10000");
		Employee emp2 = createEmployee.apply("Shru,Axis,20000");
		Employee emp3 = createEmployee.apply("Tushar,ICICI,35000");
		Employee emp4 = createEmployee.apply("Okesh,Citi,45000");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
	}

	private static Employee createEmployee(String details) {
		String[] parts = details.split(",");
		String name = parts[0];
		String account = parts[1];
		double salary = Double.parseDouble(parts[2]);
		return new Employee(name, account, salary);
	}

}

package java8;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Task_01_Hometask_Lambda_Expressions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1. Check if a given string is a palindrome
//		System.out.println("Enter a string to check if its palindrome (Without Lambda Expression)");
		System.out.println("(Without Lambda Expression)");
//		String str1 = scanner.nextLine().trim();
		String str1 = "civic";
		System.out.println("Is \"" + str1 + "\" a palindrome? " + isPalindrome(str1));

		System.out.println("\n(With Lambda Expression)");
//		String str2 = scanner.nextLine().trim();
		String str2 = "civil";
		System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindromeUsingLambdaExpression(str2));

		// 2. Find the 2nd biggest number in the given list of numbers
		List<Integer> numbers1 = Arrays.asList(5, 8, 2, 10, 7);
		int secondLargest1 = findSecondLargest(numbers1);
		System.out.println("\nWithout Lambda Expression: The second largest number is: " + secondLargest1);

		List<Integer> numbers2 = Arrays.asList(52, 81, 23, 106, 71);
		int secondLargest2 = findSecondLargestUsingLambdaExpression(numbers2);
		System.out.println("\nWith Lambda Expression: The second largest number is: " + secondLargest2);

		// 3. write a program to check if two strings are rotations of each other
		System.out.println("\n(Without Lambda Expression)");
//		String string1 = scanner.nextLine().trim();
//		String string2 = scanner.nextLine().trim();
		String string1 = "hello";
		String string2 = "llohe";
		boolean areRotations = areRotations(string1, string2);
		if (areRotations) {
			System.out.println(string1 + " is a rotation of " + string2);
		} else {
			System.out.println(string1 + " is not a rotation of " + string2);
		}

		System.out.println("\n(With Lambda Expression)");
//		String string3 = scanner.nextLine().trim();
//		String string4 = scanner.nextLine().trim();
		String string3 = "hello";
		String string4 = "hi";
		boolean areRotations1 = areRotationsUsingLambdaExpression(string3, string4);
		if (areRotations1) {
			System.out.println(string3 + " is a rotation of " + string4);
		} else {
			System.out.println(string3 + " is not a rotation of " + string4);
		}

		// 4. Use Runnable interface to start a new thread and print numbers from
		System.out.println(	"\nRunnable interface (Without Lambda Expression): ");		
		NumberPrinter numberPrinter = new NumberPrinter();
        Thread thread = new Thread(numberPrinter);
        thread.start();
        
		System.out.println(	"\nRunnable interface (With Lambda Expression): ");		
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 2 Number: " + i);
                try {
                    Thread.sleep(2000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();
        
        

		// 5. Use Comparator inerface to sort given list of numbers in reverse order
		List<Integer> list1 = Arrays.asList(5, 3, 9, 1, 7);
		list1.sort(Comparator.reverseOrder());
		System.out.println(
				"\nSorted numbers in reverse order using Comparator inerface (Without Lambda Expression): " + list1);

		List<Integer> list2 = Arrays.asList(25, 13, 39, 431, 507);
		list2.sort((a, b) -> b.compareTo(a));
		System.out.println(
				"\nSorted numbers in reverse order using Comparator inerface (With Lambda Expression): " + list2);

		// 6. Use Comparator inerface to sort given list of Employees in the alphabetic
		// order of their name
		List<Emp> employees = new ArrayList<>();
		employees.add(new Emp(1, "Jay"));
		employees.add(new Emp(2, "Shru"));
		employees.add(new Emp(3, "Tushar"));
		employees.add(new Emp(4, "Okesh"));
		employees.sort(Comparator.comparing(Emp::getName));
		System.out.println(
				"\nsorted list of Employees in the alphabetic order of their name using Comparator inerface (Without Lambda Expression): ");
		employees.forEach(employee -> System.out.println(employee.getName()));

		List<Emp> employees2 = new ArrayList<>();
		employees2.add(new Emp(1, "Jayesh"));
		employees2.add(new Emp(2, "Jay"));
		employees2.add(new Emp(3, "Anand"));
		employees2.add(new Emp(4, "Mahesh"));
		employees2.sort((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		System.out.println(
				"\nsorted list of Employees in the alphabetic order of their name using Comparator inerface (With Lambda Expression): ");
		employees2.forEach(employee -> System.out.println(employee.getName()));

		// 7. Create a TreeSet that sorts the given set of numbers in reverse order
		TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b.compareTo(a);
			}
		});
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(3);
		treeSet.add(8);
		System.out.println("\nTreeSet elements in reverse order (Without Lambda Expression):");
		for (int num : treeSet) {
			System.out.println(num);
		}

		TreeSet<Integer> treeSet2 = new TreeSet<>((a, b) -> b.compareTo(a));
		treeSet2.add(102);
		treeSet2.add(52);
		treeSet2.add(202);
		treeSet2.add(31);
		treeSet2.add(87);
		System.out.println("\nTreeSet elements in reverse order (With Lambda Expression):");
		for (int num : treeSet2) {
			System.out.println(num);
		}

		// 8. Create a TreeSet that sorts the given set of Employees in the alphabetic
		// order of their name
		System.out.println(
				"\nTreeSet Sorted set of Employees in the alphabetic order of their name (Without Lambda Expression):");
		Employees emp01 = new Employees("Jay", 1001);
		Employees emp02 = new Employees("Shru", 1002);
		Employees emp03 = new Employees("Okesh", 1003);
		Employees emp04 = new Employees("Tushar", 1004);
		TreeSet<Employees> treeSetEmployees = new TreeSet<>();
		treeSetEmployees.add(emp01);
		treeSetEmployees.add(emp02);
		treeSetEmployees.add(emp03);
		treeSetEmployees.add(emp04);
		for (Employees emp : treeSetEmployees) {
			System.out.println(emp);
		}

		System.out.println(
				"TreeSet Sorted set of Employees in the alphabetic order of their name (With Lambda Expression):");
		Emp emp1 = new Emp(1, "Jay");
		Emp emp2 = new Emp(2, "Okesh");
		Emp emp3 = new Emp(3, "Tushar");
		Emp emp4 = new Emp(4, "Shru");
		TreeSet<Emp> treeSetEmployees1 = new TreeSet<>((empA, empB) -> empA.getName().compareTo(empB.getName()));
		treeSetEmployees1.add(emp1);
		treeSetEmployees1.add(emp2);
		treeSetEmployees1.add(emp3);
		treeSetEmployees1.add(emp4);
		for (Emp emp : treeSetEmployees1) {
			System.out.println(emp);
		}

		// 9. Create a TreeMap that sorts the given set of values in decending order
		System.out.println("\nTreeMap elements in descending order without lambda:");
		TreeMap<Integer, String> treeMapWithoutLambda = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		treeMapWithoutLambda.put(1, "One");
		treeMapWithoutLambda.put(5, "Five");
		treeMapWithoutLambda.put(3, "Three");
		treeMapWithoutLambda.put(2, "Two");
		treeMapWithoutLambda.put(4, "Four");
		for (Map.Entry<Integer, String> entry : treeMapWithoutLambda.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		System.out.println("\nTreeMap elements in descending order with lambda:");
		TreeMap<Integer, String> treeMapWithLambda = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
		treeMapWithLambda.put(11, "Eleven");
		treeMapWithLambda.put(51, "Fifty One");
		treeMapWithLambda.put(31, "Thirty One");
		treeMapWithLambda.put(21, "Twenty One");
		treeMapWithLambda.put(41, "Forty one");
		for (Map.Entry<Integer, String> entry : treeMapWithLambda.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		// 10. Create a TreeMap that sorts the given set of employees in decending order
		// of their name
		System.out.println("\nTreeMap elements in descending order without lambda:");
		TreeMap<String, Employees> treeMapWithoutLambdaEmployee = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String name1, String name2) {
				return name2.compareTo(name1);
			}
		});
		Employees emp001 = new Employees("Jay", 1001);
		Employees emp002 = new Employees("Shru", 1002);
		Employees emp003 = new Employees("Okesh", 1003);
		Employees emp004 = new Employees("Tushar", 1004);
		treeMapWithoutLambdaEmployee.put(emp001.getName(), emp001);
		treeMapWithoutLambdaEmployee.put(emp002.getName(), emp002);
		treeMapWithoutLambdaEmployee.put(emp003.getName(), emp003);
		treeMapWithoutLambdaEmployee.put(emp004.getName(), emp004);
		for (Map.Entry<String, Employees> entry : treeMapWithoutLambdaEmployee.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		System.out.println("\nTreeMap elements in descending order with lambda:");
		TreeMap<String, Employees> treeMapWithLambdaEmployee = new TreeMap<>((name1, name2) -> name2.compareTo(name1));
		Employees emp0001 = new Employees("Jayesh", 1001);
		Employees emp0002 = new Employees("Shrutika", 1002);
		Employees emp0003 = new Employees("Anand", 1003);
		Employees emp0004 = new Employees("Mahesh", 1004);
		treeMapWithLambdaEmployee.put(emp0001.getName(), emp0001);
		treeMapWithLambdaEmployee.put(emp0002.getName(), emp0002);
		treeMapWithLambdaEmployee.put(emp0003.getName(), emp0003);
		treeMapWithLambdaEmployee.put(emp0004.getName(), emp0004);
		for (Map.Entry<String, Employees> entry : treeMapWithLambdaEmployee.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

		// 11. Use Collections.Sort to sort the given list of Employees in decending
		// order of their name
		System.out.println("\nCollections.Sort -> Employees sorted in descending order of name: Without Lambda");
		List<Employees> employees1 = new ArrayList<>();
		employees1.add(new Employees("Jay", 1001));
		employees1.add(new Employees("Shru", 1002));
		employees1.add(new Employees("Mahesh", 1003));
		employees1.add(new Employees("Ramesh", 1004));
		Collections.sort(employees1, new Comparator<Employees>() {
			@Override
			public int compare(Employees emp1, Employees emp2) {
				return emp2.getName().compareTo(emp1.getName());
			}
		});
		for (Employees emp : employees1) {
			System.out.println(emp);
		}

		System.out.println("\nCollections.Sort -> Employees sorted in descending order of name: With Lambda");
		List<Employees> employees02 = new ArrayList<>();
		employees02.add(new Employees("Naresh", 1001));
		employees02.add(new Employees("Suresh", 1002));
		employees02.add(new Employees("Jayesh", 1003));
		employees02.add(new Employees("Mahesh", 1004));
		Collections.sort(employees02, (emp00001, emp00002) -> emp00002.getName().compareTo(emp00001.getName()));
		for (Employees emp : employees02) {
			System.out.println(emp);
		}

		scanner.close();
	}

	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}

	public static boolean isPalindromeUsingLambdaExpression(String str) {
		String cleanStr = str.toLowerCase();
		Predicate<String> palindromeCheck = s -> {
			StringBuilder reversed = new StringBuilder(s).reverse();
			return s.equals(reversed.toString());
		};
		return palindromeCheck.test(cleanStr);
	}

	public static int findSecondLargest(List<Integer> numbers) {
		if (numbers.size() < 2) {
			throw new IllegalArgumentException("List must have at least two elements");
		}
		Integer first = Integer.MIN_VALUE;
		Integer second = Integer.MIN_VALUE;
		for (Integer num : numbers) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && !num.equals(first)) {
				second = num;
			}
		}
		return second;
	}

	public static int findSecondLargestUsingLambdaExpression(List<Integer> numbers) {
		Comparator<Integer> comparator = (num1, num2) -> num1.compareTo(num2);
		Integer secondLargest = numbers.stream().sorted(comparator.reversed()).skip(1).findFirst()
				.orElseThrow(IllegalArgumentException::new);
		return secondLargest;
	}

	public static boolean areRotations(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		String concatenated = str1 + str1;
		return concatenated.contains(str2);
	}

	public static boolean areRotationsUsingLambdaExpression(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		BiPredicate<String, String> rotationCheck = (s1, s2) -> {
			return (s1.length() == s2.length()) && (s1 + s1).contains(s2);
		};
		return rotationCheck.test(str1, str2);
	}

}

class Emp {
	private int id;
	private String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}

class Employees implements Comparable<Employees> {
	private String name;
	private int id;

	public Employees(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Employees other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 Number: " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
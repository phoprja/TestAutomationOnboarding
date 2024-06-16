package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Task_01_Hometask_Lambda_Expressions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Check if a given string is a palindrome
		System.out.println("Enter a string to check if its palindrome (Without Lambda Expression)");
		String str1 = scanner.nextLine().trim();
		System.out.println("Is \"" + str1 + "\" a palindrome? " + isPalindrome(str1));

		System.out.println("\nEnter a string to check if its palindrome (With Lambda Expression)");
		String str2 = scanner.nextLine().trim();
		System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindromeUsingLambdaExpression(str2));

		// Find the 2nd biggest number in the given list of numbers
		List<Integer> numbers1 = Arrays.asList(5, 8, 2, 10, 7);
		int secondLargest1 = findSecondLargest(numbers1);
		System.out.println("\nWithout Lambda Expression: The second largest number is: " + secondLargest1);

		List<Integer> numbers2 = Arrays.asList(52, 81, 23, 106, 71);
		int secondLargest2 = findSecondLargestUsingLambdaExpression(numbers2);
		System.out.println("With Lambda Expression: The second largest number is: " + secondLargest2);

		// write a program to check if two strings are rotations of each other
		System.out.println("\nEnter 2 Strings to check if they are rotations of each other (Without Lambda Expression)");
		String string1 = scanner.nextLine().trim();
		String string2 = scanner.nextLine().trim();
		boolean areRotations = areRotations(string1, string2);
		if (areRotations) {
			System.out.println(string1 + " is a rotation of " + string2);
		} else {
			System.out.println(string1 + " is not a rotation of " + string2);
		}

		System.out.println("\nEnter 2 Strings to check if they are rotations of each other (With Lambda Expression)");
		String string3 = scanner.nextLine().trim();
		String string4 = scanner.nextLine().trim();
		boolean areRotations1 = areRotationsUsingLambdaExpression(string3, string4);
		if (areRotations1) {
			System.out.println(string3 + " is a rotation of " + string4);
		} else {
			System.out.println(string3 + " is not a rotation of " + string4);
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

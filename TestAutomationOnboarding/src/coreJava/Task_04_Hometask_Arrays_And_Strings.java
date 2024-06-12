package coreJava;

import java.util.HashMap;
import java.util.Map;

public class Task_04_Hometask_Arrays_And_Strings {
	
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20,
                       21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
                       38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                       55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,
                       72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88,
                       89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        // Write a program to find the missing number in integer array of 1 to 100
        int missingNumber = findMissingNumber(array);
        System.out.println("Missing number in the array: " + missingNumber);

        // Write a program to find biggest and smallest number in a array
        int[] numbers = {4, 9, 2, 1, 7, 6, 3, 5, 8};
        findBiggestAndSmallest(numbers);

        // write a program to Print duplicate characters from String 
        String str = "hello world";
        printDuplicateCharacters(str);

        // write a program to check if two strings are rotations of each other
        String str1 = "hello";
        String str2 = "lohel";
        boolean areRotations = areRotations(str1, str2);
        System.out.println("\nAre '" + str1 + "' and '" + str2 + "' rotations of each other? " + areRotations);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;

        for (int num : array) {
            currentSum += num;
        }

        return totalSum - currentSum;
    }

    public static void findBiggestAndSmallest(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("\nBiggest number: " + max);
        System.out.println("Smallest number: " + min);
    }

    public static void printDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("\nDuplicate characters in '" + str + "': ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

}

package coreJava;

public class Task_05_Hometask_Language_Constructs {
	
	 public static void main(String[] args) {
		 	//TASK1: You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases
	        int speed = 65;  
	        boolean isBirthday = false;  
	        int result1 = caughtSpeeding(speed, isBirthday);
	        System.out.println("Scenario1: Speeding Ticket: " + result1);
	        
	        //TASK2: The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is  6. Note: the function Math.abs(num) computes the absolute value of a number
	        int a = 5; 
	        int b = 11;
	        boolean result2 = isGreatNumber(a, b);
	        System.out.println("Scenario2: Is Number derived as 6: " + result2);
	        
	        //TASK3: We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0)
	        int tea = 6; 
	        int candy = 12;
	        int result3 = partyOutcome(tea, candy);
	        System.out.println("Scenario3: Outcome of the party: " + result3);
	        
	        //TASK4: You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0
	        a = 9; 
	        b = 1;
	        int c = 0;
	        int result4 = lotteryResult(a, b, c);
	        System.out.println("Scenario4: Lottery Result: " + result4);
	        
	        //TASK5: Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a
	        a = 2; 
	        b = 5;
	        c = 8;
	        boolean bOk = false;
	        boolean result5 = areNumbersOrdered(a, b, c, bOk);
	        System.out.println("Scenario5: Result for scenario5 to check if numbers are ordered: " + result5);
	        
	        //TASK6: Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
	        int num1 = 32; 
	        int num2 = 53;
	        boolean result6 = hasCommonDigit(num1, num2);
	        System.out.println("Scenario6: Is there a common digit in both the numbers: " + result6);
	        
	        //TASK7: Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
	        a = 123; // Example values
	        b = 456;
	        int result7 = calculateSum(a, b);
	        System.out.println("Scenario7: Result for Sum of 2 numbers: " + result7);
	        
	        //TASK8: Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x"
	        String base = "hello world"; 
	        String remove = "lo";
	        String result8 = removeSubstring(base, remove);
	        System.out.println("Scenario8: Result for remove substring: " + result8);
	        
	        //TASK9: Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same
	        String str = "aaabbccccddddd"; 
	        int result9 = largestBlockLength(str);
	        System.out.println("Scenario9: Length of the largest block: " + result9);
	        
	        //TASK10: Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
	        str = "abc123def45ghi6jk"; 
	        int result10 = sumOfNumbers(str);
	        System.out.println("Scenario10: Sum of numbers in the string: " + result10);
	        
	    }

	    
	 	public static int caughtSpeeding(int speed, boolean isBirthday) {
	        int maxSpeed = isBirthday ? 65 : 60;
	        int maxSpeedSmallTicket = isBirthday ? 85 : 80;

	        if (speed <= maxSpeed) {
	            return 0;
	        } else if (speed <= maxSpeedSmallTicket) {
	            return 1;
	        } else {
	            return 2;
	        }
	    }
	    
	    
	    public static boolean isGreatNumber(int a, int b) {
	        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
	    }
	    
	    
	    public static int partyOutcome(int tea, int candy) {
	        if (tea < 5 || candy < 5) {
	            return 0; 
	        } else if (tea >= 2 * candy || candy >= 2 * tea) {
	            return 2; 
	        } else {
	            return 1; 
	        }
	    }
	    
	    public static int lotteryResult(int a, int b, int c) {
	        int abSum = a + b;
	        int bcSum = b + c;
	        int acSum = a + c;

	        if (abSum == 10 || bcSum == 10 || acSum == 10) {
	            return 10; 
	        } else if (abSum - bcSum == 10 || abSum - acSum == 10) {
	            return 5; 
	        } else {
	            return 0; 
	        }
	    }
	    
	    public static boolean areNumbersOrdered(int a, int b, int c, boolean bOk) {
	        if (bOk) {
	            return c > b; 
	        } else {
	            return b > a && c > b; 
	        }
	    }
	    
	    public static boolean hasCommonDigit(int a, int b) {
	        int num1LeftDigit = a / 10;
	        int num1RightDigit = a % 10;

	        int num2LeftDigit = b / 10;
	        int num2RightDigit = b % 10;

	        return num1LeftDigit == num2LeftDigit || num1LeftDigit == num2RightDigit
	                || num1RightDigit == num2LeftDigit || num1RightDigit == num2RightDigit;
	    }
	    
	    public static int calculateSum(int a, int b) {
	        int sum = a + b;
	        int numDigitsA = String.valueOf(a).length();
	        int numDigitsSum = String.valueOf(sum).length();

	        return numDigitsSum == numDigitsA ? sum : a;
	    }

	    public static String removeSubstring(String base, String remove) {
	    	StringBuilder result = new StringBuilder();
	        int i = 0;
	        while (i < base.length()) {
	            int index = base.toLowerCase().indexOf(remove.toLowerCase(), i);
	            if (index == -1) {
	                result.append(base.substring(i));
	                break;
	            } else {
	                result.append(base.substring(i, index));
	                i = index + remove.length();
	            }
	        }
	        return result.toString();
	    }
	    
	    public static int largestBlockLength(String str) {
	        if (str.isEmpty()) {
	            return 0; 
	        }
	        int maxBlockLength = 1;
	        int currentBlockLength = 1;
	        for (int i = 1; i < str.length(); i++) {
	            if (str.charAt(i) == str.charAt(i - 1)) {
	                currentBlockLength++;
	            } else {
	                maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
	                currentBlockLength = 1;
	            }
	        }
	        maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
	        return maxBlockLength;
	    }
	    
	    public static int sumOfNumbers(String str) {
	        int sum = 0;
	        StringBuilder currentNumber = new StringBuilder();
	        for (char ch : str.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                currentNumber.append(ch); 
	            } else {
	                if (currentNumber.length() > 0) {
	                    sum += Integer.parseInt(currentNumber.toString()); 
	                    currentNumber.setLength(0); 
	                }
	            }
	        }
	        if (currentNumber.length() > 0) {
	            sum += Integer.parseInt(currentNumber.toString());
	        }
	        return sum;
	    }
	    
}

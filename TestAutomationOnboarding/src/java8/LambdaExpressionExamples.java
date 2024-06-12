package java8;

public class LambdaExpressionExamples {

	public static boolean isPalindrome(String str) {
        // Removing non-alphanumeric characters and converting to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Checking if the string is a palindrome
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left++) != cleanStr.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println("Test");
		String str = "A man, a plan, a canal, Panama!";
        System.out.println("Using Method without Lambda Expression:");
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str));
	}

}

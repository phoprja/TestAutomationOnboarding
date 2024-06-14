package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_03_Hometask_map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        Map<String, String> phoneBook = new HashMap<>();

        if ((n <= 100000) && (n >=1))
        {        	
		        for (int i = 0; i < n; i++) {
		            String name = scanner.nextLine().trim();
		            String phoneNumber = scanner.nextLine().trim();
		            if (isValidPhoneNumber(phoneNumber) && isValidName(name)) {
		                phoneBook.put(name, phoneNumber);
		            }
		            else {
		                System.out.println("Entered Name or/and Phone number is Invalid and the entry is not added to Phonebook");
		            }
		            	
		        }
		
		        while (scanner.hasNext()) {
		            String query = scanner.nextLine().trim();
		            if (phoneBook.containsKey(query)) {
		                System.out.println(query + "=" + phoneBook.get(query));
		            } else {
		                System.out.println("Not found");
		            }
		        }
		
		        scanner.close();        
        }
        else
        {
            System.out.println("Invalid value for n - following condition is failed - 1 <= n <= 100000");
        }
    }
    
    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[1-9]\\d{7}");
    }
    
    private static boolean isValidName(String name) {
        return name.matches("[a-z]+( [a-z]+)?");
    }
    
}

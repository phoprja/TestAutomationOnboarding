package coreJava;

import java.util.Scanner;

public class Task_02_Hometask_Basics {
	
	public static void main(String[] args) {
		
		//1. Create code which displays in console “Hello, NAME”, where NAME is taken from Command line (1 mark) 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        //2. Create "calculator" which takes two numbers and an operation from the command line and outputs the result of the operation to the console. Add addition, subtraction, multiplication and division. (4 marks)
        //Extra task : provide option for reminder, calcualte percentage (2 marks)
        System.out.print("\n\nCALCULATOR\n");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter one of the following operations +, -, *, /, r, p: ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    scanner.close();
                    return;
                }
                break;
            case 'r':
                result = num1 % num2;
                break;
            case 'p':
                result = (num1 / num2) * 100;
                break;    
            default:
                System.out.println("Error: Invalid operation.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();    
        
    }
}

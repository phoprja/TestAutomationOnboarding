package coreJava;

import java.util.Scanner;

public class Task_03_Hometask_Loops {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pyramid Generator");
        System.out.println("==================");
        
        System.out.println("\nCreate a Pyramid using while loop:");
        System.out.print("Enter Number: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter X: ");
        int startNumber = scanner.nextInt();
        
        System.out.println("\nPyramid using while loop:");
        generatePyramidWithWhile(rows, startNumber);
        
        System.out.println("\nCreate a Pyramid using do-while loop:");
        System.out.print("Enter Number: ");
        rows = scanner.nextInt();
        
        System.out.print("Enter X: ");
        startNumber = scanner.nextInt();
        
        System.out.println("\nPyramid using do-while loop:");
        generatePyramidWithDoWhile(rows, startNumber);
        
        
        System.out.println("\nCreate a Pyramid using for loop:");
        System.out.print("Enter Number: ");
        rows = scanner.nextInt();
        
        System.out.print("Enter X: ");
        startNumber = scanner.nextInt();
        System.out.println("\nPyramid using for loop:");
        generatePyramidWithFor(rows, startNumber);
        
        scanner.close();
    }

    // Generate pyramid using while loop
    private static void generatePyramidWithWhile(int rows, int startNumber) {
        int currentNumber = 0;
        int row = 1;
        
        while (row <= rows) {
            int col = 1;
            while (col <= row) {
            	
            	if (row == 1 && col == 1)
            	{
            		currentNumber = 0;
	                System.out.print(currentNumber + "\t");
	                col++;
            	}
            	else
            	{
	            	currentNumber = currentNumber+startNumber;
	                System.out.print(currentNumber + "\t");
	                col++;
            	}
            }
            System.out.println();
            row++;
        }
    }

    // Generate pyramid using do-while loop
    private static void generatePyramidWithDoWhile(int rows, int startNumber) {
      int currentNumber = 0;
      int row = 1;
        
        do {
            int col = 1;
            do {
            	if (row == 1 && col == 1)
            	{
            		currentNumber = 0;
	                System.out.print(currentNumber + "\t");
	                col++;
            	}
            	else
            	{
	            	currentNumber = currentNumber+startNumber;
	                System.out.print(currentNumber + "\t");
	                col++;
            	}
            } while (col <= row);
            System.out.println();
            row++;
        } while (row <= rows);
    }

    // Generate pyramid using for loop
    private static void generatePyramidWithFor(int rows, int startNumber) {
      int currentNumber = 0;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
            	if (row == 1 && col == 1)
            	{
            		currentNumber = 0;
	                System.out.print(currentNumber + "\t");
            	}
            	else
            	{
	            	currentNumber = currentNumber+startNumber;
	                System.out.print(currentNumber + "\t");
            	}
            }
            System.out.println();
        }
    }

}

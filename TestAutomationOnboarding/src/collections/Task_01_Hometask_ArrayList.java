package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_01_Hometask_ArrayList {
	public static void main(String[] args) {
        System.out.println("Enter the number of lines (n)");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        System.out.println("\nEnter d denoting number of integers on that line followed by values for those integers");
        System.out.println("Example: 6 1 2 3 4 5 6");
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        System.out.println("\nEnter q denoting number of queries");
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter x (row) and y(column) value for the query");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Handling the query
            if (x <= lines.size() && y <= lines.get(x - 1).size()) {
                System.out.println("Value at xth row and yth column: " + lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR - Invalid x(row) and y(column) values");
            }
        }
    }
}

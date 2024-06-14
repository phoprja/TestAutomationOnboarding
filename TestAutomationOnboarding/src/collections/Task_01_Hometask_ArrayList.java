package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_01_Hometask_ArrayList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
		if ((n >= 1) && (n <= 20000)) {
			for (int i = 0; i < n; i++) {
				int d = scanner.nextInt();
				ArrayList<Integer> line = new ArrayList<>();
				if ((d >= 0) && (d <= 50000)) {
					for (int j = 0; j < d; j++) {
						line.add(scanner.nextInt());
					}
					lines.add(line);
				} else {
					System.out.println("Invalid value for d - following condition is failed -> 0 <= d <= 50000");
					break;
				}
			}
				int q = scanner.nextInt();
				if ((q >= 1) && (q <= 1000)) {
					for (int i = 0; i < q; i++) {
						int x = scanner.nextInt();
						int y = scanner.nextInt();
						if ((x >= 1) && (x <= n)) {
							if (x <= lines.size() && y <= lines.get(x - 1).size()) {
								System.out.println(lines.get(x - 1).get(y - 1));
							} else {
								System.out.println("ERROR!");
							}
						} else {
							System.out.println("Invalid value for x - following condition is failed -> 1 <= x <= n");
						}
					}
				} else {
					System.out.println("Invalid value for q - following condition is failed -> 1 <= q <= 1000");
				}			

		} else {
			System.out.println("Invalid value for n - following condition is failed -> 1 <= n <= 20000");
		}

	}

}

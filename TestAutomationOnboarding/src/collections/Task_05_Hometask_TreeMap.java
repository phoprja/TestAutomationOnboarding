package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Task_05_Hometask_TreeMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		if ((T <= 100) && (T >= 1)) {

			for (int t = 0; t < T; t++) {
				int Q = scanner.nextInt();
				TreeMap<Integer, Integer> map = new TreeMap<>();

				if ((Q <= 100) && (Q >= 1)) {

					for (int q = 0; q < Q; q++) {
						char type = scanner.next().charAt(0);

						switch (type) {
						case 'a':
							int key = scanner.nextInt();
							int value = scanner.nextInt();
							map.put(key, value);
							break;
						case 'b':
							int queryKey = scanner.nextInt();
							int result = map.containsKey(queryKey) ? map.get(queryKey) : -1;
							System.out.print(result + " ");
							break;
						case 'c':
							System.out.print(map.size() + " ");
							break;
						case 'd':
							int removeKey = scanner.nextInt();
							map.remove(removeKey);
							break;
						case 'e':
							for (int k : map.keySet()) {
								System.out.print(k + " ");
							}
							break;
						}
					}
				} else {
					System.out.println("Invalid value for Q: Condition 1<=Q<=100 is Failed");
				}

				System.out.println();
			}
		} else {
			System.out.println("Invalid value for T: Condition 1<=T<=100 is Failed");
		}
		scanner.close();
	}
}

package collections;
import java.util.*;

public class Task_04_Hometask_Stack {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String expression = scanner.nextLine();
            System.out.println(isBalanced(expression));
        }

        scanner.close();
    }
	
	public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');

        for (char c : expression.toCharArray()) {
            if (bracketPairs.containsKey(c)) {
                stack.push(c);
            } else if (bracketPairs.containsValue(c)) {
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}

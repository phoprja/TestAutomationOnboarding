package collections;
import java.util.*;

public class Task_02_Hometask_Comparator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            
            if ((isValidName(name)) && (score<=1000)  && (score>=0) ) {
            	players[i] = new Player(name, score);
            }
            else {
                System.out.println("Entered Name or Score is Invalid");
                i--;
            }            	
        }
        scanner.close();
        
        Arrays.sort(players, checker);

        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
	
	private static boolean isValidName(String name) {
        return name.matches("^[a-z]+$");
    }
	
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            return a.name.compareTo(b.name); 
        } else {
            return Integer.compare(b.score, a.score); 
        }
    }
}

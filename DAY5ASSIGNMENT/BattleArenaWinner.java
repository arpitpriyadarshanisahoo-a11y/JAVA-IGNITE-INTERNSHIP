package DAY5ASSIGNMENT;

import java.util.Scanner;

public class BattleArenaWinner {
	 public static String findWinner(int player1, int player2) {
	        if (player1 > player2) {
	            return "Player 1 Wins";
	        } else if (player2 > player1) {
	            return "Player 2 Wins";
	        } else {
	            return "Match Draw";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Player 1 Score: ");
	        int p1 = sc.nextInt();

	        System.out.print("Enter Player 2 Score: ");
	        int p2 = sc.nextInt();

	        String result = findWinner(p1, p2);

	        System.out.println(result);
	        sc.close();
	    }

}

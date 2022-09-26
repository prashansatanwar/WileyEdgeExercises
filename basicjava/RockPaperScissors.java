package basicjava;
import java.util.*;

public class RockPaperScissors {
	
	public static boolean play() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rounds: ");
		int rounds = sc.nextInt();
		
		if(rounds>10 || rounds<1) {
			System.out.println("You can only play 1-10 rounds!");
			return false;
		}
		
		int ties = 0, userW = 0, compW = 0;
		
		while(rounds>0) {
			System.out.print("Enter 1(rock), 2(paper), 3(scissors): ");
			int user = sc.nextInt();
			
			Random r = new Random();
			int comp = r.nextInt(3) + 1;
			
			System.out.println("Computer chose: "+comp);
			if(user == 1) {
				if(comp == 1) {
					System.out.println("Tie");
					ties++;
				}
				else if(comp == 2) {
					System.out.println("Computer Wins");
					compW++;
				}
				else {
					System.out.println("User wins");
					userW++;
				}
			}
			else if(user == 2) {
				if(comp == 1) {
					System.out.println("User wins");
					userW++;
				}
				else if(comp == 2) {
					System.out.println("Tie");
					ties++;
				}
				else {
					System.out.println("Computer Wins");
					compW++;
				}
			}
			else {
				if(comp == 1) {
					System.out.println("Computer Wins");
					compW++;
				}
				else if(comp == 2) {
					System.out.println("User wins");
					userW++;
				}
				else {
					System.out.println("Tie");
					ties++;
				}
			}
			
			rounds--;
		}
		
		System.out.println("Ties: "+ties);
		System.out.println("User wins: "+userW);
		System.out.println("Computer wins: "+compW);
		
		if(userW>compW) System.out.println("User wins this round!");
		else if(compW>userW) System.out.println("Computer wins this round!");
		else System.out.println("This round is a tie!");
		
		System.out.println("Do you want to play again? (YES/NO)");
		
		String again = sc.next();
		if(again.toUpperCase().equals("YES")) return true;
		else System.out.println("Thanks for playing!");
		return false;
	}
	
	public static void main(String[] args) {
		boolean playagain = play();
		
		while(playagain) {
			playagain = play();
		}
		
	}

}

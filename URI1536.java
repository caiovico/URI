//https://www.urionlinejudge.com.br/judge/pt/problems/view/1536
import java.util.*;
import java.io.*;
class Team{
	int goalsOut, score;
	public Team(int score, int goalsOut){
		this.score = score;
		this.goalsOut = goalsOut;
	}
	public int getScore(){
		return score;
	}
	public int getGoalsOut(){
		return goalsOut;
	}
	
}
public class URI1536{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int N = new Integer(scn.nextLine());
		for(int i=0;i<N;i++){
			int gameA1 = scn.nextInt();
			scn.next();
			int gameA2 = scn.nextInt();
			int gameB1 = scn.nextInt();
			scn.next();
			int gameB2 = scn.nextInt();
			Team team1 = new Team((gameA1+gameB2)-(gameA2+gameB1), gameB2);
			Team team2 = new Team((gameB1+gameA2)-(gameA1+gameB2), gameA2);
			if (team1.getScore() == team2.getScore()){
				if (team1.getGoalsOut() == team2.getGoalsOut()){
					System.out.println("Penaltis");
				}else if(team1.getGoalsOut() > team2.getGoalsOut()){
					System.out.println("Time 1");
				}else{
					System.out.println("Time 2");
				}
			}else if(team1.getScore()>team2.getScore()){
				System.out.println("Time 1");
			}else{
				System.out.println("Time 2");
			}
		}
	}	
}
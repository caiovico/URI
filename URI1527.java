import java.util.*;
import java.io.*;

class Guilda{
	private int points;
	public int getPoints(){
		return points;
	}
	public Guilda(Guilda gA, Guilda gB){
		this.points=gA.getPoints()+gB.getPoints();
	}
	public Guilda(int p){
		this.points = p;
	}
}
public class URI1527{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (true){
			int counter = 0;
			int N = scn.nextInt();
			int M = scn.nextInt();
			if (N == 0	&& M == 0) break;
			List<Guilda> guildas = new ArrayList<>();
			for (int i=0;i<N;i++){
				guildas.add(new Guilda(scn.nextInt()));
			}
			for (int i=0;i<M;i++){
				for (Guilda)
				int action = scn.nextInt();
				int num1 = scn.nextInt()-1;
				int num2 = scn.nextInt()-1;
				Guilda a = guildas.get(num1);
				Guilda b = guildas.get(num2);
				if (action == 1){
					Guilda newGuilda = new Guilda(a,b);
					guildas.set(num1, newGuilda);
					guildas.set(num2, newGuilda);
				}
				else{
					if ((a == guildas.get(0)) && (a.getPoints()>b.getPoints()))
						counter++;					
					else if ((b == guildas.get(0)) && (b.getPoints()>a.getPoints()))
						counter++;
				}
			}
			System.out.println(counter);
		}	
	}
}
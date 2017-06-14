//https://www.urionlinejudge.com.br/judge/pt/problems/view/1062
import java.util.*;
import java.io.*;

public class URI1062{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (true){
			int N = scn.nextInt();
			if (N==0) break;
			trials: while (true){
				Deque<Integer> station = new ArrayDeque<>();
				List<Integer> intendedOut = new ArrayList<>();
				for (int i=0;i<N;i++){
					int toAdd = scn.nextInt();
					if (toAdd == 0) break trials;
					intendedOut.add(toAdd);
				}
				int wagon = 1;
				for (int i=0;i<N;i++){
					if ((station.peekFirst()==null) || (station.peekFirst()<intendedOut.get(i))) {
						while(wagon<=intendedOut.get(i)){
							station.addFirst(wagon++);
						}	
					}else if (station.peekFirst()>intendedOut.get(i)){
						System.out.println("No");
						continue trials;
					}
					station.pollFirst();
				}	
				System.out.println("Yes");
			}
			System.out.println();

		}		
	}
}
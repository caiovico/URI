//https://www.urionlinejudge.com.br/judge/pt/problems/view/1523
//Estacionamento Linear
import java.util.*;
public class URI1523{
	public static void main(String[] args) {
		List<String> answer = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		int N,K,entry, exit;

		outer:
		while (true){
			N = scn.nextIn();
			K = scn.nextInt();
			if (N==0 && K==0){
				break;
			}
			Map<Integer,Integer> events = new TreeMap<>();
			Deque<Integer> park = new ArrayDeque<>();
			String works = "Sim";
			for (int car=0;car<N;car++){
				entry = scn.nextInt();
				exit = scn.nextInt();
				for(int key:events.keySet()){
					if (key>entry){
						break;
					}
					if(events.get(key)==park.pollFirst()){
						events.remove(key);
					}else{
						works = "Nao";
						
						break outer;
					}
				}
				if (park.size()==K){
					works = "Nao";
					break;	
				}else{
					park.offerFirst(car);
					events.put(exit,car);
				}
				if (car == N-1){
					for (int key:events.keySet()){
						if(events.get(key)!=park.pollFirst()){
							works = "Nao";
							break;
						}
					}
				}
			}

			
		}//while
		for (String a:answer){
			System.out.println(a);
		}
	}
}
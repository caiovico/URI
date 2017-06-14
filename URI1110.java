//https://www.urionlinejudge.com.br/judge/pt/problems/view/1110
import java.util.*;
import java.io.*;
import java.util.stream.*;
public class URI1110{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader((new InputStreamReader(System.in))));
		int num;
		while ((num=scn.nextInt())!=0){
			Deque<Integer> deque = new ArrayDeque<>();
			for (int i=1;i<=num;i++){
				deque.offerLast(i);
			}
			List<Integer> discarded = new ArrayList<>();
			while (deque.size()>1){
				discarded.add(deque.pollFirst());
				deque.offerLast(deque.pollFirst());
			}
			String discardedAnswer = "";
			if (discarded.size()>0){
				discardedAnswer = discarded.stream()
										   .map(Object::toString)
										   .collect(Collectors.joining(", ", " ",""));
			}
			System.out.format("Discarded cards:%s\n", discardedAnswer);
			System.out.format("Remaining card: %s\n", deque.peekFirst());
		}
	}
}
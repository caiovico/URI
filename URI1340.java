//https://www.urionlinejudge.com.br/judge/pt/problems/view/1340
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class URI1340{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (scn.hasNextInt()){
			int cases = scn.nextInt();
			boolean checkStack = true;
			boolean checkQueue = true;
			boolean checkPriorityQueue = true;
			Deque<Integer> stack = new ArrayDeque<>();
			Queue<Integer> queue = new ArrayDeque<>();
			Comparator<Integer> comparator = (a,b) -> b-a;
			Queue<Integer> pQueue = new PriorityQueue<>(comparator); 
			for (int i=0;i<cases;i++){
				int action = scn.nextInt();
				int element = scn.nextInt();
				if (checkStack){
					if (action == 1){
						stack.offerFirst(element);
					}else if ((stack.peekFirst() == null)||(stack.pollFirst()!=element)){
						checkStack = false;
					}
				}
				if (checkQueue){
					if (action == 1){
						queue.offer(element);
					}else if ((queue.peek()==null)||(queue.poll()!=element)){
							checkQueue = false;
					}
				}
				if (checkPriorityQueue){
					if (action == 1){
						pQueue.offer(element);
					}else if ((pQueue.peek()==null)||(pQueue.poll()!=element)){
							checkPriorityQueue = false;
					}
				}
			}
			List<String> dataStructures = new ArrayList<>();;
			if (checkStack) dataStructures.add("stack");
			if (checkQueue) dataStructures.add("queue");
			if (checkPriorityQueue) dataStructures.add("priority queue");	
			if (dataStructures.size()==1){
				System.out.println(dataStructures.get(0));
			}else if (dataStructures.size()==0){
				System.out.println("impossible");
			}else{
				System.out.println("not sure");
			}
		}
	}
}
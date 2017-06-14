//https://www.urionlinejudge.com.br/judge/pt/problems/view/1318
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class URI1318{
	public static void main(String[] args) {
			Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while (true){
				Map<Integer,Integer> tickets = new TreeMap<>();
				int original = scn.nextInt();
				int present = scn.nextInt();
				if (original == 0 && present== 0) break;
				for(int i=0;i<present;i++){
					int num = scn.nextInt();
					if (tickets.containsKey(num)){
						int actual = tickets.get(num);
						tickets.replace(num,++actual);
					}else{
						tickets.put(num,0);
					}	
				}
				long answer = tickets.values()
									 .stream()
							  		 .filter(n->n>0)
							  		 .count();
				System.out.println(answer);			  		 
			}
		}	
}
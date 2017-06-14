//https://www.urionlinejudge.com.br/judge/pt/problems/view/1256
import java.util.*;
import java.io.*;
import java.util.stream.*;
public class URI1256{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = scn.nextInt();
		for(int i=0;i<N;i++){
			int M = scn.nextInt();
			long C = scn.nextLong();
			Map<Integer,List<Integer>> hashTable = 
				Stream.generate(()->scn.nextInt())
					  .limit(C)
					  .collect(Collectors.groupingBy(n->n%M));
			for (int j=0;j<M;j++){
				if (hashTable.get(j) != null){
					String answer = hashTable.get(j)
											 .stream()
											 .map(Object::toString)
											 .collect(Collectors.joining(" -> ", "", " -> \\"));
					System.out.format("%d -> %s\n",j,answer);							 
				}else{
					System.out.format("%d -> \\\n", j);
				}
			}
			if (i!=(N-1))		  		  						
				System.out.println();	
		}
	}
}
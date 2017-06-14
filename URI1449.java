//https://www.urionlinejudge.com.br/judge/pt/problems/view/1449
import java.util.*;
import java.io.*;
import java.util.stream.*;
public class URI1449{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = scn.nextInt();
		for (int a=0;a<T;a++){
			int M = scn.nextInt();
			int N = scn.nextInt();
			scn.nextLine();
			Map<String, String> dict = new TreeMap<>();
			for (int i=0;i<M;i++){
				String key = scn.nextLine();
				String value = scn.nextLine();
				dict.put(key,value);
			}	
			for (int i=0;i<N;i++){
				String[] line = scn.nextLine().split(" ");
				String new_line = Arrays.asList(line)
										.stream()
										.map(e->dict.getOrDefault(e,e))
										.collect(Collectors.joining(" "));
				System.out.println(new_line);						
			}
		System.out.println();	
		}		
	}
}
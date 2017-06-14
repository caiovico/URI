//https://www.urionlinejudge.com.br/judge/pt/problems/view/2091
import java.math.*;
import java.io.*;
import java.util.*;
public class URI2091{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(true){
			int N = scn.nextInt();
			if (N==0) break;
			Map<BigInteger, Integer> counter = new TreeMap<>();
			for (int i=0;i<N;i++){
				BigInteger current = new BigInteger(scn.next());
				if((counter.putIfAbsent(current,0)) != null){
					counter.remove(current);
				}
			}
			for(Map.Entry e:counter.entrySet()){
				System.out.println(e.getKey());
			}
		}
	}
}
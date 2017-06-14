//https://www.urionlinejudge.com.br/judge/pt/problems/view/2492
import java.util.*;
import java.io.*;
public class URI2492{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T;
		while((T=scn.nextInt())!=0){
			boolean function = true;
			boolean invertible = true;
			Set<String> start = new TreeSet<>();
			Set<String> destination = new TreeSet<>();
			for(int i=0;i<T;i++){
				String X = scn.next();
				scn.next();
				String Y = scn.next();
				if (function){
					if (!start.add(X)){
						function = false;
						continue;
					}
					if (invertible){
						if (!destination.add(Y)){
							invertible = false;
						}
					}
				}

			}
			if (function){
				if (invertible){
					System.out.println("Invertible.");
				}else{
					System.out.println("Not invertible.");
				}
			}else{
				System.out.println("Not a function.");
			}
		}
	}
}
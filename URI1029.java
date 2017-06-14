//https://www.urionlinejudge.com.br/judge/pt/problems/view/1029
import java.util.*;
import java.io.*;

public class URI1029{


	public static int counter = 0;

	public static int fib(int i){
		if (i>1){
			counter+=2;
			return fib(i-1)+fib(i-2);
		}else if (i==1){
			return 1;
		}else{
			return 0;
		}
	}

	public static void main(String... args){
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int tests = scn.nextInt();
		for (int j = 0;j<tests;j++){
			int n = scn.nextInt();
			counter = 0;
			int answer = fib(n);
			System.out.format("fib(%d) = %d calls = %d%n", n, counter, answer);
		}
	}
}
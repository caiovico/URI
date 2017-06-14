//https://www.urionlinejudge.com.br/judge/pt/problems/view/1068
import java.util.*;
import java.io.*;
public class URI1068{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		next_line: while(scn.hasNext()){
			Deque<Object> parentheses = new ArrayDeque<>();
			String expression = scn.nextLine();
				for (char c:expression.toCharArray()){
					if (c=='('){
						parentheses.push(new Object());
					}else if(c==')'){
						if (parentheses.poll()==null){
							System.out.println("incorrect");
							continue next_line;
						}
					}
				}
			if (parentheses.peek()==null){
				System.out.println("correct");	
			}else{
				System.out.println("incorrect");
			}
		}
	}
}
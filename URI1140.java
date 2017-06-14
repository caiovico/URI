//https://www.urionlinejudge.com.br/judge/pt/problems/view/1140
//Flores Florescem da Franca
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word, isTauto;
		char base;
		List<String> answer = new ArrayList<>();
		while(scn.hasNextLine()){
			Scanner line = new Scanner(scn.nextLine());
			word = line.next().toLowerCase();
			if (word.equals("*")){
				break;
			}
			base = word.charAt(0);
			isTauto = "Y";
			while(line.hasNext()){
				word = line.next().toLowerCase();
				if(base != word.charAt(0)){
					isTauto = "N";
					break;
				}
			}//while
			answer.add(isTauto);
		}
		for(String a:answer){
			System.out.println(a);
		}
	}
}
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1222
//Concurso de Contos

import java.util.*;

public class URI1222{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Integer> answer = new ArrayList<>();
		int N, L, C, pages, lines, chars, word;
		try{
			while ((N = scn.nextInt()) > 0){
				lines = pages = 1;
				chars = 0;
				L = scn.nextInt();
				C = scn.nextInt();
				for (int i=0;i<N;i++){
					word = scn.next().length();
					if (chars != 0){
						word++;	
					}
					if (chars+word>C){
						lines++;
						chars = --word;
						if(lines>L){
							pages++;
							lines=1;
						}
					}else{
						chars+=word;
					}
				}//for
				answer.add(pages);
			}//while
		}	
		catch (NoSuchElementException e){
			for (int a : answer){
				System.out.println(a);
			}
		}		
	}
}
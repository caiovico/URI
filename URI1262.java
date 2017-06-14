//https://www.urionlinejudge.com.br/judge/pt/problems/view/1262
import java.util.*;
import java.io.*;
public class URI1262{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (scn.hasNext()){
			int cycles = 0;
			try{
				String[] commands = scn.next().split("(?=W)");
				int threads = scn.nextInt();
				int counter = 0;
				for (String s:commands){
					String[] subcommands = s.split("(?<=W)");
					for (String s2:subcommands){
						cycles++;
						if (s2.length()>threads){
							cycles+=s2.length()/threads;
							if(s2.length()%threads == 0){
								cycles--;
							}
						}
					}
				}
				System.out.println(cycles);
			}
			catch (Exception e){
				break;
			}
		}
	}
}


/*
R

RRR
3

__
R
RR

R
R
RRR

RRRR
RR
RR
RRRR RRRR R
R
R
RRRR
RRRR R

//RWRRWWRWRWRRRWWRRRRWRRWRRWRRRRRRRRRWRWRWRRRRWRRRRR

*/
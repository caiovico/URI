//https://www.urionlinejudge.com.br/judge/pt/problems/view/1430
import java.util.*;
import java.io.*;
public class URI1430{
	public static void main(String[] args) {
		Map<Character, Double> values = new TreeMap<>();
		values.put('W',1d);
		values.put('H',0.5);
		values.put('Q',0.25);
		values.put('E',0.125);
		values.put('S',0.0625);
		values.put('T',0.03125);
		values.put('X',0.015625);
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (true){
			String line = scn.nextLine();
			if (line.equals("*")) break;
			String [] bars = line.split("/");
			int answer = 0;
			over_bars: for (String bar:bars){
				double count_bar = 0d;
				for (char c:bar.toCharArray()){
					count_bar += values.get(c);
					if (count_bar>1d){
						continue over_bars;
					}
				}
				if (count_bar==1.0){
					answer++;
				}
			}
			System.out.println(answer);
		}
	}
}
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1704
import java.util.*;
import java.io.*;
class Computer implements Comparable<Computer>{
	private int profit, hours;
	public Computer(int v, int t){

	}
	public int getProfit(){
		return profit;
	}
	public boolean equals(Object o){
		if !(o instanceof Computer)
			return false
		Computer that = (Computer)o;
		if (this.compareTo(that)){
			return true;
		}
	}
	public int compareTo(Computer that){
		int answer;
		if ((answer = this.hours - that.hours) == 0 ){
			if ((answer = this.profit - that.profit) == 0){
				return 0;
			}else{
				return answer;
			}
		}else{
			return answer;
		}
	} 	

}	
public class URI1704{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (scn.hasNextInt()){
			final int N = scn.nextInt();
			final int H = scn.nextInt(); 
			Map<Integer> hours = new TreeMap<>();
			for (int i=0;i<N;i++){
				int v = scn.nextInt();
				int t = scn.nextInt();
				for (int i=t;i>0;i++){
					Integer actual = null;
					if ((actual=hours.get(i))==null){
						hours.put(i,v)
					}else if (actual>)
				}
			}
		}
	}
}
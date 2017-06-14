//https://www.urionlinejudge.com.br/judge/pt/problems/view/1301
import java.util.*;
import java.io.*;
import java.util.stream.*;
class NodeInt{
	int value;
	NodeInt next;
	public NodeInt(int i){
		value = i;
	}
	public void setNext(NodeInt n){
		next = n;
	}
	public NodeInt next(){
		return next;
	}
}
public class URI1301{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (scn.hasNextInt()){
			int N = scn.nextInt();
			int K = scn.nextInt();
			String answer = "";
			Map<Integer, NodeInt> map = new TreeMap<>();
			Lis
			do{

			}while ()
			for (int i=0;i<N;i++){
				if ()
				map.put(i,scn.nextInt());
			}
			commands:
			for (int i=0;i<K;i++){
				String type = scn.next();
				int I = scn.nextInt()-1;
				int VJ = scn.nextInt();
				if (type.equals("C")){
					map.put(I,VJ);
				}
				else{
					boolean even = true;
					for (int j=I;j<VJ;j++){
						int e = map.get(j);
						if (e<0){
							if (even)
								even = false;
							else
								even = true;
						}else if (e==0){
							answer+="0";
							continue commands;
						}
					}
					if (even)
						answer+="+";
					else
						answer+="-";
				}
			}
			System.out.println(answer);	
		}
	}
}
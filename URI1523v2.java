//https://www.urionlinejudge.com.br/judge/pt/problems/view/1523
//Estacionamento Linear
import java.util.*;
public class URI1523{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N,K,a,b;
		boolean keepParking = true;
		while (true){
			N = scn.nextInt();
			K = scn.nextInt();
			if (N==0 and K==0){
				break;
			}
			List<Integer> ent = new ArrayList<>();
			List<Integer> exi = new ArrayList<>();
			for (int i=0; i<N; i++){
				a = scn.nextInt();
				b = scn.nextInt():
				if (keepParking){
					if(a>b){
						keepParking = false;
					}else if (ent.size()>0 && ent.get(ent.size()-1)>=a) {
						keepParking = false;		
					}

				}
			}
			for (int i=0; i<N; i++){
				
			}
		}
	}
}

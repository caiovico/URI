//https://www.urionlinejudge.com.br/judge/pt/runs/add/1160

import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1160 {
 
    public static void main(String[] args) throws IOException {
 		Scanner scn = new Scanner(System.in);

 		int CASES = scn.nextInt();

 		int years;
 		Float pa, pb;
 		float actualA, actualB, g1, g2;

 		for(int i=0;i<CASES;i++){
 			pa = scn.nextFloat();
 			pb = scn.nextFloat();
 			g1 = scn.nextFloat();
 			g2 = scn.nextFloat();

 			years=0;

 			while(years<=100){
 				years++;
 				pa = pa + pa/100*g1;
 				pb = pb + pb/100*g2;
 				pa=(float)pa.intValue();
 				pb=(float)pb.intValue();
 				if (pa > pb) break;
 			}
 			if(years <= 100){
 				System.out.println(years+" anos.");
 			}else{
 				System.out.println("Mais de 1 seculo.");
 			}
 		}

    }
 
}
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1020

import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1020 {
 
    public static void main(String[] args) throws IOException {
 		Scanner scn = new Scanner(System.in);

 		int[] periods = new int[]{365, 30};
 		int[] answer = new int[]{0,0};

 		int i = -1;

 		int N = scn.nextInt();
 		while(i++<periods.length-1){
 			while(N >= periods[i]){
 				N-= periods[i];
 				answer[i]++;
 			}
 		}
        System.out.format("%d ano(s)%n", answer[0]);
        System.out.format("%d mes(es)%n", answer[1]);
        System.out.format("%d dia(s)%n", N);
 
    }
 
}
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1046

import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1046 {
 
    public static void main(String[] args) throws IOException {
 		Scanner scn = new Scanner(System.in);
 		int A = scn.nextInt();
 		int B = scn.nextInt();

 		if(A==B)
 			System.out.println("O JOGO DUROU 24 HORA(S)");
 		else{
 			if(A>B){
 				System.out.format("O JOGO DUROU %d HORA(S)%n", 24-A+B);
 			}
 			else{
 				System.out.format("O JOGO DUROU %d HORA(S)%n", B-A);
 			}
 		}
 
    }
 
}
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1142

import java.io.IOException;
import java.util.*;
import java.util.stream.*; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1142 {
 
    public static void main(String[] args) throws IOException {
    	Scanner scn = new Scanner(System.in);

    	int N = scn.nextInt();

    	Stream.iterate(1, n->n+4)
    		  .limit(N)
    		  .forEach(n->System.out.format("%d %d %d PUM%n", n, n+1, n+2) );
    }
 
}
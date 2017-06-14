//https://www.urionlinejudge.com.br/judge/pt/problems/view/1144

import java.io.IOException;
import java.util.stream.*;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1144 {
 
    public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);

		final int N = scn.nextInt();

		Stream.iterate(1, n->n+1)
			  .limit(N)
			  .forEach(i->{
			  	int j=i*i;
			  	int k=j*i;
			  	System.out.format("%d %d %d%n%d %d %d%n",i, j, k, i, j+1, k+1);});

 
    }
 
}
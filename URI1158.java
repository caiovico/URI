//https://www.urionlinejudge.com.br/judge/pt/problems/view/1158

import java.io.IOException;
import java.util.*;
import java.util.stream.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1158 {
 
    public static void main(String[] args) throws IOException {
    	Scanner scn = new Scanner(System.in);
    	int CASES = scn.nextInt();

    	for(int i=0;i<CASES;i++){
    		int b = scn.nextInt();
    		int e = scn.nextInt();

    		int sum=	
    		IntStream.iterate(b, j -> j+1)
    				 .filter(j->j%2!=0)
    				 .limit(e)
    				 .sum();

    		System.out.println(sum);		 

    	}
 
    }
 
}
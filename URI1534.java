//https://www.urionlinejudge.com.br/judge/pt/problems/view/1534

import java.io.IOException;
import java.util.*; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1534 {
 
    public static void main(String[] args) throws IOException {
 		Scanner scn = new Scanner(System.in);

 		int n;
 		String answer;
 		char[] array;

 		while(scn.hasNext()){
 			n = scn.nextInt();
 			array = new char[n];
 			for(int i=0;i<n;i++){
	 			Arrays.fill(array,'3');
	 			array[i] = '1';
	 			array[n-1-i] = '2';
	 			System.out.println(new String(array));
 			}
 		}
		
    }
 
}
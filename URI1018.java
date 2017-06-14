import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1018 {
 
    public static void main(String[] args) throws IOException {
    	Locale.setDefault(new Locale("pt", "BR"));
 		float[] cedul = new float[]{100,50,20,10,5,2,1};
 		int [] answer = new int[7];
 		Arrays.fill(answer, 0);

 		Scanner scn = new Scanner(System.in);
 		int N = scn.nextInt();
 		System.out.println(N);
 		int i = 0;

 		while (N>0){
 			while(N >= cedul[i]){
 				N-=cedul[i];
 				answer[i]++;
 				}
 			if(i++ > 6) break;	
 		}

	 	for(int j = 0; j<cedul.length;j++){
	 		System.out.format("%d nota(s) de R$ %.2f%n", answer[j], cedul[j]);
	 	}	 
 	}
}
 

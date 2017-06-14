//https://www.urionlinejudge.com.br/judge/pt/problems/view/1557

import java.io.IOException;
import java.util.*;

public class URI1557 {
 
    public static void main(String[] args) throws IOException {
    	Scanner scn = new Scanner(System.in);
    	
    	int[][] matrix;
    	int size, current, n;
    	List<Integer> numbers = new ArrayList<>();

    	while((n=scn.nextInt())!=0){ //
    		numbers.add(n);
    	}

    	for(int N : numbers){
    		matrix = new int[N][N];
    		current = 1;

    		for(int i=0;i<N;i++){
    			for(int j=0;j<N;j++){
    				matrix[i][j] = current;
    				current = current << 1;
    			}
    			current = 1<<(i+1);
    		}
    		current=1;
    		int spaces = new Integer(matrix[N-1][N-1]).toString().length();
    		for(int i=0;i<N;i++){
    			System.out.format("%"+spaces+"d", matrix[i][0]);
    			for(int j=1;j<N;j++){
    				System.out.format("%"+(spaces+1)+"d", matrix[i][j]);
    			}
    			System.out.println();
    		}
    		System.out.println();	
    	}
    }
 
}
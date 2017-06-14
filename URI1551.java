//https://www.urionlinejudge.com.br/judge/pt/problems/view/1551

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class URI1551{
    public static void main (String args[]){
    	Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int N = new Integer(scn.nextLine());
        for(int i=0;i<N;i++){
        	int number = (int)
        	scn.nextLine().chars()
        				  .filter(j->j>=97 && j<=122)
        				  .distinct()
        				  .count();		  
        	if (number<13){
        		System.out.println("frase mal elaborada");
        	}else if (number < 26){
        		System.out.println("frase quase completa");
        	}else{
        		System.out.println("frase completa");
        	}			  
        }
    }
}
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1202
import java.math.*;
import java.util.*;
import java.io.*;
import java.nio.*;
public class URI1202{

	public static void main(String[] args) {
		int n = 0;
		int i = 1;
			try(
				Path path = new Path("./out.txt");
				BufferedWriter out = Files.newBufferedWriter(path); 
				String toPrint = Integer.toBinaryString(i);
				for (int j=1;j<=1024;j++){
					out.write(toPrint);
					out.newLine();
					int s = n;
					n+=i;
					i+=n+s;
				}
			)	

	}
}
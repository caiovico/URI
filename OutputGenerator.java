import java.io.*;
import java.nio.file.*;
import java.util.*;

public class OutputGenerator{
	public static void main(String[] args) {
		Scanner scn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		String[] d = scn.next().split("(?=W)");
		for (String s:d){
			String[] d2 = s.split("(?<=W)");
			for (String s2:d2){
				System.out.println(s2);
			}
			
		}
	}
}
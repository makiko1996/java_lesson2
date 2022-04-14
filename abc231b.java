package jp.practice.javastudy;

import java.util.Scanner;
import java.util.Arrays;

public class abc231b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = scan.next();
		}
		Arrays.sort(s);
		int count = 0;
		String jadge = s[0];
		int tmp = 0;
		
		for (int i = 1; i < n; i++) {
			if (s[i].equals(s[i-1])) {
				tmp++;
				if (tmp > count) {
					jadge = s[i];
				}
			}
		}
		
		System.out.println(jadge);
		
	}
	
	

}

package jp.practice.javastudy;

import java.util.Scanner;
import java.util.Arrays;

public class abc242b2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		char[] s = S.toCharArray();
		Arrays.sort(s);
		System.out.print(s[1]);
		

	}

}

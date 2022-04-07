package jp.practice.javastudy;

import java.util.Scanner;

public class abc236a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		S = S.replace(S.substring(a-1, a), S.substring(b-1, b));
		S = S.replace(S.substring(b-1, b), S.substring(a-1, a));
		
		System.out.println(S);
	}

}

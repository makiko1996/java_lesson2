package jp.practice.javastudy;

import java.util.Scanner;

public class abc236a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String newS = S.substring(0, a-1) + S.substring(b-1, b) + S.substring(a, b-1) + S.substring(a-1, a) + S.substring(b);
		
//		String Sa = S.replaceFirst(S.substring(a-1, a), S.substring(b-1, b));
//		String Sb = Sa.replaceFirst(S.substring(b-1, b), S.substring(a-1, a));
		
		System.out.println(newS);
	}

}

package jp.practice.javastudy;

import java.util.Scanner;

public class abc233b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		String[] s = scan.next().split("");
		
		for (int i = 0; i < l - 1; i++) {
			System.out.print(s[i]);
		}
		for (int i = r - 1; i >= l - 1;i--) {
			System.out.print(s[i]);
		}
		for (int i = r; i < s.length; i++) {
			System.out.print(s[i]);
		}
		
	}

}

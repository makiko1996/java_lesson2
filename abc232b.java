package jp.practice.javastudy;

import java.util.Scanner;

public class abc232b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		String ans = "Yes";
		
		int k = (t.charAt(0) - s.charAt(0) + 26) % 26;
		int n = s.length();
		
		for (int i = 1; i < n; i++) {
			int tmp = (t.charAt(i) - s.charAt(i) + 26) % 26;
			if (tmp != k) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}

}

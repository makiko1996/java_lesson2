package jp.practice.javastudy;

import java.util.Scanner;

public class abc228a {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int t = scan.nextInt();
		int x = scan.nextInt();
		String ans = "No";
		
		if (s > t && x < s) {
			t += 24;
			x += 24;
		} else if (s > t) {
			t += 24;
		}
		
		if (x >= s && x < t) {
			ans = "Yes";
		}
		
		System.out.println(ans);
		
		
	}

}

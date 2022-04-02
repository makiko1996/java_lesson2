package jp.practice.javastudy;

import java.util.Scanner;

public class abc238a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double jadge = 2;
		int N = n * n;
		
		for (int i = 1; i < n; i++) {
			jadge = jadge * 2;
		}
		
		if (jadge > N) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}

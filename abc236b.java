package jp.practice.javastudy;

import java.util.Scanner;

public class abc236b {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ans = 0;
		int sum = 0;
		
		for (int i = 1; i <= N * 4 - 1; i++) {
			ans += scan.nextInt();
		}
		
		for (int i = 1; i <= N; i++) {
			sum += i*4;
		}
		
		System.out.println(sum-ans);
	}

}

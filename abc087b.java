package jp.practice.javastudy;

import java.util.Scanner;

public class abc087b {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();

		int count = 0;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					int total = 500 * i + 100 * j + 50 * k;
					if (total == x) {
						count++;
					}
				}
			}

		}
		System.out.println(count);
	}
}

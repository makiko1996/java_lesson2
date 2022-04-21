package jp.practice.javastudy;

import java.util.Scanner;

public class abc229b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();

		while (true) {
			if (a == 0 || b == 0) {
				break;
			}
			if (a % 10 + b % 10 >= 10) {
				System.out.println("Hard");
				return;
			}

			a = a / 10;
			b = b / 10;

		}
		System.out.println("Easy");

	}

}

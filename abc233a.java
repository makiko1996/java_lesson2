package jp.practice.javastudy;

import java.util.Scanner;

public class abc233a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double x = scan.nextInt();
		double y = scan.nextInt();

		double ans = Math.ceil((y - x) / 10);
		
		if (ans > 0) {
			System.out.println((int) ans);
		} else {
			System.out.println(0);
		}

	}

}

package jp.practice.javastudy;

import java.util.Scanner;

public class abc230a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if (n >= 42)
			n++;

		System.out.println("AGC" + String.format("%03d", n));
	}

}

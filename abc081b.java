package jp.practice.javastudy;

import java.util.Scanner;

public class abc081b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		boolean roop = true;
		int count = 0;

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		while (roop == true) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					a[i] /= 2;
				} else {
					roop = false;
				}
			}
			count++;
		}
		System.out.println(count-1);

	}

}

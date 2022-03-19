package jp.practice.javastudy;

import java.util.Scanner;

public class abc006b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] n = new int[N + 3];
		n[3] = 1;

		for (int i = 4; i <= N; i++) {
			n[i] = n[i - 1] + n[i - 2] + n[i - 3];
			n[i] %= 10007;
		}

		System.out.println(n[N]);

	}

}

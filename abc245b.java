package jp.practice.javastudy;

import java.util.Scanner;

public class abc245b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] H = new int[N];

		for (int i = 0; i < N; i++) {
			H[i] = scan.nextInt();
		}

		int ans = H[0];
		for (int i = 0; i < N - 1; i++) {
			if (H[i] >= H[i + 1]) {
				break;
			} else {
				ans = H[i + 1];
			}
		}

		System.out.println(ans);
	}
}

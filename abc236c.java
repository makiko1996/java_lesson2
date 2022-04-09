package jp.practice.javastudy;

import java.util.Scanner;

public class abc236c {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		String[] S = new String[N];
		String[] T = new String[M];
		String[] ans = new String[N];

		for (int i = 0; i < N; i++) {
			S[i] = scan.next();
		}

		for (int i = 0; i < M; i++) {
			T[i] = scan.next();
		}

		int j = 0;
		for (int i = 0; i < N; i++) {
			if (S[i].equals(T[j])) {
				ans[i] = "Yes";
				j++;
			} else {
				ans[i] = "No";
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(ans[i]);
		}

	}
}

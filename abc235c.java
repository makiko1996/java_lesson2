package jp.practice.javastudy;

import java.util.Scanner;

public class abc235c {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}

		int[] x = new int[Q];
		int[] k = new int[Q];

		for (int i = 0; i < Q; i++) {
			x[i] = scan.nextInt();
			k[i] = scan.nextInt();
		}

		int[] ans = new int[Q];
		int count = 0;
		
		//何個めの質問か
		for (int i = 0; i < Q; i++) {
			count = 0;
			ans[i] = -1;
//			a配列の何個めと照らし合わせているか
			for (int l = 0; l < N; l++) {
				if (x[i] == a[l]) {
					count++;
						if(k[i] == count) {
							ans[i] = l + 1;
							break;
						}

				}

			}

		}
		for (int i = 0; i < Q; i++) {
			System.out.println(ans[i]);
		}

	}
}

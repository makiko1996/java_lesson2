package jp.practice.javastudy;

import java.util.Scanner;

public class abc243b {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		int ans1 = 0;
		int ans2 = 0;
		
		for (int ai = 0; ai < N; ai++) {
			A[ai] = scan.nextInt();
		}
		
		for (int bi = 0; bi < N; bi++) {
			B[bi] = scan.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			if (A[i] == B[i]) {
				ans1++;
			}
		}
		int[] C = new int[N * 2];
		System.arraycopy(A, 0, C, 0, N);
		System.arraycopy(B, 0, C, N, N);
		
		for (int j = 0; j < N * 2 - 1; j++) {
			for (int k = j + 1; k < N * 2; k++) {
				if (C[j] == C[k]) {
					ans2++;
				}
			}
		}
		System.out.println(ans1);
		System.out.println(ans2-ans1);
	}

}

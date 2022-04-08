package jp.practice.javastudy;

import java.util.Scanner;

public class abc236c {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		String[] S = new String[N];
		String[] T = new String[M];
		
		for (int i = 0; i < N; i ++) {
			S[i] = scan.next();
		}
		
		for (int i = 0; i < M; i ++) {
			T[i] = scan.next();
		}
		
//		始発
		System.out.println("Yes");
		for (int i = 1; i < N - 1; i++) {
			for (int j = 1; j < M - 1; j++) {
				if (S[i].equals(T[j])) {
					System.out.println("Yes");
					break;
				}
				
				if (j == M - 2) {
					System.out.println("No");
				}
				
			}
		}
//		終点
		System.out.println("Yes");
		
	}
}

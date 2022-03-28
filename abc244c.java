package jp.practice.javastudy;

import java.util.Scanner;

public class abc244c {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		boolean[] used = new boolean[2 * N + 2];
		
		// 0:me 1:pc
		int turn = 0;
		
		while (true) {
			if (turn == 0) {
				for (int i = 1; i <= 2 * N + 2; i++) {
					if (!used[i]) { //未使用の数値だったら（false）
						System.out.println(i);
						used[i] = true;
						break;
					}
				}
			} else {
					int pc = scan.nextInt();
					if (pc == 0) {
						break;
					} else {
						used[pc] = true;
					}
					}
				turn ^= 1;
			}
		scan.close();

		}

}


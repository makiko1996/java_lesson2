package jp.practice.javastudy;

import java.util.Scanner;

public class abc237b {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt(); //gyo
		int W = scan.nextInt(); //retu
		
		int[][] A = new int [H][W];
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				System.out.print(A[j][i] + " ");
			}
			System.out.println();
		}
	}

}

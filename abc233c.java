// 未完成
package jp.practice.javastudy;

import java.util.Scanner;

public class abc233c {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[][] l = new int[n][];
		
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			l[i] = new int[a];
			for (int j = 0; j < a; j++) {
				l[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		int num = 0;
		int aSize = l[0].length;
		
//		初めの配列の数値を取得
		for (int i = 0; i < aSize; i++) {
			num = l[0][i];
//			xをオーバーしていないか確認
			if (num <= x) {
//				袋の数繰り返すためのfor文
				for (int j = 1; i < n; j++) {
					int jSize = l[j].length;
//					袋の中の数を取得
					for (int k = 0; k < jSize; k++) {
						num += l[j][k];
					}
				}
			}
		}
	}

}

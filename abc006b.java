package jp.practice.javastudy;

import java.util.*;

public class abc006b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		if (n > 2) {
			list[2] = 1;
		}
		int ans = 0;

		for (int i = 3; i < n; i++) {
			list[i] = (list[i - 1] + list[i - 2] + list[i - 3]) % 10007;
		}
		
		System.out.println(list[n-1]);
		
	}

}

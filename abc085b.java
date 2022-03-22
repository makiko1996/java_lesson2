package jp.practice.javastudy;

import java.util.*;

public class abc085b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Set<Integer> d = new HashSet<Integer>();

		for (int i = 1; i <= n; i++) {
			d.add(scan.nextInt());
		}

		System.out.println(d.size());

	}

}

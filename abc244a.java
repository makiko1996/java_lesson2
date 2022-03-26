package jp.practice.javastudy;

import java.util.Scanner;

public class abc244a {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();

		String ans = S.substring(N - 1);
		System.out.println(ans);

	}

}

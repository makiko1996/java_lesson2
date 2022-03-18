package jp.practice.javastudy;

import java.util.Scanner;

public class Haiku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String ans = s.replace(",", " ");

		System.out.println(ans);

	}

}

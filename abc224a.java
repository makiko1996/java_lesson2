package jp.practice.javastudy;

import java.util.Scanner;

public class abc224a {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		
		if (S.substring(S.length() - 2).equals("er")) {
			System.out.println("er");
		} else if (S.substring(S.length() - 3).equals("ist")) {
			System.out.println("ist");
		}

	}

}

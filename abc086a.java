package jp.practice.javastudy;

import java.util.Scanner;

public class abc086a {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int sum = num1 * num2;

		if (sum % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}

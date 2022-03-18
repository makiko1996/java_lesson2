package jp.practice.javastudy;

import java.util.Scanner;

public class SomeOfThreeIntegers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int s = scan.nextInt();

		int count = 0;

		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= k; y++) {
				for (int z = 0; z <= k; z++) {
					if (s == x + y + z) {
						count += 1;
					}
				}
			}
		}

		System.out.println(count);

	}

}

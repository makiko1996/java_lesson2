package jp.practice.javastudy;

import java.util.Scanner;
import java.util.Arrays;

public class abc237c {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int size = S.length();
		int a1 = 0;
		int a2 = 0;
		String ans;

		if (S.substring(size - 1).equals("a")) {
			for (int i = size; i > 0; i--) {
				if (S.substring(i - 1, i).equals("a"))
					a2++;
				else
					break;
			}
		}
		if (a2 == size)
			ans = "Yes";

		for (int i = 0; i < size; i++) {
			if (S.substring(i, i + 1).equals("a"))
				a1++;
			else
				break;
		}

		if (a2 < a1)
			ans = "No";
		else
			ans = "Yes";

		for (int i = a1; i < size - a2; i++) {
			if (!S.substring(i, i + 1).equals(S.substring(a1 + size - a2 - i - 1, a1 + size - a2 - i))) {
				ans = "No";
				break;
			}
		}

		System.out.println(ans);
	}

}

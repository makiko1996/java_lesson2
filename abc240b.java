package jp.practice.javastudy;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class abc240b {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Set<Integer> a = new HashSet<Integer>();

		for (int i = 0; i < N; i++) {
			a.add(scan.nextInt());
		}

		System.out.println(a.size());
	}

}

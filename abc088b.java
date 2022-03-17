package jp.practice.javastudy;

import java.util.*;

public class abc088b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int alice = 0;
		int bob = 0;
		Integer a[] = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a, Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				alice += a[i];
			} else {
				bob += i;
			}
		}
		
		System.out.println(alice);
		System.out.println(bob);

	}
	

}

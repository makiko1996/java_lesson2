package jp.practice.javastudy;

import java.util.Scanner;

public class abc083b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int count = 0;
		
		for (int i=1; i<=n; i++) {
			int sum = sum(i);
			if (sum >= a && sum <= b) {
				count += i;
			}
		}
		
		System.out.println(count);

	}
	
	public static int sum(int i) {
		int sum = 0;
		
		while(i > 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}

}

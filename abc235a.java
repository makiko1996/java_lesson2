package jp.practice.javastudy;

import java.util.Scanner;

public class abc235a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int a = num / 100;
		int b = (num / 10) % 10;
		int c = num % 10;
		
		int sum = a + b + c;
		
		System.out.println(sum * 100 + sum * 10 + sum);
	}

}

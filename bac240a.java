package jp.practice.javastudy;

import java.util.Scanner;

public class bac240a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (b - a == 1 || b - a == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

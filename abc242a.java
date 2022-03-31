package jp.practice.javastudy;

import java.util.Scanner;

public class abc242a {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextInt();
		double B = scan.nextInt();
		double C = scan.nextInt();
		int X = scan.nextInt();
		
		double ans = 0.000000000000;
		
		if (X <= A) {
			ans = 1.000000000000;
			System.out.println(String.format("%.12f", ans));
		} else if (X > A && X <= B){
			ans = C / (1000 - B - A);
			System.out.println(String.format("%.12f", ans));
		} else {
			System.out.println(String.format("%.12f", ans));
		}
		
	}
}

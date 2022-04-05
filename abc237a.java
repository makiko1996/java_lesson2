package jp.practice.javastudy;

import java.util.Scanner;

public class abc237a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		double min = Math.pow(-2, 31);
		double max = Math.pow(2, 31);
		
		if (N >= min && N < max) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}

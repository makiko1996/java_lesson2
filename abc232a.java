package jp.practice.javastudy;

import java.util.Scanner;

public class abc232a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] S = s.split("x");
		
		System.out.println(Integer.parseInt(S[0]) * Integer.parseInt(S[1]));
	}

}

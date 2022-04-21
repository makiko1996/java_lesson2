package jp.practice.javastudy;

import java.util.Scanner;

public class abc229a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		
		String str = s1 + s2;
		
		String ans = "Yes";
		
		
		if(str.equals("#..#") || str.equals(".##.")) {
			ans = "No";
		}
		
		System.out.println(ans);
	}

}

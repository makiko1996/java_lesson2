package jp.practice.javastudy;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class abc240b2 {
	public static void main(System[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		Set<Integer> a = new HashSet<Integer>();
		a.add(scan.nextInt());
		
		System.out.println(a);
		
	}
}
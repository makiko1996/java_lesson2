package jp.practice.javastudy;

import java.util.Scanner;

public class abc243a {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int V = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		while (true) {
			if (V < A) {
				System.out.println("F");
				return;
			} 
			V -= A;
			if (V < B) {
				System.out.println("M");
				return;
			}
			V -= B;
			if (V < C) {
				System.out.println("T");
				return;
			}
			
			V -= C;
		}

	}

}

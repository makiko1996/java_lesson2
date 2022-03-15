package jp.practice.javastudy;

import java.util.Scanner;

public class abc081a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		int count = 0;
		
		String numArray[] = num.split("");
		for (String n: numArray) {
			if (n.equals("1")) {
				count ++;
			}
		}
		
		System.out.println(count);
		
		
		

	}

}

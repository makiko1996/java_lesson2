package jp.practice.javastudy;

import java.util.Scanner;
import java.util.*;

public class abc230b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		String n = String.join("", Collections.nCopies((int) Math.pow(10, 5), "xxo"));
		
		if(n.matches(".*" + s + ".*")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

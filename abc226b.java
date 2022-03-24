package jp.practice.javastudy;

import java.util.*;

public class abc226b {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < N+1; i++) {
			set.add(scan.nextLine());
		}
		
		System.out.println(set.size() - 1);

		
		
	}

}

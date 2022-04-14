package jp.practice.javastudy;

import java.util.Scanner;
import java.util.Arrays;

public class abc231c {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int[] height = new int[n];
		int[] question = new int[q];

		for (int i = 0; i < n; i++) {
			height[i] = scan.nextInt();
		}

		for (int i = 0; i < q; i++) {
			question[i] = scan.nextInt();
		}
		
		Arrays.sort(height);
		int[] count = new int[q] ;
		
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++) {
				if (height[j] >= question[i]) {
					count[i] = n - j;
					break;
				}
			}
		}
		for (int i = 0; i < q; i++) {
			System.out.println(count[i]);
		}
//
//		int[] count = new int[q];
//
//		for (int i = 0; i < q; i++) {
//			for (int j = 0; j < n; j++) {
//				if (height[j] >= question[i]) {
//					count[i]++;
//				}
//			}
//		}
//
//		for (int i = 0; i < q; i++) {
//			System.out.println(count[i]);
//		}
	}

}

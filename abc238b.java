package jp.practice.javastudy;

import java.util.Scanner;
import java.util.Arrays;

public class abc238b {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] N = new int[scan.nextInt()];
		int[] angles = new int[N.length + 1];
		angles[0] = 0;
		int angle = 0;

		for (int i = 0; i < N.length; i++) {
			N[i] = scan.nextInt();
		}

		for (int j = 1; j <= N.length; j++) {
			angle += N[j-1];
			if (angle >= 360) {
				angle -= 360;
				angles[j] = angle;
			} else {
				angles[j] = angle;
			}
		}
		Arrays.sort(angles);

		int difference = 0;
		for (int k = 1; k < N.length + 1; k++) {
			int tmp = 0;
			tmp = angles[k] - angles[k - 1];
			if (tmp > difference) {
				difference = tmp;
			}
		}
		
		if (difference >= 360 - angles[N.length]) {
			System.out.println(difference);
		} else {
			System.out.println(360 - angles[N.length]);
		}

		

	}

}

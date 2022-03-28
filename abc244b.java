package jp.practice.javastudy;

import java.util.Scanner;

public class abc244b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String t = scan.next();
		String direction = "E";
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < n; i++) {
			String T = t.substring(i, i + 1);
			if (T.equals("S")) {
				switch(direction) {
					case "N":
						y++;
						break;
					case "E":
						x++;
						break;
					case "S":
						y--;
						break;
					case "W":
						x--;
						break;
				}
			} else if (T.equals("R")){
				switch(direction) {
					case "N":
						direction = "E";
						break;
					case "E":
						direction = "S";
						break;
					case "S":
						direction = "W";
						break;
					case "W":
						direction = "N";
						break;
				}
				
			}
		}
		
		System.out.println(x + " " + y);

	}

}

package jp.practice.javastudy;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class abc242b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		List <String> list = new ArrayList<String>();
		
		for (int i = 0; i < S.length(); i++) {
			list.add(S.substring(i, i + 1));
			Collections.sort(list);
		}
		
		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j));
		}
		
		

	}

}

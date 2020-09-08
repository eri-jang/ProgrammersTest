package com.test.pro.level1;

import java.util.Scanner;

public class KakaoFailture_rate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] stages = new int[10];
		for(int i = 0; i < stages.length; i++) {
			stages[i] = sc.nextInt();
		}
		for(int i = 0; i < stages.length; i++) {
			
			System.out.print(stages[i] + ",");
		}
	}

}

package com.test.pro.level1;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] irr = new int[100];
		
		for(int i = 2; i <= n; i++) {
			irr[i] = i;
		}
		
		for(int i = 2; i <= n; i++) {
			if(irr[i] == 0) {
				continue;
			} else {
				for(int j = 2*i; j <= n; j+=i) {
					irr[j] = 0;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if(irr[i] != 0) {
				System.out.println("irr:" + irr[i]);
			}
		}
	}
}

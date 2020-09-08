package com.test.pro.level1;

import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long answer = 0;
		double x = 0.0;
		double y = 0.0;
		boolean flag = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				flag = false;
				answer = -1;
			} else {
				flag = true;
				x = Math.sqrt(n);
				answer = (long)Math.pow(x + 1, 2);
			}
		}
		System.out.println("answer:" + answer);
		System.out.println("x:" + x);
				
		
	}

}

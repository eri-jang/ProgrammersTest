package com.test.pro.level1;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		boolean flag = true;
		
		
		for(int i = 2; i <= n; i++) {
			flag = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = false;
				} 
			}
			if(flag == true) {
				answer++;
			}
		}
		System.out.println("answer:" + answer);
				
		
	}

}

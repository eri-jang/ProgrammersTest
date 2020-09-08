package com.test.pro.level1;

import java.util.ArrayList;
import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		//에라토스테네스의 체//
		ArrayList<Boolean> list;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//n이 1이거나 1보다 작을 때 종료
		if(n <= 1) 
			return;
		
		//n+1만큼 리스트 할당
		list = new ArrayList<Boolean>(n+1);
		
		//0번째와 1번째를 소수 아님으로 처리한다. (0, 1 은 소수가 아님)
		list.add(false);
		list.add(false);
		
		//2~n 까지 소수로 설정
		for(int i = 2; i <= n; i++) {
			list.add(i, true);
		}
		
		//2부터 i*i <=n 까지 가각의 배수들을 지워나간다.
		for(int i = 2; (i * i) <= n; i++) {
			if(list.get(i)) {
				for(int j = i*i; j <= n; j += i) {
					list.set(j, false);
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(int i = 0; i <= n; i++) {
			if(list.get(i) == true) {
				sb.append(i);
				sb.append(",");
				
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		System.out.println(sb.toString());
	}
}

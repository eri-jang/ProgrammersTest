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
		System.out.println();
		
		int totalUser = stages.length;
		System.out.println("total :" + totalUser);
	}
	
	
	//실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 
	class Solution{
		public int[] solution(int N, int[]stages) {
			int[] answer = {};
			return answer;
		}
	}

}

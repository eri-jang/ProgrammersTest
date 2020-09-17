package com.test.pro.level1;

import java.util.Scanner;

public class FindMiddle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Solution sol = new Solution();
		String result = sol.solution(s);
		System.out.println("result: " + result);
		
		Solution2 sol2 = new Solution2();
		String result2 = sol2.solution(s);
		System.out.println("result2 : " + result2);
	}

}

//abcde	c
//qwer	we
	class Solution {
		public String solution(String s) {
			String answer = "";
			int len = s.length();
			
			String[]srr = new String[len];
			srr = s.split("");
			
			if(len % 2 == 0) {
				answer = srr[len/2 - 1] + srr[len/2];
				
			} else if(len % 2 != 0){
				answer = srr[len/2];
			}
			
			return answer;
		}
	}
	
	class Solution2 {
		public String solution(String s) {
			return s.substring((s.length()-1) / 2, s.length()/2 + 1); 
		}
	}

package com.test.pro.level1;


import java.util.Arrays;
import java.util.Scanner;

public class KakaoFailture_rate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] stages = new int[8];
		for(int i = 0; i < stages.length; i++) {
			stages[i] = sc.nextInt();
		}
		
		for(int i = 0; i < stages.length; i++) {
			System.out.print(stages[i] + ",");
		}
		System.out.println();
		
		
		
		
		//21262433
		int totalUser = stages.length;
		System.out.println("totalUser:" + totalUser);
		Arrays.sort(stages);
		
		for(int i = 0; i < stages.length; i++) {
			System.out.print(stages[i] + ",");
		}
		
		System.out.println();
		
		for(int i = 0; i < stages.length; i++) {
			int ctn = 0;
			for(int j = 1; j < stages.length; j++) {
				if(stages[i] == stages[j]) {
					ctn++;
				}
			}
			System.out.println("stage: " + stages[i] + " ctn: " + ctn);
			
		}
		double[] failture = new double [totalUser];
		
		
		
//		for(int i = 0; i < stages.length; i++) {
//			failture[i] = stages[i] / totalUser;
//		}
//		Arrays.parallelSort(failture);
//		for(int i = 0; i < failture.length; i++) {
//			System.out.print(failture[i] + ",");
//			
//		}
	
////		int[] answer = {};
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int t = Integer.parseInt(br.readLine());
//		
//		for(int i = 1; i <= t; i++) {
//			String num = br.readLine();
//			String []nrr = num.split(" ");
//			
//			int a = Integer.parseInt(nrr[0]);
//			int b = Integer.parseInt(nrr[1]);
//			
//			int sum = a + b;
//	
//			bw.write("Case #" + i + ": " + sum + "\n");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
//		
//	}
//	
	
	
	
	
	
	
	
	//실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 
//	class Solution{
//		public int[] solution(int N, int[]stages) {
//			int totalUser = stages.length;
//			System.out.println("totalUserNumber:" + totalUser);
//			Arrays.sort(stages);
//			
//			int[] failture = new int [totalUser];
//			
//			for(int i = 0; i < stages.length; i++) {
//				failture[i] = stages[i] / totalUser;
//			}
//			Arrays.parallelSort(failture);
//			for(int i = 0; i < failture.length; i++) {
//				System.out.println(failture[i] + ",");
//				
//			}
//			
//			int[] answer = {};
//			return answer;
//		}
//	}

}

package com.test.pro.level1;

import java.util.ArrayList;
import java.util.Collections;

public class codeMonth1 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		Solution3 sol = new Solution3();
		
		int[] result = sol.solution(numbers);
		for(int i = 0;  i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
	}

}

//[2,1,3,4,1]	[2,3,4,5,6,7]
//[5,0,2,7]	[2,5,7,9,12]
class Solution3 {
	
    public int[] solution(int[] numbers) {
    	int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
//        Arrays.sort(numbers);
        
        for(int i = 0; i < numbers.length -1; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		int sum = numbers[i] + numbers[j];
        		if(!list.contains(sum)) {
        			list.add(sum);
        			
        		}
        	}
        }
        Collections.sort(list);
//        for(int i = 0; i < list.size(); i++) {
//        	System.out.print(list.get(i) + ",");
//        }
//
//        //list의 중복 제거
//        TreeSet<Integer> tset = new TreeSet<Integer>(list);
//        ArrayList<Integer> list2 = new ArrayList<Integer>(tset);
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}

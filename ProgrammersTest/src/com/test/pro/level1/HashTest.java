package com.test.pro.level1;

import java.util.HashMap;
import java.util.Iterator;

public class HashTest {

	public static void main(String[] args) {
//	String[] participant = {"mislav", "stanko", "mislav", "ana"};
//	String[] completion = {"stanko", "mislav", "ana"};
	
	String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
	String[] completion = {"marina", "josipa", "nikola", "filipa"};
	
	Solution4 sol = new Solution4();
	String result = sol.solution(participant, completion);
	System.out.println("result: " + result);
	}

}

class Solution4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        
        for(int i = 0; i < participant.length; i++) {
        	if(hmap.containsKey(participant[i])) {
        		int val = hmap.get(participant[i]);//i번째 value 꺼내오기
        		hmap.replace(participant[i], val + 1); //중복으로 들어올 경우 val +1 해줌
        	} else {
        		hmap.put(participant[i], 1);
        		
        	}
        }
        for(int i = 0; i < completion.length; i++) {
        	if(hmap.containsKey(completion[i])) {
        		int val = hmap.get(completion[i]); //i번째 완주자의 val
        		if(val == 1) {
        			hmap.remove(completion[i]);
        		}else if(val > 1) {
        			hmap.replace(completion[i], val -1);
        		}else {
        			answer = completion[i];
        		}
        	}
        }
        
        Iterator keyIter = hmap.keySet().iterator();

	      while(keyIter.hasNext()){
	      	String key = (String) keyIter.next();
	      	int value = hmap.get(key);
	      	answer = key;
	      }
      
        
        return answer;
    }
}

//다른 풀이
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }
//}
package javaex.codingtest;

import java.util.Arrays;
import java.util.Comparator;

public class MaxValue {

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        Solution sol = new Solution();
        String maxvalue = sol.solution(numbers);
        System.out.println(maxvalue);
    }
}

class Solution {
    public String solution(int[] numbers) {
        //Int형 배열을 String 배열로 바꾸기
        String[] intToString = new String[numbers.length];
        int idx = 0;
        for(int i : numbers){
            intToString[idx++] = String.valueOf(i);
        }

        // 두 수를 붙여보고 더 큰 값을 기준으로 내림차순 정렬
        Arrays.sort(intToString, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });

        // array를 string으로 합치기
//        String answer = String.join("", intToString);
//        return answer;
        return String.join("", intToString);
    }

}

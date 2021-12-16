package javaex.datastructure.fourth.hw;

import java.util.Arrays;

public class MinNum {

    public static void main(String[] args) {
        startMinNum();
    }

    private static void startMinNum(){
        char charArr[] = new char[4];   // int -> str 해준 요소들 넣을 배열
        for(int i=1000; i<= 9999; i++){
            String str = String.valueOf(i);   // int -> str
            for(int j=0; j<4; j++){
                charArr[j] = str.charAt(j);   // str의 각각 요소들을 char로 배열 저장
//                System.out.print(charArr[j]);
            }
            System.out.println();
            Arrays.sort(charArr);   // char 배열 sorting
            if(charArr[0]=='0'){    // 첫 글자만 0인 경우
                char temp = charArr[0];
                charArr[0] = charArr[1];
                charArr[1] = temp;
            }
            if(charArr[0]=='0'&&charArr[1]=='0'){  // 1, 2번째 둘 다 0인 경우
                char temp = charArr[0];
                charArr[0] = charArr[2];
                charArr[2] = temp;
            }
            if(charArr[0]=='0'&&charArr[1]=='0'&&charArr[2]=='0'){  // 1,2,3 셋 다 0인 경우
                char temp = charArr[0];
                charArr[0] = charArr[3];
                charArr[3] = temp;
            }
            String resultNum = String.valueOf(charArr);
            System.out.printf("%s  %s %n", str, resultNum);
        }
    }
}

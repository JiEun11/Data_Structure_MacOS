package javaex.datastructure.fourth.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStepString {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int left = 0;  //문자열 맨 앞
        int right = input.length()-1 ; //문자열 맨 뒤

        while(true){
            if(left > right){
                break;
            }else{
                System.out.print(input.charAt(left++));
                System.out.print(input.charAt(right--));
            }

        }
    }
}

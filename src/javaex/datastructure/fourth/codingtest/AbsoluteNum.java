package javaex.datastructure.fourth.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class AbsoluteNum {

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();  // 입력받을 수
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int su = Integer.parseInt(input);

        if(0 <= su){
            System.out.println(su);
        }else{
            System.out.println(su*-1);
        }

    }
}

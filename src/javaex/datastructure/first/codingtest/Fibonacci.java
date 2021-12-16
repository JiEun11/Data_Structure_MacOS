package javaex.datastructure.first.codingtest;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("피보나치 수열.");
        System.out.println("몇 항까지 더할까요? 수를 입력하세요.(1이상 30이하)");
        Scanner sc = new Scanner(System.in);

        int arrFib[] = new int[31];
        arrFib[0]=1; //0제외 1부터 시작
        arrFib[1]=1;
        int sum=0; // 더한 값을 저장하는 변수
        int num = sc.nextInt() -1;
        for(int j=2; j<30; j++){
            arrFib[j] = arrFib[j-1] + arrFib[j-2];
        }

        for(int i=0; i<=num ; i++){
            sum += arrFib[i];
            System.out.print(arrFib[i]+ " ");
        }
        System.out.print(" = ");
        System.out.println(sum);
    }
}

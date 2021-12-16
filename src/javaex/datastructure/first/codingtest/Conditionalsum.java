package javaex.datastructure.first.codingtest;

import java.util.Scanner;

public class Conditionalsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력하세요.");
        int arrlength = sc.nextInt();
        int arr[] = new int[arrlength];
        System.out.println("배열 값을 입력하세요.");
        for(int i=0; i<arrlength; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("합을 원하는 구간을 입력하세요.");
        int front = sc.nextInt();
        int rear = sc.nextInt();
        int sum = 0;
        for(int i = front-1; i < rear; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

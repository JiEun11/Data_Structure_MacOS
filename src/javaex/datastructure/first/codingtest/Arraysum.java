package javaex.datastructure.first.codingtest;

import java.util.Scanner;

public class Arraysum {
    private int []arr;

    public Arraysum(int num) {
        arr = new int[num];
    }

    public void input(){
        for(int i=0; i< arr.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println(arr.length-i+" 개의 수를 입력하세요.");
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.println("배열 두 개의 길이를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        Arraysum as1 = new Arraysum(sc.nextInt());
        Arraysum as2 = new Arraysum(sc.nextInt());

        as1.input();

        as2.input();
        Arraysum as3 = new Arraysum(as1.arr.length+as2.arr.length);
        System.out.println(as3.arr.length);

    }
}


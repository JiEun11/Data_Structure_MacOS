package javaex.datastructure.second.thread;

import sun.java2d.loops.TransformHelper;

public class ThreadTest extends Thread{

    private int []arr;

    public ThreadTest(){
        arr = new int[4];

        for(int i=0 ; i<arr.length; i++){
            arr[i] = i;
        }
    }

    public void run(){
        for(int i=0; i<arr.length; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        tt.start();
    }

}

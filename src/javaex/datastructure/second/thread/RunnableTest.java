package javaex.datastructure.second.thread;

import static java.lang.Thread.sleep;

public class RunnableTest implements Runnable{
    private int []arr;

    public RunnableTest(){
        arr = new int[4];

        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
    }

    @Override
    public void run() {
        for(int i=0; i<arr.length; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        RunnableTest rt = new RunnableTest();
        Thread th = new Thread(rt);
        th.start();
    }
}

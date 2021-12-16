package javaex.datastructure.third.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maxnum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arrsize = br.readLine();  // array size
        int arr[] = new int[Integer.parseInt(arrsize)]; //string array

        int idx = 0;
        String input = br.readLine();
        for(String str : input.split(" ")){  // 배열에 값 넣음
            arr[idx++] = Integer.parseInt(str);
        }

        int max = arr[0];
        int maxidx = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                maxidx=i;
            }
        }
        System.out.printf("%d %d",max, maxidx+1);
    }
}

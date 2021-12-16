package javaex.datastructure.third.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilpString {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int idx = 0; // array index count
        String arr[] = new String[input.length()];
        for(String str : input.split("")){
            arr[idx++] = str;
        }

        String arrflip[] = new String[input.length()];
        for(String flip : arr) {
            arrflip[--idx] = flip;
        }

        for(String str : arrflip){
            System.out.print(str);
        }
    }
}

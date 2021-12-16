package javaex.datastructure.fourth.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNum {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String check = "True";
        int su = Integer.parseInt(input);
        for(int i=2; i*i<=su; i++){
            if(su%i==0){
                check = "False";
            }
        }
        System.out.println(check);
    }
}

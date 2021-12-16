package javaex.datastructure.second.codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aliquot {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int aliquot = Integer.parseInt(input);
        int sum = 0;

        for(int i=1 ; i<=aliquot; i++){
            if(aliquot%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}

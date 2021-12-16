package javaex.datastructure.fourth.hw;

import java.util.Scanner;

public class OrganizedNum {

    public static void main(String[] args) {
        startOrganizedNum();
    }

    private static void startOrganizedNum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1st Number: ");
        int x = sc.nextInt();

        System.out.print("Input 2nd Number: ");
        int y = sc.nextInt();

        int cnt = 0;
        boolean check = true;
        for (int i = x; i <= y; i++) {
            String number = String.valueOf(i);
            for(int j=0; i<number.length()-1; j++){
                if(number.charAt(j)>=number.charAt(j+1)){
                    check = false;
                }
            }
            if (check) {
                System.out.print(number + " ");
                cnt++;
            }
        }
        System.out.println("\nCount: " + cnt);
    }
}




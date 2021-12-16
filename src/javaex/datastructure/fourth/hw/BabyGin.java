//package javaex.datastructure.fourth.hw;
//
//import javax.lang.model.type.IntersectionType;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class BabyGin {
//
//    public static void main(String[] args) {
////        startBabyGin();
//    }
//
//    private static void startBabyGin() throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            boolean run = false, triplete = false;
//            System.out.print("Input 6 Numbers: ");
//            String numbers = sc.next();
//            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//            String input = br.readLine();
//
////            int countArr[] = new int[12];
//            int countArr[] = new int[6];
//            int i=0;
//            for(int nums : Integer.parseInt(input.split(" "))){
//                countArr[i] = nums;
//            }
//
//            int tripCnt = 0, runCnt = 0, runCnt2 = 0;
//            for(int i = 0; i < countArr.length; i++){
//                countArr[numbers.charAt(i) - '0']++;
//            }
//
//            for(int i = 0; i < countArr.length; i++){
//                if(countArr[i]==6){      //triplete check
//                    countArr[i] -= 6;
//                    tripCnt=2;
//                }else if(countArr[i] >= 3){
//                    countArr[i] -= 3;
//                    tripCnt++;
//                }
//
//                if(countArr[i] ==1 && countArr[i+1] == 1 && countArr[i+2]==1){
//                    runCnt++;
//                }else if(countArr[i] ==2 && countArr[i+1] == 2 && countArr[i+2]==2){
//                    runCnt2++;
//                }
//            }
//            if (runCnt >= 2 || tripCnt >= 2 || runCnt + tripCnt >= 2 || runCnt2 == 1) {
//                System.out.println("Baby Gin !!!");
//            }
//            else {
//                System.out.println("Lose");
//            }
//
//            System.out.println("Play the game again? <1-yes/2-no> :");
//            int restart = sc.nextInt();
//            if(restart == 2) break;
//        }
//    }
//
//    /*연속된 수를 갖는 run인지 확인*/
//    private static void checkRun(){
//
//    }
//
//    /*동일한 번호를 갖는 triplete인지 확인*/
//    private static void checkTriplete(){
//
//    }
//}

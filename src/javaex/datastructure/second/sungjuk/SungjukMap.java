package javaex.datastructure.second.sungjuk;

import java.util.HashMap;
import java.util.Scanner;

public class SungjukMap {
    static int num; // 학생 명수 받을 사용자 값
    private HashMap<String,Student> stu; // Student 객체 타입의 ArrayList인 stu 선언

    public SungjukMap(int numStudent) { // 사용자 생성자로 ArrayList 용량 정의

        stu = new HashMap<String,Student>(numStudent); // Student 객체 타입의 ArrayList Heap 메모리에 올림.

    }

    public void input() {
        Scanner sc = new Scanner(System.in); // for문안에 X

        for (int i = 0; i < num; i++) {

            System.out.print("이름을 입력하세요: ");
            String name = sc.next();

            System.out.print("국어 점수를 입력하세요: ");

            int kor = sc.nextInt(); // 국어 점수 입력

            System.out.print("영어 점수를 입력하세요: ");

            int eng = sc.nextInt(); // 영어 점수 입력

            System.out.print("수학 점수를 입력하세요: ");

            int math = sc.nextInt(); // 수학 점수 입력

            stu.put(name, new Student(name, kor, eng, math));
//            System.out.println(stu);
        }
    }

//학생 이름 입력 시 성적 조회

    public void search() {

        System.out.println("학생 이름을 입력하세요. 예)김지은");

        Scanner sc = new Scanner(System.in);

        String nameSearch = sc.next();

        for (String student : stu.keySet()) {

            if (student.equals(nameSearch)) {

                System.out.println("국어 점수: " + stu.get(student).getKor());

                System.out.println("영어 점수: " + stu.get(student).getEng());

                System.out.println("수학 점수: " + stu.get(student).getMath());

                System.out.println("합 계: " + stu.get(student).getTotal());

                System.out.println("평 균: " + stu.get(student).getAvg());

            }

        }
    }

//평균 50점 이상인 학생들 이름 출력

    public void searchAvg50() {

        for (String student : stu.keySet()) {

            if (stu.get(student).getAvg() >= 50) {

                System.out.println(student);

            }

        }

    }

//전체 목록 조회

    public void showInfo() {

//		for (int i = 0; i < stu.size(); i++) {
//
//			System.out.println(stu[i].toString());
//
//		}
        for (String student : stu.keySet()) {
            System.out.println(stu.get(student));
        }

    }

    // 원하는 학생 삭제
    public void deleteInfo() {
        System.out.print("삭제할 학생의 이름을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        for (String keys : stu.keySet()) {
            if (keys.equals(name)) {
                System.out.println(name+" 학생에 대한 정보가 삭제됩니다.");
                stu.remove(keys);
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------------------");

        System.out.println("------성적처리 프로그램-------");

        System.out.print("학생 수를 입력하세요: ");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        SungjukMap sj = new SungjukMap(num);

        sj.input();

        boolean stop = true;

        while (stop) {

            System.out.println("1.학생 성적 조회 | 2.평균 50점이상 학생 조회 | 3.전체 목록 조회 | 4.정보 삭제 | 5.프로그램 종료");

            int num = sc.nextInt();

            if (num == 1) {

                sj.search();

            } else if (num == 2) {

                sj.searchAvg50();

            } else if (num == 3) {

                sj.showInfo();

            } else if (num == 4) {

                sj.deleteInfo();

            } else if (num == 5) {

                System.out.println("프로그램이 종료됩니다.");

                stop = false;

            } else {
                System.out.println("숫자 1부터 5까지 중에 입력해주세요. ");
            }

        }

    }

}

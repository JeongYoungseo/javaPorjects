package chapter03;

import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("운전자 합격 조회 프로그램");
        //합격점수
        System.out.println("운전자 점수 입력: ");
        int score = s.nextInt();
        //입력받은 점수가 합격점인지 불합격점인지 평가
        //커트라인 70점
        String result = "";
        if (score >= 70){
            result = "합격";
        } else {
            result = "불합격";
        }
        //결과출력
        System.out.println(result + "입니다.");
    }
}

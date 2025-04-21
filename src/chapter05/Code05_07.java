package chapter05;

import java.util.Scanner;

public class Code05_07 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("***학점 프로그램***\n");
        System.out.print(" 성적 점수 입력: ");

        int score =s1.nextInt();
        String resultstr = "";

        if(score >= 90)
            resultstr = "A";
        else if(score >= 80)
            resultstr = "B";
        else if(score >= 70)
            resultstr = "C";
        else
            resultstr = "F";

        System.out.printf("%d점은 %s학점입니다.\n", score,resultstr);

        s1.close();
    }
}

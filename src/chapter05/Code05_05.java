package chapter05;

import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("*******홀수짝수 구분 프로그램********\n");

        System.out.print("정수란 입력: ");
        int num = s1.nextInt();
        String resultstr = "";

        if (num % 2 == 0)
            resultstr = "짝수";
        else
            resultstr = "홀수";

        System.out.printf("##결과: %d는 %s입니다.\n", num, resultstr);

    }
}

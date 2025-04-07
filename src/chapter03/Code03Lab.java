package chapter03;

import java.util.Scanner;

public class Code03Lab {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double pound = 0.453592;
        double kilogram = 2.204623;

        System.out.print("파운드를 입력하세요: ");
        int num1 = s.nextInt();
        double result = num1 * pound;
        System.out.printf("%d 파운드는 %.3f 입니다.\n", num1, result);

        System.out.println("킬로그램을 입력하세요: ");
        int num2 = s.nextInt();
        double result2 = num2 * kilogram;
        System.out.printf("%d 킬로그램은 %.3f 입니다.\n", num2, result2);

        s.close();


    }
}

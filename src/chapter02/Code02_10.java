package chapter02;

import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.print("정수값 입력1: ");
        int num1 = s1.nextInt();
        System.out.println("사용자 입력값: " + num1);

        System.out.print("실수값 입력2: ");
        double num2 = s1.nextDouble();
        System.out.println("사용자 입력값2: " + num2);

        System.out.print("성명 입력 3: ");
        String name = s2.nextLine();
        System.out.println("성명 입력값3: " + name);

        s1.close();
        s2.close();
    }
}

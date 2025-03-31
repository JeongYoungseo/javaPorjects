package chapter02;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("\n\n\n   단순 계산기   \n\n\n");
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 정수값 입력: ");
        int num1 = s.nextInt();
        System.out.println("두번째 정수값 입력: ");
        int num2 = s.nextInt();

        int resPlus, resMinus, resMultiply, resDivide, resModulus;
        resPlus = num1 + num2;
        resMinus = num1 - num2;
        resMultiply = num1 * num2;
        resDivide =- num1 / num2;
        resModulus = num1 % num2;

        System.out.printf("%d + %d = %d\n", num1, num2, resPlus);
        System.out.printf("%d - %d = %d\n", num1, num2, resMinus);
        System.out.printf("%d * %d = %d\n", num1, num2, resMultiply);
        System.out.printf("%d / %d = %d\n", num1, num2, resDivide);
//        System.out.printf("%d mod %d10 = %d\n", num1, num2, resModulus);
        System.out.println(num1 + " % " + num2 + "= " + resModulus);

        s.close();

    }
}

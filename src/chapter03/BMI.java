package chapter03;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("체중(kg)을 입력하세요: ");
        double kg = s.nextDouble();
        System.out.printf("키(cm)를 입력하세요: ");
        double cm = s.nextDouble();

       double bmi = kg / Math.pow(cm/100,2);
        System.out.printf("당신의 bmi 지수는 %.2f 입니다. \n",bmi);

        s.close();
    }
}

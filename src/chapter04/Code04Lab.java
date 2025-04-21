package chapter04;

import java.util.Scanner;

public class Code04Lab {
    public static void main(String[] args) {
//        int java=3;
//        int mobile=2;
//        int exel=1;
//        double A = 4.5;
//        double A0 = 4.0;
//        double B  =3.5;
//
//        double avg;
//        avg = ( (java*B) + (mobile*A0) + (exel*A) ) / ( java + mobile + exel );
//        avg = Math.round(avg * 100.0) / 100.0;
//
//        System.out.println("평균 학점: " + avg);
        Scanner sc = new Scanner(System.in);

        double totalScore = 0;
        int totalCredit = 0;

       for (int i = 0; i <= 2; i++) {
           System.out.println("번째 과목 정보를 입력하세요.: ");

           System.out.println("과목명: ");
           String subject = sc.nextLine();

           System.out.println("이수학점: ");
           int credit = sc.nextInt();

           System.out.println("성적학점: ");
           double grade = sc.nextDouble();
           sc.nextLine();

           totalScore += credit * grade;
           totalCredit += credit;
       }
       double avg = totalScore / totalCredit;
        System.out.printf("평균 학점: %.2f\n", avg);

        sc.close();
    }

}

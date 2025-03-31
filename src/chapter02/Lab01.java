package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
//        Scanner s1 = new Scanner(System.in);문자 s2는 숫자
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println(" ## 택배 보내기입니다. 다음을 각각 입력하세요");

//        System.out.println("받는 사람: ");
//        String name = s1.nextLine();
//        System.out.println("사용자 입력값: " + name);
//
//
//        System.out.println("주소: ");
//        String add = s1.nextLine();
//        System.out.println("사용자 입력값: " + add);
//
//        System.out.println("무게(g)");
//        int weight = s2.nextInt();
//        System.out.println("사용자 입력값: " + weight*5 + "원");

        System.out.println("받는 사람: ");
        String name = s1.nextLine();
        System.out.println("주소: ");
        String add = s1.nextLine();
        System.out.println("무게(g): ");
        int weight = s2.nextInt();

        int price = weight * 5;
        System.out.println("받는 사람: " + name);
        System.out.println("주소: " + add);
        System.out.println("배송비: " + price + "원");

        s1.close();
        s2.close();
    }
}

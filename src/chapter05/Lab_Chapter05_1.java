package chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class Lab_Chapter05_1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("*****PC방 출입시간 제한*****");
        System.out.print("출생연도 입력(4자리 정수): ");
        int birthYear = s1.nextInt();

        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar. YEAR);

        int age = nowYear - birthYear;
        String resultstr = "";

        if (age >= 18){
        resultstr = "즐거운 시간 보내세요.";
        }
        else{
            resultstr = "집에 가실 시간입니다.";
        }

        System.out.println("귀하의 나이는 " + age + "세임으로" + resultstr);
        System.out.println("협조해 주셔서 감사합니다.");

        s1.close();
    }
}

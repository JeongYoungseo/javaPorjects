package chapter04;

import java.util.Scanner;

public class Code04_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an decimal String1: ");
        String str1 = s.nextLine();
        System.out.print("Enter an decimal String2: ");
        String str2 = s.nextLine();

        int diffNums = str1.length() - str2.length();
        System.out.println("number1 And number2 difference number: " + diffNums);
        s.close();
    }
}

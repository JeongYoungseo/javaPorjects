package chapter05;

import java.util.Calendar;

public class Code05_09 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("현재요일: " + day);
        char dayCH = 0;

        switch (day) {
            case Calendar.SUNDAY: dayCH = '일';
            break;
            case Calendar.MONDAY: dayCH = '월';
            break;
            case Calendar.TUESDAY: dayCH = '화';
            break;
            case Calendar.WEDNESDAY: dayCH = '수';
            break;
            case Calendar.THURSDAY: dayCH = '목';
            break;
            case Calendar.FRIDAY: dayCH = '금';
            break;
            case Calendar.SATURDAY: dayCH = '토';
            break;
        }

        System.out.println("오늘은" + dayCH + "요일입니다.");
    }
}

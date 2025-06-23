package chpater08.lab_section02;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int axcelSpeed = 0;

        SchoolBus bus = new SchoolBus();
        SportsCar car = new SportsCar();

        while(true){
            System.out.println("Enter axcel speed(-1:quit): ");
            axcelSpeed = s.nextInt();
            // 입력값이 -1이 입력되면 반복문 종료

            if(axcelSpeed == -1){
                System.out.println("자동차가 멈춥니다.");
                break;
            }

            bus.upSpeed(axcelSpeed);
            car.upSpeed(axcelSpeed);

            System.out.println("스쿨버스의 현재 속도: " + bus.getSpeed());
            System.out.println("스포츠카의 현재 속도: " + car.getSpeed());
        }

    }
}

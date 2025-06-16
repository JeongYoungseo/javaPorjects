package chpater08.section01;

public class RabbitTest1 {
    public static void main(String[] args) {
        System.out.println("Rabbit 객체 생성 전이 토끼 객체의 수: " + Rabbit.count);

        Rabbit rabbit1 = new Rabbit();
        System.out.println("Rabbit 객체 첫번째 생성 후의 토끼 객체의 수: " + Rabbit.RABBIT_NAME + Rabbit.count);
        Rabbit rabbit2 = new Rabbit();
        System.out.println("Rabbit 객체 두번째 생성 후의 토끼 객체의 수: " + Rabbit.RABBIT_NAME + Rabbit.count);
    }
}

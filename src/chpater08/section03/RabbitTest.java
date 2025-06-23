package chpater08.section03;

public class RabbitTest {
    public static void main(String[] args) {
        // Rabbit rabbit = new Rabbit(); //추상클래스는 new연산자로 객체 생성 불가능
        HouseRabbit h = new HouseRabbit();
        MountainRabbit m = new MountainRabbit();

        h.move(10,20);
        m.move(1000,2000);

        m.run(); //산토끼의 메소드

        h.eat("grasses"); //부모의 메소드
        h.shape = "Circle Rabbit";
    }
}

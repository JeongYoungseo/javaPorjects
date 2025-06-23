package chpater08.section03;

public class HouseRabbit extends Rabbit {
    @Override
    public void move(int x, int y) {
        this.x = x; //super도 가능
        this.y = y;
    }
}

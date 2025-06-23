package chpater08.section03;

public class MountainRabbit extends Rabbit {

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void run(){
        System.out.println("산토끼는 이산 저산 뛰어댕긴다.");
    }
}

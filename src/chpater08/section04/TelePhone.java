package chpater08.section04;

public class TelePhone implements Phone{
    @Override
    public void callPhone(String phoneNumber) {
        System.out.println("TelePhone Calling " + phoneNumber);
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println("TelePhone Receiving " + phoneNumber);
    }

    public void answeringMachine(String message){
        System.out.println("TelePhone message: " + message);
    }
}

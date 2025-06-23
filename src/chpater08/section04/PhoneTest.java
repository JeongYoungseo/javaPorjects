package chpater08.section04;

public class PhoneTest {
    public static void main(String[] args) {
        TelePhone telephone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telephone.answeringMachine("지금은 전화를 받을 수 없습니다. 음성 메세지를 남겨주세요.");
        telephone.callPhone("010-1111-2222");
        telephone.receivePhone("010-3333-4444");

        featurePhone.sendSMS("010-5555-6666", "인터페이스를 배우고 있어요. 아주 많이 사용됩니다.");

        smartPhone.installApp("Kakao Talk");


    }
}

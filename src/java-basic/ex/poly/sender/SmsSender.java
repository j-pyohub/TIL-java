package ex.poly.sender;

public class SmsSender implements Sender {
    @Override
    public void sendmessage(String msg) {
        System.out.println("SMS를 전송합니다: "+msg);
    }
}

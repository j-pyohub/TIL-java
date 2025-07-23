package ex.poly.sender;

public class FaceBookSender implements Sender {
    @Override
    public void sendmessage(String msg) {
        System.out.println("페이스북에 발송합니다: " + msg);
    }
}

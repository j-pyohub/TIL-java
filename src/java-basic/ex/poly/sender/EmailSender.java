package ex.poly.sender;

public class EmailSender implements Sender {
    @Override
    public void sendmessage(String msg) {
        System.out.println("이메일을 발송합니다: "+msg);
    }
}

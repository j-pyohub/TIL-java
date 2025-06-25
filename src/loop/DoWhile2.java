package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        // 조건을 만족하지 않는 반복 - 최초 한번은 실행하고 조건확인
        int i = 10;

        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i<3);

    }
}

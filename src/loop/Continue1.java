package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;
        
        // 1부터 5까지 출력하는데, 숫자가 3일 때는 건너뜀
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

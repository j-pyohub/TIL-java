package ex;

public class LoopEx5 {

    public static void main(String[] args) {

        //반쪽짜리 피라미드 출력

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

package ex;

public class LoopEx3 {

    public static void main(String[] args) {

        //반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램

        //while문
        int sum = 0;
        int i = 1;
        int max = 10;

        while (i <= max) {
            sum = sum+i;
            i++;
        }
        System.out.println("sum = " + sum);

        //for문
        int sum2 = 0;
        int max2 = 10;

        for (int i2 = 1; i2 <= max2; i2++) {
            sum2+=i2;
        }
        System.out.println("sum2 = " + sum2);
    }
}

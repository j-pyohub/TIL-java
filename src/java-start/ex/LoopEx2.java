package ex;

public class LoopEx2 {

    public static void main(String[] args) {

        //짝수 출력: 처음 10개의 짝수를 출력하는 프로그램

        //while문
        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num = num + 2;
            count ++;
        }

        //for문
        for (int num2 = 2, count2 = 1; count2 <= 10; num2=num2+2, count2++) {
            System.out.println(num2);
        }
    }
}

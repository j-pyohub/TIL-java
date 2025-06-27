package ex;

public class LoopEx1 {

    public static void main(String[] args) {

        //자연수 출력: 처음 10개의 자연수를 출력하는 프로그램

        //while문
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count ++;
        }

        //for문
        for (int count2 = 1; count2 <= 10; count2++) {
            System.out.println(count2);
        }
    }
}

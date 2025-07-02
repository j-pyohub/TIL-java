package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        // 학생의 점수를 출력하는 프로그램

        int[] students; //배열 변수 선언
        students = new int[5];


        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        
        // 변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }


    }
}

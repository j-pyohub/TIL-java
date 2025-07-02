package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        // 학생의 점수를 출력하는 프로그램

        //int[] students; //배열 변수 선언
       int[] students = new int[]{90, 80, 70, 60, 50}; // 배열변수 선언, 배열 생성과 초기화

        
        // 변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }


    }
}

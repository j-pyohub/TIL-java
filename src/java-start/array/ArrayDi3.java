package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        // 배열 만들기 및 초기화
        int[][] arr = new int[4][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }


        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인 변경
        }

    }
}

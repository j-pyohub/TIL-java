package array;

public class ArrayDi2 {
    public static void main(String[] args) {

        // 2X3 2차원 배열 만들기 및 초기화
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; // 행2, 열3

//        arr[0][0] = 1; // 0행, 0열
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인 변경
        }

    }
}

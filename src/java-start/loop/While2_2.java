package loop;

public class While2_2 {
    public static void main(String[] args) {
        //1부터 100까지의 합계를 반복문으로 표현하기
        int sum = 0;
        int i = 1;
        int endNum = 100;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }




    }
}

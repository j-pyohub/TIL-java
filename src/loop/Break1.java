package loop;

public class Break1 {

    public static void main(String[] args) {

        //조건에 맞는 값일 때 멈추기
        int sum = 0;
        int i = 1;

        while(true){
            sum += i;
            if (sum > 10000) {
                System.out.println("합이 10000보다 크면 종료: i = " + i + " sum = " + sum);
                break;
            }
            i++;

        }

    }
}

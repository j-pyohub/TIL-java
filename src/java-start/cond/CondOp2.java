package cond;

public class CondOp2 {
    public static void main(String[] args) {
        // 삼항 연산자
        int age =  25;
        String status = (age >=18) ? "성인" : "미성년자";

        System.out.println("age = " + age + ", status = " + status);
    }
}

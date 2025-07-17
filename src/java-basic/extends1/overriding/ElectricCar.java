package extends1.overriding;

public class ElectricCar extends Car {

    @Override //애노테이션 - 없어도 가능함(옵션) but 버그 방지로 사용하는 것이 좋음
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}

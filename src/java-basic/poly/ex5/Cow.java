package poly.ex5;

public class Cow implements InterfaceAnimal {
    @Override
    public void move() {
        System.out.println("음머");
    }

    @Override
    public void sound() {
        System.out.println("소 이동");
    }
}

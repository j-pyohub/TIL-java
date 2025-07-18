package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형성 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //Child 하위에 있는 인스턴스도 참조 가능
        poly.parentMethod();
        //poly.childMethod(); //자식의 기능은 호출할 수 없음

        //자식 변수는 부모 인스턴스 참조X
        //Child child1 = new Parent(); //컴파일 오류

    }
}

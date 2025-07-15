package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근x -> compile error
        //instanceMethod(); //인스턴스 매서드 접근x -> compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근o
        instanceMethod(); //인스턴스 매서드 접근o

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}

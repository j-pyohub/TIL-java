package ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message, 3);
        System.out.println("=============");
        printMessage(message,2);

    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}

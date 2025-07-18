package ex.ref;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        // 주문 개수 입력
        System.out.print("입력할 주문의 개수를 입력하세요: " );
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[count];

        // creatOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        for (int i=0; i < count; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);
        // getTotalAmount()를 사용해서 총 결제 금액 계산

        // 총 결제 금액 출력
        int totalAmount =  getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName= productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price*order.quantity;
        }

        return totalAmount;

    }

}

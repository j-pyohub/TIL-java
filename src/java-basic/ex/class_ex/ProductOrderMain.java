package ex.class_ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        //상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder oder1 = new ProductOrder();
        oder1.productName = "두부";
        oder1.price = 2000;
        oder1.quantity = 2;
        orders[0] = oder1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;


        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;


        //상품 주문 정보와 최종 금액 출력
        int total = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
            total += order.price* order.quantity;
        }

        System.out.println("총 결제 금액: "+total);
    }
}

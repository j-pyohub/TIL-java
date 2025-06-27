package ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalCost = 0;

        while (true){
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String itemName = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int itemPrice = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int itemQuantity = input.nextInt();

                int cost = itemPrice * itemQuantity;
                totalCost += cost;
                System.out.println("상품명: " + itemName + ", 가격: " + itemPrice + ", 수량: " + itemQuantity + ", 합계: " + cost);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }


        }
    }
}

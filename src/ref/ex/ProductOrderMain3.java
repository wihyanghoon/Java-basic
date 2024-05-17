package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderNumber = scanner.nextInt();
        // 처음 임력했을때의 줄바꿈 이스케이프문을 날려줘야함
        scanner.nextLine();
        int totalPrice = 0;
        Order[] orders = new Order[orderNumber];

        for (int i = 0; i < orderNumber; i++) {
            System.out.println(i + 1 + "번째 주문을 해주세요");
            System.out.print("상품명 : ");

            String foodName = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            orders[i] = CreateOrder(foodName, price, quantity);
            scanner.nextLine();
        }

        for (Order order : orders) {
            PrintOrder(order);
            totalPrice += order.price;
        }

        getToTalAmount(totalPrice);
    }

    static Order CreateOrder (String foodName, int price, int quantity) {
        Order order = new Order();
        order.foodName = foodName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void PrintOrder (Order order) {
        System.out.println("상품명 : " + order.foodName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
    }

    static void getToTalAmount (int totalPrice) {
        System.out.println("총 금액 : " + totalPrice);
    }
}

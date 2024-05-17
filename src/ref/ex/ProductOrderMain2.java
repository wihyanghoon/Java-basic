package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Order[] orders = new Order[3];

        orders[0] = CreateOrder("두부", 2000, 2);
        orders[1] = CreateOrder("김치", 5000, 1);
        orders[2] = CreateOrder("콜라", 1500, 2);

        int totalPrice = 0;

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

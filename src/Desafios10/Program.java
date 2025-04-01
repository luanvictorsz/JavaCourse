package Desafios10;

import java.util.Date;

public class Program {
    public static void Executar()
    {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);


        // Duas formas de definir o valor da enumeração
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    }
}

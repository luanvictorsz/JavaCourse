package Desafios10;

import java.util.Date;

public class Program {
    public static void Executar()
    {
        Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);

        System.out.println(order);
    }
}

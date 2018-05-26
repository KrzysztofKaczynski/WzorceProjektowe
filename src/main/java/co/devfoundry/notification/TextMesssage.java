package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class TextMesssage implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("SMS - zamówienie numer: " + order.getOrderNumber() +
                " zamieniło status na: " + order.getOrderStatus());
    }
}

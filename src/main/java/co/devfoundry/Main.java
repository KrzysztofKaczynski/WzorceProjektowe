package co.devfoundry;

import co.devfoundry.notification.Email;
import co.devfoundry.notification.MobileApp;
import co.devfoundry.notification.TextMesssage;
import co.devfoundry.order.Order;
import co.devfoundry.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMesssage textMesssage = new TextMesssage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMesssage.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
        email.updateOrderStatus(order);

    }
}

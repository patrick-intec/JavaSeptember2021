package be.infernalwhale.view;

import be.infernalwhale.model.Order;
import be.infernalwhale.service.OrderService;

public class OrderView {
    private OrderService orderService = new OrderService();

    public void createOrder() {
        // System.in a lot of information >> Hoop Strings and numbers
        Order order = new Order(); // Add all data to order object...

        Order readyOrder = orderService.processOrder(order);
        System.out.println(readyOrder); // represents the actual giving of the donuts to the customer
    }

    public void updateOrder() {
        // System.in a lot information, package into Order object
        Order order = new Order(); // Add all data to order object...

        orderService.updateOrder(order);
    }

    public void deleteOrder() {

    }

    public void showOrder() {

    }

}

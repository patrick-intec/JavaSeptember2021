package be.infernalwhale.service;

import be.infernalwhale.model.Order;

public class OrderService {
    private StockService stockService;
    private RegisterService registerService;

    public Order processOrder(Order order) {
        if (stockService.amountInStock(order.getDonut()) > 0) {
            stockService.updateStock(order.getDonut());
            registerService.calculateExchangeMoneyz(order);
            order.setOrderReady(true);
        }

        return order; // TODO: fix this BAD code
    }

    public Order updateOrder(Order order) {

        return null; // TODO: fix abominable null pointer exception waiting to explode...
    }
}

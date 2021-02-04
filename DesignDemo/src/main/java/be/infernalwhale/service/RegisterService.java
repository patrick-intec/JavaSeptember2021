package be.infernalwhale.service;

import be.infernalwhale.model.Order;

public class RegisterService {
    public void calculateExchangeMoneyz(Order order) {
        order.setAmountDue(order.getMoneyReceived() - order.getDonut().getCost());
    }
}

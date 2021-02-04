package be.infernalwhale.model;

public class Order {
    private Donut donut;
    private int moneyReceived;
    private int amountDue;
    private boolean orderReady;

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(int moneyReceived) {
        this.moneyReceived = moneyReceived;
    }

    public int getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(int amountDue) {
        this.amountDue = amountDue;
    }

    public boolean isOrderReady() {
        return orderReady;
    }

    public void setOrderReady(boolean orderReady) {
        this.orderReady = orderReady;
    }
}

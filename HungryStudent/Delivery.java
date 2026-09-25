public abstract class Delivery {
    private String deliveryType;

    public Delivery(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public abstract void deliver();
    public abstract void deliver(String foodName);
}

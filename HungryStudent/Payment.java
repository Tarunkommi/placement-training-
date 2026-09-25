public abstract class Payment {
    private String paymentType;

    public Payment(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public abstract void pay(double amount);

    public void pay() {
        pay(0.0);
    }
}

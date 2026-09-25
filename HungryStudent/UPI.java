public class UPI extends Payment {
    private String upiId;

    public UPI() {
        super("UPI");
        this.upiId = "student@upi";
    }

    public UPI(String upiId) {
        super("UPI");
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("\nPayment: UPI");
        System.out.println("Payment successful!");
    }
}

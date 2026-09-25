public class Cash extends Payment {

    public Cash() {
        super("Cash");
    }

    @Override
    public void pay(double amount) {
        System.out.println("\nPayment: Cash");
        System.out.println("Payment successful! Please keep exact cash ready upon delivery.");
    }
}

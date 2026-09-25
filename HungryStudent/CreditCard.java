public class CreditCard extends Payment {
    private String cardNumber;

    public CreditCard() {
        super("CreditCard");
        this.cardNumber = "XXXX-XXXX-XXXX-9876";
    }

    public CreditCard(String cardNumber) {
        super("CreditCard");
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("\nPayment: CreditCard");
        System.out.println("Payment successful!");
    }
}

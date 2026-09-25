public class FoodOrder {
    private String orderId;
    private String foodName;
    private double price;
    private int quantity;

    public FoodOrder(String orderId, String foodName, double price, int quantity) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.price = (price >= 0) ? price : 0.0;
        this.quantity = (quantity > 0) ? quantity : 1;
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public void showOrder() {
        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + (long)calculateTotal());
        checkFunnyRules();
    }

    public void checkFunnyRules() {
        if (foodName != null && foodName.trim().equalsIgnoreCase("Biryani")) {
            System.out.println("Student has chosen happiness");
        }
        if (quantity > 3) {
            System.out.println("Bro, are you feeding the entire class?");
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be at least 1.");
        }
    }
}

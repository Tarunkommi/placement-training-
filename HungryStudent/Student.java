public class Student {
    private String name;
    private String studentId;
    private double walletBalance;
    private int hungerLevel;

    public Student(String name, String studentId, double walletBalance, int hungerLevel) {
        this.name = name;
        this.studentId = studentId;
        this.walletBalance = Math.max(0.0, walletBalance);
        this.hungerLevel = hungerLevel;

        checkHunger();
    }

    public void checkHunger() {
        if (this.hungerLevel > 80) {
            System.out.println("EMERGENCY! Feed the student immediately!");
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.walletBalance += amount;
            System.out.println("Added Rs." + amount + " to wallet. Current Balance: Rs." + this.walletBalance);
        } else {
            System.out.println("Invalid amount to add.");
        }
    }

    public void addMoney(double amount, String source) {
        if (amount > 0) {
            this.walletBalance += amount;
            System.out.println("Added Rs." + amount + " via " + source + ". Current Balance: Rs." + this.walletBalance);
        } else {
            System.out.println("Invalid amount to add.");
        }
    }

    public void showBalance() {
        System.out.println("Wallet Balance for " + this.name + " (" + this.studentId + "): Rs." + (long)this.walletBalance);
    }

    public boolean orderFood(FoodOrder order, Payment paymentMethod, Delivery deliveryMethod) {
        System.out.println("Student: " + this.name);
        order.showOrder();

        double totalAmount = order.calculateTotal();

        if (totalAmount > this.walletBalance) {
            System.out.println("\nOrder Error: The student cannot spend more than walletBalance!");
            System.out.println("Wallet Balance: Rs." + (long)this.walletBalance + ", Order Total: Rs." + (long)totalAmount);
            return false;
        }

        this.walletBalance -= totalAmount;
        paymentMethod.pay(totalAmount);
        deliveryMethod.deliver(order.getFoodName());

        this.hungerLevel = Math.max(0, this.hungerLevel - 50);

        return true;
    }

    public boolean orderFood(FoodOrder order) {
        return orderFood(order, new Cash(), new BikeDelivery());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        if (walletBalance >= 0) {
            this.walletBalance = walletBalance;
        } else {
            System.out.println("Wallet balance cannot be negative.");
        }
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
        checkHunger();
    }
}

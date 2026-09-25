public class HungryStudentApp {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   HUNGRY STUDENT - COLLEGE FOOD DELIVERY APP     ");
        System.out.println("==================================================\n");

        System.out.println("--- Scenario 1: Standard Order (Assignment Example) ---");
        Student student1 = new Student("Hemanth", "STU101", 500.0, 85);
        FoodOrder order1 = new FoodOrder("ORD001", "Biryani", 150.0, 2);

        Payment upiPayment = new UPI("hemanth@oksbi");
        Delivery bikeDelivery = new BikeDelivery();

        System.out.println();
        student1.orderFood(order1, upiPayment, bikeDelivery);

        System.out.println("\n--------------------------------------------------");
        student1.showBalance();
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- Scenario 2: Large Order with Drone Delivery ---");
        Student student2 = new Student("Pooja", "STU102", 1200.0, 60);
        FoodOrder order2 = new FoodOrder("ORD002", "Burger", 120.0, 5);

        Payment cardPayment = new CreditCard("4111-2222-3333-4444");
        Delivery droneDelivery = new DroneDelivery();

        System.out.println();
        student2.orderFood(order2, cardPayment, droneDelivery);

        System.out.println("\n--------------------------------------------------");
        student2.showBalance();
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- Scenario 3: Insufficient Balance Check ---");
        Student student3 = new Student("Rahul", "STU103", 100.0, 90);
        FoodOrder order3 = new FoodOrder("ORD003", "Biryani", 250.0, 1);

        Payment cashPayment = new Cash();
        Delivery delivery3 = new BikeDelivery();

        System.out.println();
        boolean success = student3.orderFood(order3, cashPayment, delivery3);

        if (!success) {
            System.out.println("Resolving issue: Rahul adds money to wallet...");
            student3.addMoney(300.0, "Pocket Money");
            System.out.println("\nRetrying order after adding money:");
            student3.orderFood(order3, cashPayment, delivery3);
        }

        System.out.println("\n==================================================");
        System.out.println("            ALL TEST SCENARIOS COMPLETED           ");
        System.out.println("==================================================");
    }
}

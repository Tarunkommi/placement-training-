public class BikeDelivery extends Delivery {

    public BikeDelivery() {
        super("Bike");
    }

    @Override
    public void deliver() {
        System.out.println("\nDelivery: Bike");
        System.out.println("Your food is coming by bike");
    }

    @Override
    public void deliver(String foodName) {
        System.out.println("\nDelivery: Bike");
        System.out.println("Your " + foodName.toLowerCase() + " is on the way");
        System.out.println("Your food is coming by bike");
    }
}

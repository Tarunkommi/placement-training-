public class DroneDelivery extends Delivery {

    public DroneDelivery() {
        super("Drone");
    }

    @Override
    public void deliver() {
        System.out.println("\nDelivery: Drone");
        System.out.println("Your food is flying to you");
    }

    @Override
    public void deliver(String foodName) {
        System.out.println("\nDelivery: Drone");
        System.out.println("Your " + foodName.toLowerCase() + " is on the way");
        System.out.println("Your food is flying to you");
    }
}

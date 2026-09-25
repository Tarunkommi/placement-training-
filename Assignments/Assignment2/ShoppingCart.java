//Create a shopping cart. Each item has a name, price, and quantity. 
// Operations to implement: 
// 1 Add item 
// 2 Remove item 
// 3 Update quantity 
// 4 Search item 
// 5 Display cart 
// 6 Calculate total bill


package Assignments.Assignment2;
import java.util.ArrayList;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }

    void display() {
        System.out.println(
            "Item: " + name +
            "  Price: " + price +
            "  Quantity: " + quantity +
            "  Total: " + getTotal()
        );
    }
}

public class ShoppingCart {

    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();

        cart.add(new Item("Bag", 500, 3));
        cart.add(new Item("T-shrt", 800, 2));
        cart.add(new Item("Shoe", 5699, 1));

        System.out.println("Items Shopping Cart");

        for (Item item : cart) {
            item.display();
        }

        cart.add(new Item("Bluetooth", 2999, 1));
        System.out.println("Item added into Cart");

        boolean found=false;
        for (Item item : cart) {
            if (item.name.equalsIgnoreCase("Charger")) {
                item.display();
                found=true;
                
            }
        }
        if(found==false){
            System.out.println("Item not found");
        }
        
        for (Item item : cart) {
            if (item.name.equalsIgnoreCase("bag")) {
                item.quantity=1;
                found=true;
                
            }
        }
        System.out.println("update quantity of Bag: ");
        

        cart.remove(2);

        double totalBill = 0;

        for (Item item : cart) {
            item.display();
            totalBill += item.getTotal();
        }

        System.out.println("\nTotal Bill = ₹" + totalBill);

        if (totalBill > 5000) {
            System.out.println(
                "Congratulations! You are officially poor."
            );
        }
    }
}

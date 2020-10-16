/**
 * This applied example simulates shopping on a supermarket.
 * An item can be purchased which represents the superclass.
 * There are three different types of items: weighted item (which is sold by weight),
 * counted item (which is sold by quantity), and bulk item (which is sold by bulk).
 * Each of these types of items represent subclasses of the PurchaseItem superclass.
 * By creating instances of these subclasses and providing the corresponding data
 * the programme will calculate the subtotal cost, the VAT, and the total cost to pay (in Euro)
 * as in any supermarket.
 */
class Shopper {

    public static void main(String[] args) {
        // Creating a client to act as the shopper
        Person client = new Person("John Doe");
        // Creating a weighted item by given item's name, price per unit, and weight
        PurchaseItem weightedItem = new WeightedItem("Apple", 3.00, 1.8);
        // Creating a counted item by given item's name, price per unit, and quantity
        PurchaseItem countedItem = new CountedItem("Pen", 4.5, 2);
        // Creating a bulk item by given item's name, number of bulks, and number of items per bulk
        PurchaseItem bulkItem = new BulkItem("Canned food", 2, 20);
        // Printing the shopping cart of the person, which contains the information of the items bought,
        // the VAT, and the total to pay (in Euro) for each type of item.
        // Setting the item to the client's shopping cart
        client.setShoppingCart(weightedItem);
        System.out.println(client + " " + client.getShoppingCart());
        // Setting the item to the client's shopping cart
        client.setShoppingCart(countedItem);
        System.out.println(client + " " + client.getShoppingCart());
        // Setting the item to the client's shopping cart
        client.setShoppingCart(bulkItem);
        System.out.println(client + " " + client.getShoppingCart());
        System.exit(0);
    }
}
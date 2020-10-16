/**
 * The CountedItem class represents an item which is sold by quantity.
 * A counted item inherits the attributes of a purchased item but also
 * has a quantity attribute (int).
 */
class CountedItem extends PurchaseItem {

    // Local attributes of a counted item
    private int quantity;

    // Constructor of the subclass, requires an item name, a price per unit, and a quantity
    CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice); // Call to the superclass constructor
        this.quantity = quantity;
    }

    // Overriding the accessor method (getter) getPrice() of the superclass
    // to calculate the total cost to pay depending on the quantity
    @Override
    double getPrice() {
        return super.getPrice() * quantity;
    }

    // Overriding the toString() method to print the number of items sold, the VAT, and the total cost
    @Override
    public String toString() {
        // For this example, the VAT of the counted items is calculated with a 15% rate
        return super.toString() + " Quantity: " + quantity + " units Subtotal: €" + getPrice()
                + " VAT: " + calculateProductVat(15) + " Total: €"
                + (getPrice() + super.getProductVat());
    }
}
/**
 * The WeightedItem class represents an item which is sold by weight.
 * A weighted item inherits the attributes of a purchased item but also
 * has a weight attribute (double).
 */
class WeightedItem extends PurchaseItem {

    // Local attributes of a weighted item
    private double weight;

    // Constructor of the subclass, requires an item name, a price per unit, and a weight
    WeightedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice); // Call to the superclass constructor
        this.weight = weight;
    }

    // Overriding the accessor method (getter) getPrice() of the superclass
    // to calculate the total cost to pay depending on the weight
    @Override
    double getPrice() {
        return super.getPrice() * weight;
    }

    // Overriding the toString() method to print the weight of the items sold, the VAT, and the total cost
    @Override
    public String toString() {
        // For this example, the VAT of the weighted items is calculated with a 5% rate
        return super.toString() + " Weight: " + weight + "kg Subtotal: €" + getPrice()
                + " VAT: " + calculateProductVat(5) + " Total: €"
                + (getPrice() + super.getProductVat());
    }
}
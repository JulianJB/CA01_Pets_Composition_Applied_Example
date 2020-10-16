/**
 * The BulkItem class represents an item which is sold by bulk.
 * A weighted item inherits the attributes of a purchased item but also
 * has a number of bulks attribute (int) and a number of items per bulk attribute (int).
 */
class BulkItem extends PurchaseItem {

    // Local attributes of a bulk item
    private int numBulks, numItemsPerBulk;

    // Constructor of the subclass, requires an item name, a number of bulks,
    // and a number of items per bulk
    BulkItem(String name, int numBulks, int numItemsPerBulk) {
        // Call to the superclass constructor, temporarily assign "0" as
        // the price per unit of the bulk item.
        super(name, 0);
        this.numBulks = numBulks;
        this.numItemsPerBulk = numItemsPerBulk;
        // Correctly assign the price per unit of the bulk item by calling the
        // superclass method setPrice()
        super.setPrice(getUnitPrice());
    }

    // Calculates the price per unit of the bulk item, as this is not
    // normally given by the supermarket use the attributes number of bulks
    // and number of items per bulk to get the unitary price.
    double getUnitPrice() {
        return numBulks / (double)numItemsPerBulk;
    }

    // Overriding the accessor method (getter) getPrice() of the superclass
    // to calculate the total cost to pay depending on the number of bulks and
    // the number of items per bulk.
    @Override
    double getPrice() {
        return super.getPrice() * numBulks * numItemsPerBulk;
    }

    // Overriding the toString() method to print the number of bulks and
    // the number of items per bulk of the items sold, the VAT, and the total cost.
    @Override
    public String toString() {
        // For this example, the VAT of the bulk items is calculated with a 15% rate
        return super.toString() + " Number of bulks: " + numBulks
                + " Items per bulk: " + numItemsPerBulk + " Subtotal: €" + getPrice()
                + " VAT: " + calculateProductVat(15) + " Total: €"
                + (getPrice() + super.getProductVat());
    }
}
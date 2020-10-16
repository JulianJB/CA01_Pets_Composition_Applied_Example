/**
 * The PurchaseItem class represents an item that has been purchased.
 * An item is composed of an item name (String), a price per unit (double),
 * and the product VAT (double).
 */
abstract class PurchaseItem {

    // Attributes of a purchased item
    private String name;
    private double unitPrice;
    private double productVat;

    // Constructor of the superclass, requires an item name and a price per unit
    // The product VAT is usually not known by the shopper, so it gets calculated automatically
    // depending on the type of product bought.
    PurchaseItem(String name, double unitPrice) {
        this.name = name;
        setPrice(unitPrice);
    }

    // An accessor method (getter) to retrieve the price per unit of an item
    double getPrice() {
        return unitPrice;
    }

    // A mutator method (setter) to assign the price per unit of an item
    void setPrice(double unitPrice) {
        // If the price per unit provided is bigger than zero, keep
        // the price per unit, otherwise set the price per unit to zero
        this.unitPrice = (unitPrice > 0) ? unitPrice : 0;
    }

    // An accessor method (getter) to retrieve the name of an item
    String getName() {
        return name;
    }

    // Overriding the toString() method to print the information of the purchased item
    @Override
    public String toString() {
        String printString;
        printString = "Item purchased: " + getName() + " Price per unit: €" + unitPrice;
        return printString;
    }

    // Calculates the product VAT depending of the type of item bought.
    // As different rates apply, the VAT value is not provided by the shopper
    // but instead calculated and added at checkout.
    double calculateProductVat(int vat) {
        this.productVat = getPrice() * vat / 100;
        return productVat;
    }

    // An accessor method (getter) to retrieve the VAT of a product
    double getProductVat() {
        return productVat;
    }
}
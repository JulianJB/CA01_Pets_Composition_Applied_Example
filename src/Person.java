class Person {

    // Attributes of a person
    String personName;
    // Object composition, in this case a person has a shopping cart with items
    PurchaseItem shoppingCart;

    // Constructor of the class, requires a name
    Person(String personName) {
        this.personName = personName;
    }

    // An accessor method (getter) to retrieve the name of the person
    String getPersonName() {
        return personName;
    }

    // A mutator method (setter) to assign the item to the shopping cart
    void setShoppingCart(PurchaseItem item) {
        this.shoppingCart = item;
    }

    // An accessor method (getter) to retrieve the item from the shopping cart
    PurchaseItem getShoppingCart() {
        return shoppingCart;
    }

    // Overriding the toString() method to print the information of the client
    @Override
    public String toString() {
        return "Client name: " + getPersonName();
    }
}
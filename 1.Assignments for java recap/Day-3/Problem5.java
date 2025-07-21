import java.util.ArrayList;
/*
5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
‌
*/

public class Problem5 {
    public static void main(String[] args) {
        
        Store.setStoreDetails("Zeigen Mart", "Chennai");

        Store store = new Store();

        Product p1 = new Product("P001", "Keyboard", 799.99, 10);
        Product p2 = new Product("P002", "Mouse", 399.50, 25);
        Product p3 = new Product("P003", "Monitor", 5499.00, 5);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();

        store.displayAllProducts();
    }
}

class Store {
    static String storeName;
    static String location;
    ArrayList<Product> list = new ArrayList<>();

    public static void setStoreDetails(String name, String loc) {
        storeName = name;
        location = loc;
    }

    public static void displayStoreDetails() {
        System.out.println("Store Name    : " + storeName);
        System.out.println("Store Location: " + location);
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void displayAllProducts() {
        System.out.println("\n--- Product List ---");
        for (Product product : list) {
            product.displayProduct();
        }
    }
}

class Product {
    String productID;
    String name;
    double price;
    int quantity;

    public Product(String productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("------------------------------");
        System.out.println("Product ID   : " + productID);
        System.out.println("Name         : " + name);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("------------------------------");
    }
}

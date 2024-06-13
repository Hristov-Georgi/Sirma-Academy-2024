package classes.classStorage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Storage {

    private int capacity;
    private List<Product> storage;

    public Storage(int capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.storage);
    }

    public void addProduct(Product product) {

        int quantityToAdd = product.getQuantity();

        if (this.capacity >= quantityToAdd) {
            this.storage.add(product);
            capacity -= quantityToAdd;
        } else {
            System.out.printf("Not enough capacity in storage. Storage has capacity left for %d products.%n",
                    this.capacity);
        }
    }

    public double totalCost() {
        double totalPrice = 0;

        for (Product p : this.storage) {
            totalPrice += (p.getPrice() * p.getQuantity());
        }

        return totalPrice;
    }

    public int getCapacity() {
        return this.capacity;
    }

}

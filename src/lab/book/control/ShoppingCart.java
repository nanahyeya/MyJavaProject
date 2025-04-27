package lab.book.control;

import java.util.ArrayList;
import java.util.List;

import lab.book.entity.Publication;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Publication> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Publication item) {
        items.add(item);
    }

    public int calculateTotalPrice() {
        return items.stream().mapToInt(Publication::getPrice).sum();
    }

    public int calculateDiscountedPrice() {
        int total = calculateTotalPrice();
        return (int)(total * 0.8); // 20% discount
    }

    public List<Publication> getItems() {
        return items;
    }
}
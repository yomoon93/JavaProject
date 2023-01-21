import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<LineItem> lineItems;
    private int id;
    static private int totalItems = 0;
    public Invoice() {
        this.id = ++totalItems;
        this.lineItems = new ArrayList<>();

    }

    public int getId() {
       return id;
    }

    public double totalPrice() {
        double total = 0.0;
        for(LineItem k : lineItems){
            total += k.getTotalPrice();
        }
        return total;
    }

    public List<LineItem> getItems() {
       return lineItems;
    }

    public void addItem(LineItem l) {
        lineItems.add(l);
    }

    public void addItem(InventoryItem i, int quantity) {
       lineItems.add(new LineItem(i, quantity));
    }

    public void addItem(InventoryItem i, int quantity, double discount) {
        lineItems.add(new LineItem(i,quantity,discount));
    }
}

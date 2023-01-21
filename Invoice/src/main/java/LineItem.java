public class LineItem {
    private InventoryItem item;
    private int quantity;
    private double discount;

    public LineItem(InventoryItem item, int quantity) {
       this(item, quantity, 0.0);
    }

    public LineItem(InventoryItem item, int quantity, double discount) {
       this.item = item;
       this.quantity = quantity;
       this.discount = discount;
    }

    public double getQuantity() {
       return quantity;
    }

    public InventoryItem getItem() {
       return item;
    }

    public double getDiscount() {
            return discount;
    }

    public double getTotalPrice() {
       double total = 0.0;
       total = (item.getPrice() - item.getPrice() * discount) * quantity;
       return total;
    }
}

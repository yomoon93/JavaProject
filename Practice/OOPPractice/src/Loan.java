public class Loan {
    private Item item;
    private Patron patron;

    public Loan(Item i, Patron p) {
        this.item = i;
        this.patron = p;
        // We set the item to "loaned" when we create a new loan.
        this.item.borrowItem(this);
    }

    public Item getItem() {
        return item;
    }

    public Patron getPatron() {
        return patron;
    }

    public void returnItem() {
        // This returns the book.
        this.item.returnItem();
    }

    @Override
    public String toString() {
        return "Loan{" +
                "item=" + item +
                ", patron=" + patron +
                '}';
    }
}
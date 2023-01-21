abstract public class Item implements Comparable<Item> {
    private static int totalItems = 1;
    protected int id;
    protected String title;
    private Loan currentLoan;

    public Item(String title) {
        this.title = title;
        this.id = totalItems;
        totalItems++;
    }

    public Loan getCurrentLoan() {
        return currentLoan;
    }

    public void
    borrowItem(Loan l) {
        // Sets the current loan, because the item has been borrowed.
        this.currentLoan = l;
    }

    public void returnItem() {
        // Sets the current loan to null
        this.currentLoan = null;
    }

    public boolean isAvailable() {
        // The item is available if it's not loaned.
        return (this.currentLoan == null);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        // Returns 0 if they're equal
        // less than 0 if this is less than other
        // greater than 0 if this is greater than 0
        return this.id - o.id;
    }
}
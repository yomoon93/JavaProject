import java.util.List;
import java.util.ArrayList;

public class Library {
    // Dealing with the actual functionality of the library model
    public List<Item> getAvailableItems() {
        List<Item> available = new ArrayList<Item>();
        for (Item i : this.borrowables) {
            if (i.isAvailable()) {
                available.add(i);
            }
        }
        return available;
    }

    private List<Item> borrowables;

    public List<Loan> getLoans() {
        return loans;
    }

    public List<Loan> getLoans(Patron b) {
        // Get loans related to a particular borrower
        List<Loan> patronsLoans = new ArrayList<Loan>();
        for (Loan l : this.loans) {
            if (l.getPatron() == b) {
                patronsLoans.add(l);
            }
        }
        return patronsLoans;
    }

    private List<Loan> loans;
    private List<Patron> patrons;

    public Library() {
        // If no books provided, then default to an empty list of Item
        this(new ArrayList<Item>());
    }

    public Library(List<Item> borrowables) {
        // Set the borrowables to borrowables; create empty list for loans and patrons.
        this.borrowables = borrowables;
        this.loans = new ArrayList<Loan>();
        this.patrons = new ArrayList<Patron>();
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    public void registerPatron(Patron p) {
        patrons.add(p);
    }

    public void borrowItem(Patron borrower, Item borrowed) {
        Loan loan = new Loan(borrowed, borrower);
        this.loans.add(loan);
    }

    public void returnItem(Loan l) {
        l.returnItem();
        this.loans.remove(l);
    }
}
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LibraryApplication {
    // Dealing with our user interface in this class/main method

    static Library elevateLibrary;
    public static void main(String[] args) {
        List<Item> borrowables = new ArrayList<>();
        borrowables.add(new Book("Debt: The First 5000 Years", "Daniel Graeber", "978-1612194196"));
        borrowables.add(new Book("Base Notes", "Lara Elena Donnelly", "978-1542030700"));
        borrowables.add(new CD("The Dark Side of the Moon", "Pink Floyd", "Prog rock"));
        borrowables.add(new Book("The Wealth of Nations", "Adam Smith", "9781494844738"));
        borrowables.add(new Book("This is How You Lose the Time War", "Amal El-Mohtar & Max Gladstone", "9781534431003"));
        borrowables.add(new Book("The Glass Bead Game", "Herman Hesse", "978-0-099-28326"));

        elevateLibrary = new Library(borrowables);
        // Setting up our library

        Scanner myScanner = new Scanner(System.in);
        String command;
        do {
            // For each loop, enter command
            System.out.println("Please enter your command: ");
            command = myScanner.nextLine();

            if (command.equals("registerPatron")) {
                // Registers a user to our library
                System.out.println("Please enter your name: ");
                String name = myScanner.nextLine();
                System.out.println("Please enter your phone number: ");
                String phoneNumber = myScanner.nextLine();
                Patron p = new Patron(name, phoneNumber);
                elevateLibrary.registerPatron(p);
            } else if (command.equals("listPatrons")) {
                System.out.println(elevateLibrary.getPatrons());
            } else if (command.equals("borrowItem")) {
                // Display what is available to borrow
                System.out.println("Available to borrow is: ");
                for (Item i : elevateLibrary.getAvailableItems()) {
                    System.out.println(i);
                }

                // Have user select the item they wish to borrow
                System.out.println("Please select which one you wish to borrow: ");
                int index = myScanner.nextInt();
                Item toBorrow = elevateLibrary.getAvailableItems().get(index);

                Patron borrower = selectPatron();

                // Create loan and register it
                elevateLibrary.borrowItem(borrower, toBorrow);
            } else if (command.equals("listLoans")) {
                System.out.println(elevateLibrary.getLoans());
            } else if (command.equals("returnItem")) {
                // TODO: Make a method out of this!

                // Ask who is returning their books

                Patron borrower = selectPatron();

                // Display their current loans
                System.out.println("Their loans: ");
                System.out.println(elevateLibrary.getLoans(borrower));

                // Ask them which item they would like to return
                System.out.println("Which item would you like to return?");
                int index = myScanner.nextInt();
                Loan returnedLoan = elevateLibrary.getLoans(borrower).get(index);

                // Return that item
                elevateLibrary.returnItem(returnedLoan);
            }
        } while (!command.equals("exit"));


    }

    public static Patron selectPatron() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Available patrons: ");
        System.out.println(elevateLibrary.getPatrons());
        System.out.println("Please select a patron from the list: ");
        int whichPatron = myScanner.nextInt();
        Patron borrower = elevateLibrary.getPatrons().get(whichPatron);
        return borrower;
    }
}
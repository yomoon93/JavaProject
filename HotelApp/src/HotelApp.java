import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class HotelApp {
//    static Hotel munarMoon;
    static Hotel munarMoon = new Hotel();
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // create a Room ArrayList
        List<Room> roomTypes =  munarMoon.getRoomList();
        // added all the rooms in the ArrayList
        roomTypes.add(new Room("Double Standard",150.0));
        roomTypes.add(new Room("Double Standard",150.0));
        roomTypes.add(new Room("Deluxe Double",200.0));
        roomTypes.add(new Room("Deluxe Double",200.0));
        roomTypes.add(new Room("Junior Suite",300.0));
        roomTypes.add(new Room("Grand Suite",400.0));
        // we create a hotel reference with all


        String command;

        do {
            System.out.println("Hello, welcome to Hotel Moon please enter one of the following numbers for the command: 1 ) Register,  2) List Customers, 3) Book, 4) List Booking: ");
            command = myScanner.nextLine();
            if (command.equals("1")){
               registerCustomer();
            } else if (command.equals("2")) {
             listCustomers();
            } else if (command.equals("3")) {
                int index1 = 0;
                System.out.println("Rooms Available: ");
                for(Room x : munarMoon.grabAvailable()){

                    System.out.println(index1++ +": "+ x);

                }
                System.out.println("Please select which room you would like to book");
                int index = myScanner.nextInt();
                myScanner.nextLine();
                Room toBook = munarMoon.grabAvailable().get(index);
                Customer booker = munarMoon.getCustomer(index);

                System.out.println("From what date are you starting your stay?  format: YYYY-MM-dd ");
                String startDate = myScanner.nextLine();
                LocalDate sDate = LocalDate.parse(startDate);
                System.out.println("What date are you ending your stay? format: YYYY-MM-dd");
                String endDate = myScanner.nextLine();
                LocalDate eDate = LocalDate.parse(endDate);


//                LocalTime
                munarMoon.bookRoom(booker,toBook);
                System.out.println("Will you have a guest with you? yes or no: ");
                String userInput = myScanner.nextLine();
                if(userInput.equals("yes")){ // I need to press enter again what must i add to this
                    System.out.println("What is the name of your guest?");
                    String guestName = myScanner.nextLine();
                    System.out.println("What is their number?");
                    String guestNumber = myScanner.nextLine();
                    Customer g = new Customer(guestName,guestNumber);
                    munarMoon.registerCustomer(g);
                    System.out.println("You have successfully booked " + toBook + " thanks for choosing Moon Hotel " + booker + " and " + guestName + " the price per night is: " + toBook.getPrice() + " from " + sDate + " till this "+ eDate);
                }else System.out.println("You have successfully booked " + toBook + " thanks for choosing Moon Hotel " + booker + " the price per night is: " + toBook.getPrice()+ " from " + sDate + " till this "+ eDate);
            } else if (command.equals("4")) {
                System.out.println(munarMoon.getBookingList());
            }
        }while(!command.equals("exit"));
    }

    public static Customer grabCustomer(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Grab a name from a list ");

        int num = 0;
        for (Customer p: munarMoon.getCustomerList()){

            System.out.println(num++ + " :" + p);
        }
        int selectedCustomer = myScanner.nextInt();
        Customer customer = munarMoon.getCustomerList().get(selectedCustomer);
        return customer;
    }

    public static  void registerCustomer(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = myScanner.nextLine();
        System.out.println("What is your number: ");
        String number = myScanner.nextLine();
        Customer k = new Customer(name, number);
        munarMoon.registerCustomer(k);
    }

    public static void listCustomers(){
        for(Customer k : munarMoon.getCustomerList()){
            System.out.println(k);
        }
    }

    public static void bookRoom(){
        Scanner myScanner = new Scanner(System.in);
        LocalTime timeNow = LocalTime.now();
        System.out.println("Welcome to the Moon Hotel it's currently " + timeNow);
        System.out.println("What time will you be checking it at.");
        String checkInDate = myScanner.nextLine();
        LocalDate checkIn = LocalDate.parse(checkInDate);
        System.out.println("What time will you be checking out at.");
        String checkOutDate = myScanner.nextLine();
        LocalDate checkOut = LocalDate.parse(checkOutDate);
        Customer customer = grabCustomer();
        System.out.println("Here are our available rooms: ");
        int ind = 0;
        for(Room r : munarMoon.grabAvailable()){

        }

        // ask for information like  name  number and add it to an
        // instance of Customer
        // after ask for the days that they will stay and after
        // find the amount of days between the days booked
        // after multiple the days with the amount charged for the room
        // after print out all the information for the customer

        System.out.println("What is your name ");
        String name = myScanner.nextLine();
        System.out.println("What is your number");
        String num = myScanner.nextLine();
        Customer k = new Customer(name, num);
        System.out.println("What room would you to book");


        munarMoon.getBookingList();

    }







}

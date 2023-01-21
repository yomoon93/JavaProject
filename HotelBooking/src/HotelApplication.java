import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HotelApplication {

//created and object called MunarMoon
static Hotel MunarMoon;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        List<Room> typeOfRooms = new ArrayList<>();
        typeOfRooms.add(new Room("Double Standard", 150.0));
        typeOfRooms.add(new Room("Double Standard", 150.0));
        typeOfRooms.add(new Room("Deluxe Double", 200.0));
        typeOfRooms.add(new Room("Deluxe Double", 200.0));
        typeOfRooms.add(new Room("Junior Suite", 300.0));
        typeOfRooms.add(new Room("Grand Suite", 400.0));
        // reference the hotel (MunarMoon) to the Room typeOfRoom which is a Arraylist which is a reference
        MunarMoon = new Hotel(typeOfRooms);
//        System.out.println(typeOfRooms);
//        System.out.println(MunarMoon);

        String command;
    do{
        System.out.println("Hello Welcome to The Moon hotel please enter your command: register, list , book");
        command = myScanner.nextLine();
        if(command.equals("register")){
            System.out.println("Please enter your name: ");
            String name = myScanner.nextLine();
            System.out.println("Please enter your phone number: ");
            String phoneNumber = myScanner.nextLine();
            Customer k = new Customer(name, phoneNumber);
            MunarMoon.registerCustomer(k);
        }else if(command.equals("list")){
            System.out.println(MunarMoon.getCustomers());
        }else if (command.equals("book")){
            System.out.println("Rooms Available: ");
           for (Room x : MunarMoon.getAvailable()){
               System.out.println(x);
            }

            System.out.println("Please select which room you would like to book: ");
            int room  = myScanner.nextInt();
            myScanner.nextLine();
            Room toBook = MunarMoon.getAvailable().get(room);
            Customer booker = selectCustomer();
            System.out.println("Their booking: ");
            MunarMoon.bookRoom(booker,toBook);
            System.out.println();


//            System.out.println("What room are you trying to check out of: ");
//            int index = myScanner.nextInt();





        }
    }while(!command.equals("exit"));


        }




        public static Customer selectCustomer(){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Available Customers: ");
            System.out.println(MunarMoon.getCustomers());
            System.out.println("Please select customer from list: ");
            int whichPatron =  myScanner.nextInt();
            Customer customer = MunarMoon.getCustomers().get(whichPatron);
            return customer;
        }


    }



//        System.out.println("--------------------------------");
//        System.out.println("Hello Welcome to The Moon hotel!");
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        System.out.println("Please select one of the options");
//        System.out.println("A: Book a Room");
//        System.out.println("B: Check In or Out");
//        System.out.println("C: Book a Room");
//        System.out.println("D: Track Room Cleaning");
//        System.out.println("E: Delete customer from room");
//        System.out.println("F: Add a Room");
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        System.out.println("--------------------------------");
//        String myAnswer = myScanner.nextLine().toUpperCase();
//
//        switch (myAnswer){
//            case "A":
//                //method with parameters
//                break;
//
//          roomType.add("DS");
//          roomType.add("DS");
//          roomType.add("DD");
//          roomType.add("DD");
//          roomType.add("JS");
//          roomType.add("GS");
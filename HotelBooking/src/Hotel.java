import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hotel {


    private List<Customer> customers;
    private List<Booking> booking;
    private List<Room> rooms;

    public Hotel() {
        this(new ArrayList<Room>());
    }

    public Hotel(List<Room> rooms) {
        this.customers = new ArrayList<Customer>();

//        this.rooms =  new ArrayList<Room>();
        //  this sets the array to the rooms in hotel application
        this.rooms = rooms;
        this.booking = new ArrayList<Booking>();
    }

    public void registerCustomer(Customer k) {
        customers.add(k);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public boolean isRoomAvailable(Room room) {
        for (Booking i : this.booking) {
            if (i.getTypeRoom() == room) {
                return false;
            }
        }
        return true;
    }

    public List<Room> getAvailable(){
        List<Room> availRooms = new ArrayList<>();
        for(Room i : rooms){
            if(isRoomAvailable(i)){
                availRooms.add(i);
            }
        }
        return availRooms;
    }

    public List<Booking> getBooks(Customer k){
        List<Booking> bookings = new ArrayList<>();
        for(Booking x : this.booking){
            if(x.getCustomer() == k){
                bookings.add(x);
            }
        }
        return bookings;
    }

    public void bookRoom(Customer cus,Room room){
        Booking book = new Booking(cus, room);
        this.booking.add(book);
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "customers=" + customers +
                ", booking=" + booking +
                ", rooms=" + rooms +
                '}';
    }

    //    public void bookRoom(Customer mainGuest, Room roomNumber){
////        Booking book = new Booking();
//        this.booking.add(book);
//    }


}

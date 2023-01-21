import java.awt.print.Book;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Customer> customerList;
    private List<Booking> bookingList;
    private List<Room> roomList;


    public Hotel(List<Room> rooms){
        this.roomList = rooms;
        this.customerList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
    }
    public Hotel(){
        this(new ArrayList<>());
    }
/*
*
* Getters and setters
*
*
* */
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
    /*
    *
    * */
    //Methods for the Hotel
//    public Hotel(){
//        this(new ArrayList<Room>());
//    }
    public void registerCustomer(Customer k){
        customerList.add(k);
    }
    public Customer getCustomer(int customerId){
        for(Customer c : customerList){
            if(c.getiD() == customerId){
                return c;
            }
        }
        return null;
    }
    // a true and false to see if the particular room is open
    public boolean isRoomOpen(Room room){
        for(Booking i : this.bookingList){
            if(i.getRoomType() == room){
                return false;
            }
        }
        return true;
    }
    public List<Room> grabAvailable(){
        List<Room> available = new ArrayList<>();
        for(Room i : roomList){
            if(isRoomOpen(i)){
                available.add(i);
            }
        }
        return available;
    }


//    public List<Room> grabAvailable(Booking checkIn, Booking checkOut){
//        List<Room> avail = new ArrayList<>();
//        for(Room i : roomList){
//            if(isRoomOpen(i) && ){
//
//            }
//        }
//
//        return avail;
//    }

    public void bookRoom(Customer customer, Room room){
        Booking book = new Booking(room, customer);
        this.bookingList.add(book);
    }

    public void bookRoom(Customer customer, Room room, LocalDate sDate, LocalDate eDate, LocalTime checkIn, LocalTime checkOut){
        Booking book = new Booking(room, customer,sDate, eDate,checkIn,checkOut);
        this.bookingList.add(book);
    }



    @Override
    public String toString() {
        return "Hotel{" +
                "customerList=" + customerList +
                ", bookingList=" + bookingList +
                ", roomList=" + roomList +
                '}';
    }
}

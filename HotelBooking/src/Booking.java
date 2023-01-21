import java.time.LocalDate;
import java.util.List;

public class Booking {
    // Customer Reference, Room Reference , Dates, price
    // first slides of constructor
    // fields
    String guest;
    double price;
    Customer customer;
//    private LocalDate startDate;
//    private LocalDate endDate;
    private Room typeRoom;

    public Booking(Customer name, Room typeRoom){

        this.price = price;
//        this.startDate = startDate;
//        this.endDate = endDate;
        this.typeRoom = typeRoom;
        this.customer = name;
        this.typeRoom.bookedRoom(this);


    }



    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(Room typeRoom) {
        this.typeRoom = typeRoom;
    }
    // overrides constructor where we add a default value
//    public Booking(Customer name, Room typeRoom, LocalDate startDate, LocalDate endDate, String gName ){
//        this(name, typeRoom, startDate, endDate, 0, gName);
//    }


    @Override
    public String toString() {
        return "Booking{" +
                "guest='" + guest + '\'' +
                ", price=" + price +
                ", name=" + customer +

                ", typeRoom=" + typeRoom +
                '}';
    }
}
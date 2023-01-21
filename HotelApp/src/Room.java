import java.util.List;

public class Room {
    private static int totalRooms = 0;
    private String nameRoom;
    private double price;
    private int roomNumber;

    private Booking booking;

//    private List<Customer> customerList;

// room should have customers
    public Room(String nameRoom, double price){
        this.nameRoom = nameRoom;
        this.price = price;
        this.roomNumber = totalRooms++;


    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void bookRoom(Booking i){
        this.booking = i;
    }


    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room" +
                "nameRoom='" + nameRoom + '\''
                ;
    }
}

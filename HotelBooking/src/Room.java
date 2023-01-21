import java.util.ArrayList;
import java.util.List;

public class Room {
  String nameRoom;
  double price;

  private Booking booking;

  public Booking getBooking() {
    return booking;
  }

  public void setBooking(Booking booking) {
    this.booking = booking;
  }
//(room, price)

  public Room(String nameRoom, double price  ){
    this.nameRoom = nameRoom;
    this.price = price;
  }

  public String getNameRoom() {
    return nameRoom;
  }
//bookedRoom is the borrowItem in
  public void bookedRoom(Booking b){
    this.booking = b;
  }

  public void setNameRoom(String nameRoom) {
    this.nameRoom = nameRoom;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Room{" +
            "nameRoom='" + nameRoom + '\'' +
            ", price=" + price +
            '}';
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

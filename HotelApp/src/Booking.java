import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    // fields for our variables
private Customer customer;
private Room roomType;
private LocalDate startDate;
private LocalDate endDate;
private LocalTime checkInTime;

private LocalTime checkOutTime;


private LocalTime localTime = LocalTime.now();

public Booking (Room type, Customer name, LocalDate startDate, LocalDate endDate,LocalTime checkInTime,LocalTime checkOutTime){
    this.customer = name;
    this.roomType = type;
    this.roomType.bookRoom(this);
    this.startDate = startDate;
    this.endDate = endDate;
    this.checkInTime = checkInTime;
    this.checkOutTime = checkOutTime;
}

public Booking(Room type, Customer name){

    this(type, name,LocalDate.of(2022,4,24), LocalDate.of(2022,5,10), null, null);
}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoomType() {
        return roomType;
    }

    public void setRoomType(Room roomType) {
        this.roomType = roomType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public void checkIn(Room r){
        // we want to see what time the customer checksIn
        // if it's before 12:00pm he is fine
        // if he checks in after we make them pay a late fee
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Which reservation are you trying to check into?");
        int index = myScanner.nextInt();
        LocalTime limit = LocalTime.parse("12:00");
        Boolean isLate = localTime.isBefore(limit);
       if(!isLate){
           setCheckInTime(localTime);
           System.out.println(customer + " has checked in at " + checkInTime + " hope you enjoy your stay");
       }else if (isLate == null ){
//           cancelReservation();
       }



    }


    @Override
    public String toString() {
        return "Booking:" +
                "customer=" + customer +
                ", roomType=" + roomType +
                ", startDate=" + startDate +
                ", endDate=" + endDate
                ;
    }
}

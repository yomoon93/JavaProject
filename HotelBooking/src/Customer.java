import java.util.List;

public class Customer {
    int iD;
    String customerName;

    private String phoneNumber;
    private static int totalCustomers = 1;

public Customer(String customer,  String phoneNumber){
    this.customerName = customer;

    this.phoneNumber = phoneNumber;
    this.iD = totalCustomers;
    totalCustomers++;
}

    public String getCustomer() {
        return customerName;
    }

    public void setCustomer(String customer) {
        this.customerName = customer;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getTotalCustomers() {
        return totalCustomers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "iD=" + iD +
                ", customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

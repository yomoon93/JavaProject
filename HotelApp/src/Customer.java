public class Customer {
    int iD;
    String customerName;
    private String phoneNumber;
    private static int totalCustomers = 1;

    public Customer(String customer, String phoneNumber){
        this.customerName = customer;
        this.phoneNumber = phoneNumber;
        this.iD = totalCustomers;
        totalCustomers++;
    }


    public int getiD() {
        return iD;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public static void setTotalCustomers(int totalCustomers) {
        Customer.totalCustomers = totalCustomers;
    }

    @Override
    public String toString() {
        return "Customer" +
                "iD=" + iD +
                ", customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\''
                ;
    }
}

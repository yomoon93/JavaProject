public class Seven {
    // Seven: Basic Object Usage
    public static void main(String[] args) {
        CurrencyPair gbpusd = new CurrencyPair("GBP", "USD", 1.20);
        System.out.println("£300 is $"+gbpusd.convert(300));
        System.out.println("$600 is £"+gbpusd.inverse(600));
    }
}
class CurrencyPair {
    // Remember: we can have this here because it's not a public class.
    String to;
    String from;
    double price;
    public CurrencyPair(String to, String from, double price) {
        this.to = to;
        this.from = from;
        this.price = price;
    }

    public double convert(double amount) {
        return amount * price;
    }

    public double inverse(double amount) {
        return amount / price;
    }


}
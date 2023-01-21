public class Six {
    public static void main(String[] args) {
        Trade[] tradebook = {
                new Trade("AAPL", 3, 174.55),
                new Trade("TQQQ", 10, 37.30),
                new Trade("TMF", 5, 12.30)
        };
        double sum = 0;
        for (Trade t : tradebook) {
            if (t.price() > 20) {
                sum += t.qty() * t.price();
            }
        }
        System.out.println("Total value of trades (price > 20): $"+sum);
    }
}

record Trade(String ticker, int qty, double price) {}
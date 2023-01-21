public class Valuation {
    private double price; //USD
    private int yearValuation;

    public Valuation(double price, int yearValuation){
        this.price = price;
        this.yearValuation = yearValuation;
    }
    public Valuation(double price){
     this(price, 2022);
    }

    public double getPrice() {
        return price;
    }
    public int getYearValuation() {
        return yearValuation;
    }

    @Override
    public String toString() {
        return "Valuation{" +
                "price=" + price +
                ", yearValuation=" + yearValuation +
                '}';
    }
}

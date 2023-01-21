public class TraderTest {
    public static void main(String[] args) {
        Trade kTrade = new Trade("K4", "kDot", 40, 20.50);
        Account kDot = new Account(1000);
        Trader Moon = new Trader("kDot",kDot);

        Moon.addTrade(kTrade);
        System.out.println(kDot.getTotalValue());

    }


}

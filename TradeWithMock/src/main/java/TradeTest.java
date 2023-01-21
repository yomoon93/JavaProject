public class TradeTest {

    public static void main(String[] args) {
        Trade[] newTrade = {
                new Trade("K1", "NIO", 1000, 19.40),
                new Trade("K2", "PYPL", 200, 90.40),
                new Trade("K3", "AAPL", 200, 90.40),

        };
//        Trade happy = new Trade("K1", "NIO", 1000, 19.40);
//        Trade KTrade =    new Trade("K2", "PYPL", 200, 90.40);
// why this doesnt work the other way
            double sum = 0.0;
        for( Trade x: newTrade){
            System.out.println(x);
            sum += x.getQuantity() * x.getPrice();
            System.out.println(sum);
        }
        System.out.printf(" The total value of stocks are : %.2f\n ",sum);

//            newTrade.setPrice(-12.00);
        System.out.println(newTrade[0].getPrice());
//            System.out.println(newTrade);


    }

}

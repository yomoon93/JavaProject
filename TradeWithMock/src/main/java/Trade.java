public class Trade {
    String iD;
    String name;
    double price;
    int quantity;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public Trade(String tradeId,String tradeName, int tradeQuantity, double tradePrice){
        this.iD = tradeId;
        this.name = tradeName;
        this.quantity = tradeQuantity;
        this.price = tradePrice;

    }
    public Trade(String tradeId,String tradeName, int tradeQuantity, MallonExchange m){
        this.iD = tradeId;
        this.name = tradeName;
        this.quantity = tradeQuantity;
        this.price = m.getPrice(tradeId,tradeQuantity);

    }





    public String toString(){
        return "The id is:" + iD + " the quantity is: " + quantity + " the price for each individual: " + price;
    }

}

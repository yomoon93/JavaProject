public class Trader {
    String name;
    Account newAccount;

    //getters and setters

    public Trader(String tname, Account tAccount){
        this.name = tname;
        this.newAccount = tAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getNewAccount() {
        return newAccount;
    }

    public void setNewAccount(Account newAccount) {
        this.newAccount = newAccount;
    }

    public void addTrade(Trade t){
        // we create a variable for the sum
        double sum;
        // we take the sum and equal it to the getter method
        // instance of account plus the getTotalValue
        sum = newAccount.getTotalValue();
        // we add the sum and the trade getPrice and trade getQuantity
        sum += t.getPrice() * t.getQuantity();
        newAccount.setTotalValue(sum);
    }

}

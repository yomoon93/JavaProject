import java.awt.*;

 public class BankAccount implements Drawable {

    double balance;
    int accountNumber;
    int x,y;

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
public BankAccount(double balance, int accountNumber, int x, int y){
        this.x = x;
        this.y = y;
        this.balance = balance;
        this.accountNumber = accountNumber;
}
     public void draw(Graphics x) {
         x.setColor(Color.red);
        x.drawString("Bank Account: " + accountNumber + " Balance: " + balance, getX(),getY());
    }
    public String toString(){
        return  "Account Number: "+ accountNumber +" The balance is: " + balance;
    }

}

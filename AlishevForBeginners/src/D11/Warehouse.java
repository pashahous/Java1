package D11;

public class Warehouse {
    private  int countOrder;
    private double balance;


    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public  double getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }
}

package D11;

public class Courier implements Worker {
    private double salary;
    private Warehouse warehouse;
    private boolean isTakeBonus = false;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (!isTakeBonus &&  warehouse.getBalance() >= 1_000_00) bonus();
    }


    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void bonus() {
        salary *= 2;
        isTakeBonus = true;
        System.out.println("  bonus take " + this + "  bonus take");
    }

    public  double getSalary() {
        return salary;
    }
}

package D11;

public class Picker implements Worker {
    public double salary;
    private Warehouse warehouse;

    private boolean isTakeBonus = false;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder((int) (warehouse.getCountOrder() + 1));
        if (!isTakeBonus && warehouse.getCountOrder() > 1500) {
            bonus();

        }

    }


    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void bonus() {
        salary *= 3;
        isTakeBonus = true;
        System.out.println(this + "  bonus take");
    }
}

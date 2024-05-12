package D11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker0 = new Picker(warehouse);
        Courier courier0 = new Courier(warehouse);

        System.out.println(courier0);
        for (int i = 0; i < 100; i++) {
            courier0.doWork();
        }
        System.out.println(courier0);
        courier0.doWork();
        System.out.println(courier0);
        System.out.println("------------------------");

        System.out.println(picker0);
        for (int i = 0; i < 1500; i++) {
            picker0.doWork();
        }
        System.out.println(picker0);
        picker0.doWork();
        System.out.println(picker0);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM- HH:mm");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }
}

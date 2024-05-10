package d2;

import java.util.*;

public class D3 {
    public static void main(String[] args) {
        task3(4);

    }
    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        Map<String,String> listCountrys   = new HashMap<>();
        listCountrys.put("москва","россия");
        listCountrys.put("владивосток","россия");
        listCountrys.put("ростов","россия");
        listCountrys.put("рим","италия");
        listCountrys.put("милан","италия");
        listCountrys.put("тур","италия");
        listCountrys.put("ливерпуль","англия");
        listCountrys.put("манчестер","англия");
        listCountrys.put("лондон","англия");
        listCountrys.put("кельн","германия");
        listCountrys.put("мюнхен","германия");
        listCountrys.put("берлин","германия");
        String str = "";
        while (true){
            System.out.println("Введите город");
           str = scanner.nextLine().toLowerCase();
           if (str.equals("stop")) break;
            String value = listCountrys.get(str);
            System.out.println(value);


        }

    }
    public static void task3(int i){
        int count = 0;
        Scanner scr = new Scanner(System.in);
        double num1=0;
        double num2 = 0;
        while (count<i){
            System.out.println("Inptu 2 numbers");
            String [] str = scr.nextLine().split(" ");
            if (str.length !=2) {
                System.out.println("Invalid input");
                continue;
            }

            try {
                num1 = Double.parseDouble(str[0]);
                num2 = Double.parseDouble(str[1]);
            } catch (NumberFormatException e) {
                System.out.println("IllegalFormatException");;
            }
            if (num2 == 0)continue;
            System.out.println(num1/num2);


        }

    }

}

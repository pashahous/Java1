package d2;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {

    }

    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей: ");
        int value = scanner.nextInt();

        checkLevel(value);
    }

    private static void checkLevel(int level) {
        if (level >= 1 && level <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (level >= 5 || level <= 8) {

            System.out.println("Среднеэтажный дом");
        } else if (level > 9) {
            System.out.println("Многоэтажный дом");


        }
    }
}
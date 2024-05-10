package d2;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей: ");
        int value;
        while ((value = scanner.nextInt()) >= 0) {
            checkLevel(value);
        }
    }

    private static void checkLevel(int level) {
        if (level >= 1 && level <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (level >= 5 && level <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (level >= 9) {
            System.out.println("Многоэтажный дом");

        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        String[] str = scanner.nextLine().split(" ");
        if (str.length != 2) {
            return;
        }
        int i1 = Integer.parseInt(str[0]);
        int i2 = Integer.parseInt(str[1]);

        for (int i = i1; i < i2; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println("Number: " + i);
            }

        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        String[] str = scanner.nextLine().split(" ");
        if (str.length != 2) {
            return;
        }
        int i1 = Integer.parseInt(str[0]);
        int i2 = Integer.parseInt(str[1]);
        while (i1 <= i2) {

            if (i1 % 5 == 0 && i2 % 10 != 0) {
                System.out.println("Number: " + i1);
            }
            i1++;
        }
    }
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input real number:");
        double x = scanner.nextDouble();
        if (x >= 5) {
            System.out.println(Math.pow(x, 2) - 10 / x + 7);
            return;
        }
        if (x < 5 && x > -3) {
            System.out.println((x + 3) * (Math.pow(x, 2) - 2));
            return;
        }
        System.out.println(420);
    }
}

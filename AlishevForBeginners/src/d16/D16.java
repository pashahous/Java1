package d16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class D16 {
    public static void main(String[] args) {
//        printResult(new File("src/d14/numbs.txt"));
        createTwoFile();

    }

    public static void createTwoFile() {
        Random rnd = new Random();
        int countOfNum = 1000;
        StringBuilder strbldr = new StringBuilder(countOfNum);
        int[] nums = new int[countOfNum];
        for (int i = 0; i < 1000; i++) {
            int i1 = rnd.nextInt(101);
            strbldr.append(i1 + " ");
            nums[i] = i1;
        }
        try (PrintWriter printWriter = new PrintWriter("src/d15/1.txt")) {
            printWriter.print(strbldr);
        } catch (FileNotFoundException e) {
            System.out.println("File note found");
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder(50);
        int groupOfNumToEval = 20;
        int countOfGrop = 0 ;
        float accumulator = 0;
        for (int i = 0; i < countOfNum; i++) {
            if (countOfGrop < groupOfNumToEval) {
                accumulator += nums[i];
                countOfGrop++;
            } else {
                double avr = accumulator / groupOfNumToEval;
                stringBuilder.append(avr + " ");
                accumulator = 0;
                countOfGrop = 0;
            }
        }
        try (PrintWriter printWriter = new PrintWriter("src/d15/2.txt");) {
            printWriter.print(stringBuilder);
        } catch (FileNotFoundException e) {
            System.out.println("Error create file");
            e.printStackTrace();
        }

    }

    public static void printResult(File file) {
        int countNum = 0;
        double avgSum = 0;
        try (PrintWriter pw = new PrintWriter(new File("src/d15/nummAvr.txt"))) {
            List<String> str = Files.readAllLines(Path.of(file.toURI()));
            for (String s : str) {
                String[] s1 = s.split(" ");
                for (String numStr : s1) {
                    String num = numStr.strip();
                    if (num.matches("\\d++")) {
                        avgSum += Double.parseDouble(num);
                        countNum++;
                    }
                }
            }
            double d = avgSum / countNum;
            pw.print(String.format("%.3f", d));

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}

package d15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class D15 {
    public static void main(String[] args) {
        printResult(new File("src/d14/numbs.txt"));

    }
    public static

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
            pw.print(String.format("%.3f",d));

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}

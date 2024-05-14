package d14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class D14 {
    public static void main(String[] args) throws FileNotFoundException {
        readFromTxtPrintSumDigits(new File("src/d14/numbs.txt"));
        System.out.println(parseFileToStringList(new File("src/d14/people.txt")));
        System.out.println(parseFileToObjList(new File("src/d14/people.txt")));
    }

    public static void readFromTxtPrintSumDigits(File file) throws FileNotFoundException {
        int expectedNumOfNumbs = 10;
        if (file.exists()) {
            try {
                List<String> strings = Files.readAllLines(Path.of(file.toURI()));
//                Stream.of(strings).forEach(str->str.spliterator(" "));
                List<Integer> integersList = new ArrayList<>();
                for (String str : strings) {
                    String[] s = str.split(" ");
                    for (String dig : s) {
                        if (dig.matches("\\d+"))
                            integersList.add(Integer.parseInt(dig.strip()));
                    }
                }
                if (integersList.size() != expectedNumOfNumbs) throw
                        new IllegalArgumentException(MessageFormat.
                                format("Неверное количество входных элементов. {0} А должно быть - {1}",
                                        integersList.size(), expectedNumOfNumbs));
                int sumNums = integersList.stream().mapToInt(Integer::intValue).sum();
                System.out.println(sumNums);

            } catch (IOException e) {
                throw new RuntimeException("Error read file", e);
            }
        } else
            System.out.println("File not exist");
        ;
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> returnList = new ArrayList<>();
        try {
            List<String> stringList = Files.readAllLines(Path.of(file.toURI()));
            for (String str : stringList) {
                returnList.add(str);
            }


        } catch (IOException e) {
            throw new RuntimeException("File not found or error read from file", e);
        }
        return returnList;
    }

    public static List<People> parseFileToObjList(File file) {
        List<People> returnList = new ArrayList<>();
        try {
            List<String> stringList = Files.readAllLines(Path.of(file.toURI()));
            for (String str : stringList) {
                String[] s = str.split(" ");
                int age = Integer.parseInt(s[1].strip());
                String name = s[0].strip();
                if (age < 0)  {throw  new IllegalArgumentException("Некорректный входной файл age= "+ age);
                }
                else {
                    returnList.add(new People(age, name));
                }
            }


        } catch (IOException e) {
            throw new RuntimeException("File not found or error read from file", e);
        } catch ( IllegalArgumentException e){
            e.printStackTrace();
        }
        return returnList;
    }
}

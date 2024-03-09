package JavaSelfeduOOP.StringBufferStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringBufferBuilder {
    public static void main(String[] args) {

        var concat = new ConcateWithStringBuilder();
        String[] testList = {"1", "2", "3", "4", "5", "6"};
        String concateString = concat.concateWithStringBuilder(testList);
        System.out.println(concat.concateWithStringBuilder(Arrays.asList("1", "2", "3", "4", "5", "6")));
        System.out.println(concat.concateWithStringBuilder(testList));
        var arraysString = "мор мама папа ром дима трос ром котик сорт амид".split(" ");

        System.out.println(
                obrashennieSlova(arraysString)
        );


    }

    static class ConcateWithStringBuilder {

        public ConcateWithStringBuilder() {
        }

        public String concateWithStringBuilder(List<String> stringList) {
            /* Объеденяет все входящие строки */
            var finalString = new StringBuilder();
            for (String string : stringList) {
                finalString.append(string + " ");
            }
            return finalString.toString();

        }

        public String concateWithStringBuilder(String[] stringList) {
            var finalString = new StringBuilder();
            for (String s : stringList) {
                finalString.append(s + " ");
            }
            return finalString.toString();
        }

    }

    static ArrayList<String> obrashennieSlova(String[] arrayOfString) {
        //String[] words = "мор мама папа дима трос ром котик сорт".split(" ");
         /* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример, "мор"-"ром", "трос"-"сорт"
*/
        var listOfWordsResult = new ArrayList<String>();
        StringBuilder secondWord = new StringBuilder();
        for (int i = 0; i < arrayOfString.length - 1; i++) {
            for (int j = i + 1; j < arrayOfString.length; j++) {
                StringBuilder reverse = secondWord.append(arrayOfString[j]).reverse();
                if (arrayOfString[i].equals(reverse.toString())) {
                    listOfWordsResult.add(arrayOfString[i].toString());
                    listOfWordsResult.add(arrayOfString[j].toString());
                }
                secondWord.setLength(0);
            }
        }
        return listOfWordsResult;
    }

    static ArrayList<String> obrashennieSlovaWithHashMap(String[] arrayOfString) {
        //проходим по всему массиву и добавление всех слов в HashMap
        //TODO доделать реализацию на хешмапе
        var hashMappPullOffString = new HashMap<String, String>();
        for (String word : arrayOfString) {

        }
        return null;
    }
}

package finalProject;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scr;

    public ConsoleReader() {
        this.scr = new Scanner(System.in);;
    }

    public String reader() {
        while (true) {
            String str = scr.nextLine();
            System.out.println("Out: " + str);
            //return str;
        }
     }

}

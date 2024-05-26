package gb.sem1.levl2.les6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TryWithResurses {
    private final static int PORT = 8189;
    private static ServerSocket server;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("Server started");
            try (Socket socket = server.accept();
                 Scanner scr = new Scanner(socket.getInputStream());
                 PrintWriter printWriter = new PrintWriter(socket.getOutputStream();) {

                System.out.println("Client connected " + socket.getPort());
                String msg = null;
                while (true) {
                    msg = scr.nextLine();
                    printWriter.println("Echo: " + msg);
                    printWriter.flush();

                    if (msg.equals("/end")) {
                        System.out.println("Client disconected");
                        scr.close();
                        break;
                    }
                    System.out.println("Client msg: " + msg);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package gb.sem1.levl2.les6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private final static int PORT = 8189;
    private static ServerSocket server;
    private static Socket socket;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");
            socket = server.accept();
            System.out.println("Client connected "+socket.getPort());

            Scanner scr = new Scanner(socket.getInputStream());
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
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

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                server.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

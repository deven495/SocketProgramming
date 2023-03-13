package ChatServer.test1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1111);
            System.out.println("Server is waiting for the Client");

            Socket s = ss.accept();
            System.out.println("Client Fount, Balle Balle");

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strClient = "", strServer = "";
            while (!strClient.equals("bye")) {
                System.out.println("Client : " + din.readUTF());

                strServer = br.readLine();
                dos.writeUTF(strServer);
                dos.flush();
            }
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

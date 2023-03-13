package ChatServer.test1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("103.183.30.160", 1111);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String strClient = "", strServer = "";
            while (!strClient.equals("bye")) {
                strServer = br.readLine();
                dos.writeUTF(strServer);
                dos.flush();

                System.out.println("Client : " + din.readUTF());

            }
            dos.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

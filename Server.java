import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1111);
            System.out.println("Waiting---------------------------");
            ss.accept();
            System.out.println("Client found :--------------------)");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

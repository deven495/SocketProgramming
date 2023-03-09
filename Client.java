import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("103.183.30.160", 1111);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
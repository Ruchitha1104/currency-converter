import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class CurrencyServer {

    public static void main(String[] args) throws Exception {

        HttpServer server =
            HttpServer.create(
                new InetSocketAddress(8080), 0);

        System.out.println("Currency Server Started!");
        System.out.println("Server running on port 8080");

        server.start();
    }
}
import javax.swing.*;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by stferfab on 20.03.2017.
 */
public class HelloClient {
    public static void main(String[] args) {
        try {


// Get remote object reference
            Registry registry = LocateRegistry.getRegistry("127.0.0.1");
            Hello h = (Hello) registry.lookup("Hello1");
// Remote method invocation
            String res = h.sayHello();
            System.out.println(res);
        } catch (Exception e) {
            System.err.println("Error on client: " + e);
        }


    }
}
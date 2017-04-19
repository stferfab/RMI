import javax.swing.*;
import java.io.FilePermission;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class QuadratServer {


        public static void main(String[] args) {



            try {
                LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
                Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
// Create a Hello remote object

                QuadratImpl h = new QuadratImpl();
                Quadrat h_stub = (Quadrat) UnicastRemoteObject.exportObject(h, 0);
// Register the remote object in RMI registry with a given identifier

                registry.bind("Quadrat1", h_stub);
                System.out.println("Server ready");
            } catch (Exception e) {
                System.err.println("Error on server :" + e);
                e.printStackTrace();

            }
        }
    }


import javax.swing.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class QuadratClient {
    public static void main(String[] args) {
        try {
            double zahl = Double.parseDouble (JOptionPane.showInputDialog(
                    "Zahl dessen Quadrat Sie wollen bitte eingeben:\n"));
            String name = JOptionPane.showInputDialog(
                    "Name der Servermaschine eingeben(Quadrat1):\n");

// Get remote object reference
            Registry registry = LocateRegistry.getRegistry("127.0.0.1");

            Quadrat h = (Quadrat) registry.lookup(name);
// Remote method invocation
            double result = h.getQuadrat(zahl);
            System.out.println("Ergebnis: "+result);
        } catch (Exception e) {
            System.err.println("Error on client: " + e);
        }


    }
}

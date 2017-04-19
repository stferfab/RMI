import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;


public class QuadratImpl implements Quadrat {



        public double getQuadrat (double zahl)
                throws RemoteException {
            return zahl*zahl;
        }

}

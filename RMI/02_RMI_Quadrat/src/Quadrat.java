import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Quadrat extends Remote {

        public double getQuadrat(double zahl) throws RemoteException;



}

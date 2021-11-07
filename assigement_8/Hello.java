import java.rmi.RemoteException;
import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.server.UnicastRemoteObject;
public interface Hello extends Remote {

    public String hello( String name ) throws RemoteException;

    
    public int countWords(String str) throws RemoteException;
    
}

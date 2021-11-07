

import java.net.MalformedURLException;
import java.nio.channels.ScatteringByteChannel;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class RMIClient {
    public static void main(String[] args) throws NotBoundException, MalformedURLException  {
         try {
          
            Hello hello = (Hello) Naming.lookup("rmi://localhost:5001/hello");
            System.out.println(hello.hello("dinh van duy"));
            
        } catch ( RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      
    }
    
}

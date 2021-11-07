
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello  {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    
    protected HelloImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public String hello(String name) throws RemoteException {
        // TODO Auto-generated method stub
        StringBuilder str = new StringBuilder(name);
        System.out.println(str.reverse().toString());
        return "Chuoi dao nguoc la :  "+str;
    }
    // public static int countWords(String str) {
       
        
    // }
    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost:5001/hello", new HelloImpl());
            System.out.println("server da san sang");
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    

    @Override
    public int countWords(String str) throws RemoteException {
        // TODO Auto-generated method stub
        if (str == null) {
            return -1;
        }
        int count = 0;
        int size = str.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != SPACE && str.charAt(i) != TAB 
                    && str.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        System.out.println(" so ky tu là ");
        return count;
      
    }
    
}

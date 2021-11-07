
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEChoserver3{

  public static void main(String[] args) {
    try {
        ServerSocket ss = new ServerSocket(6789);
        System.out.println(" Server  song song ON ! ");
     
            while (true) {
                try {
                    Socket s = ss.accept();
                    Processing2 p = new Processing2(s);
                    p.start();
             
                } catch (Exception e) {
                    //TODO: handle exception
                }
               
            }
        
    } catch (Exception e) {
        //TODO: handle exception

        System.out.println("Connection Error 2 ");

    }
  }  
}

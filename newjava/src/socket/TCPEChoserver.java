import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEChoserver {
    

  public static void main(String[] args) {
    try {
        ServerSocket ss = new ServerSocket(2222);
        System.out.println(" Server ON ! ");
        try {
            while (true) {
                Socket s = ss.accept();
                OutputStream os = s.getOutputStream();
                InputStream is = s.getInputStream() ;
                int ch = 0 ;
                while (true) {
                    ch = is.read();
                    if ( ch == -1) break ;
                    System.out.println((char) ch);
                    Thread.sleep(1000);

                    os.write(ch);
                    
                }
                s.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Connection Error 1 ");
        }
          
    } catch (Exception e) {
        //TODO: handle exception

        System.out.println("Connection Error 2 ");

    }
  }  
}

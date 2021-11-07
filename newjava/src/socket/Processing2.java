import java.io.*;
import java.net.Socket; 


public class Processing2 extends Thread {
    Socket s ;
    public Processing2 (Socket s) {
      this.s = s ;

        
    }  
    public void run() {
        try {
            
            OutputStream os = s.getOutputStream() ;
            InputStream is = s.getInputStream() ;

            while(true){
                int n = is.read();
                System.out.println((char) n );
                Thread.sleep(1000);
                if ( n== -1 ) break ;
                os.write(n);
            } s.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }  
}
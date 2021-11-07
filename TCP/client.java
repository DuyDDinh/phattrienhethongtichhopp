
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 6789);
            System.out.println(" Client have  ON ! ");
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream() ;
            for( int i = '0' ; i <= '9';i++)
            {
                os.write(i);
                int ch = is.read();
                     System.out.println((char) ch );
                     Thread.sleep(1000);
                
            }    
            if ( s!= null){
                s.close();
            } 
           
              
        } catch (Exception e) {
            //TODO: handle exception
    
            System.out.println("Connection Error 2 ");
    
        }
    }
    
}

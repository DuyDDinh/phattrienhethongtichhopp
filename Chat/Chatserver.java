import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.Scanner;
import java.net.Socket;

public class Chatserver {
    public static void main(String[] args) throws IOException{

    ServerSocket serverSocket = new ServerSocket(3333);
    Socket socket =serverSocket.accept();
    DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
    DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
    System.out.println(" Server ON!");
    Scanner scanner = new Scanner(System.in);
   

        while(true){
            

            String str = dataInputStream.readUTF();
            if (str.equals("q")){
                break ;
            }
    
            System.out.println(" Clent : " +str );
            String str2 = scanner.nextLine();
            dataOutputStream.writeUTF(str2);
            dataOutputStream.flush();
        }
  
    socket.close();
    dataInputStream.close();
    dataOutputStream.close();

    }
}
        
    


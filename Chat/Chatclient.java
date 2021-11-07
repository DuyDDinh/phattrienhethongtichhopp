import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Chatclient {
    public static void main(String[] args) throws IOException  {
        Socket socket = new Socket("localhost",3333);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            if ( str.equals("q")){
                break;
            }
            String str2 =dataInputStream.readUTF();

            System.out.println("Server : "+ str2);
            
        }
        socket.close();
        dataInputStream.close();
        dataOutputStream.close();

    }
}

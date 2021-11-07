import java.io.*;
import java.net.Socket; ]
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Process extends Thread {
    Socket socket ;
    public Process (Socket socket){
        this.socket = socket ;
    

    }
    public void run() {
        try {
            

            String str = scanner.nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            if ( str.equals("q")){
                break;
            }
            String str2 =dataInputStream.readUTF();

            System.out.println("Server : "+ str2);
        } catch (Exception e) {
            //TODO: handle exception
        }
    } 


    
}

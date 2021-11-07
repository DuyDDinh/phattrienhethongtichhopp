

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class bai9sv extends Thread{
    private static final int port=1991;
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(port);
            System.out.println("server is connecting...............");
            //Socket s;
            while (true) {
                try {
                    Socket s=ss.accept();
                    System.out.println("Client is connecting.............");
                    bai9thread file=new bai9thread(s);
                    file.start();
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Client connection fail!");
                }
                

                
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Server connection fail! "); 
        }
    }
}

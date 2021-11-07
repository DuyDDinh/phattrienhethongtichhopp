

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class bai9client {
    private static final int port=1991;
    private static final String address="localhost";
    public static void main(String[] args) {
        try {
            Socket s=new Socket(address, port);
            System.out.println("Client connecting............");
            while (true) {
                
                //gui du lieu cho server
                OutputStream os =s.getOutputStream();
                Scanner sc=new Scanner(System.in);
                System.out.print("nhap file can doc: ");
                String outputStr=sc.nextLine();
                
                System.out.print("nhap duong dan: ");
                String outputLink=sc.nextLine();
                String output=outputLink+"/"+outputStr;

                os.write(output.getBytes());

                //nhan noi dung file 
                System.out.println("Noi dung la:");
                while (true) {
                    InputStream is=s.getInputStream();
                    byte[] inputbyte=new byte[60000];
                    int length=is.read(inputbyte);
                    String inputStr=new String(inputbyte, 0, length);
                    System.out.println(inputStr+"\n");

                }
                
            }
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Client connection fail! ");
        }
    }
}
